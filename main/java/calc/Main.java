package calc;


import calc.gen.gError;
import calc.gen.gLexer;
import calc.gen.gParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String[] lines;
        gLexer lexer;
        CommonTokenStream tokens;
        gParser parser;
        ParseTree tree;
        gError error = new gError();
        CalcListener calc = new CalcListener();
        FileParser file = new FileParser();

        file.setLines(args[0]);
        lines = file.getLines();

        for (int i = 0; i < lines.length; i++) {
            lexer = new gLexer(CharStreams.fromString(lines[i]));
            System.out.println("PŘÍKLAD: " + lines[i]);

            lexer.removeErrorListeners();
            lexer.addErrorListener(error);
            tokens = new CommonTokenStream(lexer);
            parser = new gParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(error);
            tree = parser.g();

            //lexer;parser
            if (error.isError()) {
                System.err.println("CHYBA NA ŘÁDKU Č. " + (i + 1));
                error.displayErrMsg();
                error.set();
            } else {
                try {
                    ParseTreeWalker.DEFAULT.walk(calc, tree);
                } catch (IllegalArgumentException e) {
                    System.err.println("CHYBA NA ŘÁDKU Č. " + (i + 1));
                    System.err.println(e.getMessage());
                }
            }
        }
        System.out.println();
        System.out.println("VÝSLEDKY PŘÍKLADŮ:");
        for (Num num : calc.stack) {
            if (num.value == (long) num.value) {
                System.out.println((long) num.value);
            } else {
                System.out.println(num.value);
            }
        }
        System.out.println();
        System.out.println("PROMĚNNÉ A JEJICH HODNOTY:");
        for(Var var : calc.vars) {
            System.out.println(var.name + " = " + var.num.value);
        }
        System.out.println();
    }
}