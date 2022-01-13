// Generated from compiler5.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiler5Parser}.
 */
public interface compiler5Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(compiler5Parser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(compiler5Parser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(compiler5Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(compiler5Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(compiler5Parser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(compiler5Parser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(compiler5Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(compiler5Parser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(compiler5Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(compiler5Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(compiler5Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(compiler5Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiler5Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiler5Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(compiler5Parser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(compiler5Parser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(compiler5Parser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(compiler5Parser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(compiler5Parser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(compiler5Parser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(compiler5Parser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(compiler5Parser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(compiler5Parser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(compiler5Parser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(compiler5Parser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(compiler5Parser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(compiler5Parser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(compiler5Parser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler5Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(compiler5Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler5Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(compiler5Parser.NumberContext ctx);
}