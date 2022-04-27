package calc.gen;// Generated from /Users/rubstar/IdeaProjects/untitled/g.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitG(gParser.GContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link gParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declare}
	 * labeled alternative in {@link gParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(gParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link gParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(gParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(gParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(gParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(gParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(gParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incPost}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncPost(gParser.IncPostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code abs}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs(gParser.AbsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code round}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRound(gParser.RoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(gParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenth}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenth(gParser.ParenthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(gParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(gParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ceil}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCeil(gParser.CeilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(gParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link gParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(gParser.IntContext ctx);
}