package calc.gen;// Generated from /Users/rubstar/IdeaProjects/untitled/g.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#g}.
	 * @param ctx the parse tree
	 */
	void enterG(gParser.GContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#g}.
	 * @param ctx the parse tree
	 */
	void exitG(gParser.GContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression}
	 * labeled alternative in {@link gParser#line}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link gParser#line}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declare}
	 * labeled alternative in {@link gParser#line}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(gParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare}
	 * labeled alternative in {@link gParser#line}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(gParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link gParser#line}.
	 * @param ctx the parse tree
	 */
	void enterBlank(gParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link gParser#line}.
	 * @param ctx the parse tree
	 */
	void exitBlank(gParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(gParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(gParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(gParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(gParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(gParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(gParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(gParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(gParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incPost}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIncPost(gParser.IncPostContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incPost}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIncPost(gParser.IncPostContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abs}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAbs(gParser.AbsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abs}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAbs(gParser.AbsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code round}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRound(gParser.RoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code round}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRound(gParser.RoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(gParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(gParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenth}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenth(gParser.ParenthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenth}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenth(gParser.ParenthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(gParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(gParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(gParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(gParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ceil}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCeil(gParser.CeilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ceil}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCeil(gParser.CeilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(gParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(gParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(gParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(gParser.IntContext ctx);
}