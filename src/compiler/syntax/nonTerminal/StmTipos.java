package compiler.syntax.nonTerminal;

public class StmTipos extends NonTerminal {
	
	private SentTipo sentTipo;
	
	/*
	 * Constructor StmTipos por defecto
	 */
	public StmTipos() {
		super();
	}

	/*
	 * Constructor StmTipos con SentTipo
	 */
	public StmTipos(SentTipo sentTipo) {
		super();
		this.sentTipo = sentTipo;
	}

	/*
	 * Devuelve sentTipo
	 */
	public SentTipo getSentTipo() {
		return sentTipo;
	}
	
	/*
	 * Modifica sentTipo
	 */
	public void setSentTipo(SentTipo sentTipo) {
		this.sentTipo = sentTipo;
	}

	
}
