package compiler.syntax.nonTerminal;

public class StmVar extends NonTerminal {

	private SentVar sentVar;

	/*
	 * Constructor StmVar por defecto
	 */
	public StmVar() {
		super();
	}
	
	/*
	 * Constructor StmVar con SentVar
	 */
	public StmVar(SentVar sentVar) {
		super();
		this.sentVar = sentVar;
	}

	/*
	 * Devuelve sentVar
	 */
	public SentVar getSentVar() {
		return sentVar;
	}

	/*
	 * Modifica sentVar
	 */
	public void setSentVar(SentVar sentVar) {
		this.sentVar = sentVar;
	}
}
