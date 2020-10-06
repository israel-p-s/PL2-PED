package compiler.syntax.nonTerminal;

public class StmConstantes extends NonTerminal {
	
	private SentConst sentConst;

	/*
	 * Constructor StmConstantes por defecto
	 */
	public StmConstantes() {
		super();
	}
	
	/*
	 * Constructor StmConstantes con SentConst
	 */
	public StmConstantes(SentConst sentConst) {
		super();
		this.sentConst = sentConst;
	}

	/*
	 * Devuelve sentConst
	 */
	public SentConst getSentConst() {
		return sentConst;
	}

	/*
	 * Modifica sentConst
	 */
	public void setSentConst(SentConst sentConst) {
		this.sentConst = sentConst;
	}

	
}
