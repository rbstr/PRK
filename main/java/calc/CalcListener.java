package calc;

// Generated from Calc.g4 by ANTLR 4.9.2
import calc.gen.gBaseListener;
import calc.gen.gParser;

import java.util.Stack;
import java.util.ArrayList;

public class CalcListener extends gBaseListener {

    Stack<Num> stack = new Stack<>();
    ArrayList<Var> vars = new ArrayList<>();
    String assignTo;

    public Stack<Num> getStack(){
        return stack;
    }

    public Num getSameNumType(Num right, Num left) {
        Num ret;
        if (!right.isInt || !left.isInt) { ret = new Num((float)0); } else { ret = new Num((int)0); }
        return ret;
    }

    @Override
    public void exitMulDivMod(gParser.MulDivModContext ctx) {
        Num right = this.stack.pop();
        Num left = this.stack.pop();
        Num res = getSameNumType(right, left);
        switch (ctx.op.getType()) {
            case gParser.MUL:
                res.value = left.value * right.value;
                break;
            case gParser.DIV:
                res.value =  left.value / right.value;
                break;
            case gParser.MOD:
                res.value = left.value % right.value;
                break;
        }
        this.stack.push(res);
    }

    @Override
    public void exitAddSub(gParser.AddSubContext ctx) {
        Num right = this.stack.pop();
        Num left = this.stack.pop();
        Num res = getSameNumType(right, left);
        switch (ctx.op.getType()) {
            case gParser.ADD:
                res.value = left.value + right.value;
                break;
            case gParser.SUB:
                res.value = left.value - right.value;
                break;
        }
        this.stack.push(res);
    }

    @Override
    public void exitIncPost(gParser.IncPostContext ctx) {
        Num val = this.stack.pop();
        switch (ctx.op.getType()) {
            case gParser.INC:
                val.value++;
                break;
            case gParser.DEC:
                val.value--;
                break;
        }
        this.stack.push(val);
    }

    @Override
    public void exitAbs(gParser.AbsContext ctx) {
        Num val = this.stack.pop();
        Num var = new Num((int)Math.abs(val.value));
        this.stack.push(var);
    }

    @Override
    public void exitCeil(gParser.CeilContext ctx) {
        Num val = this.stack.pop();
        Num var = new Num((int)Math.ceil(val.value));
        this.stack.push(var);
    }


    @Override
    public void exitRound(gParser.RoundContext ctx) {
        Num val = this.stack.pop();
        Num var = new Num((int)Math.round(val.value));
        this.stack.push(var);
    }

    @Override
    public void exitFloat(gParser.FloatContext ctx) {
        float number = Float.parseFloat(ctx.getText().replace(",","."));
        this.stack.push(new Num(number));
    }

    @Override
    public void exitInt(gParser.IntContext ctx) {
        int number = Integer.parseInt(ctx.getText());
        this.stack.push(new Num(number));
    }



    @Override
    public void exitDecl(gParser.DeclContext ctx) {
        Num assigned = this.stack.pop();
        vars.add(new Var(ctx.getChild(1).getText(), assigned));
    }

    @Override
    public void enterAssignment(gParser.AssignmentContext ctx) {
        assignTo = ctx.getChild(0).getText();
    }

    @Override
    public void exitAssignment(gParser.AssignmentContext ctx) {
        for (Var var: vars) {
            if (var.name.equals(assignTo)) {
                var.num = this.stack.pop();
            }
        }
        assignTo = "";
    }

    @Override
    public void exitVariable(gParser.VariableContext ctx) {
        String name = new String(ctx.getText());
        boolean exists = false;
        for (Var var: vars) {
            if (var.name.equals(name)) {
                this.stack.push(var.num);
                exists = true;
                break;
            }
        }
        if (!exists) {
            System.out.println("Takova promenna neexistuje: " + name); }
    }

}
