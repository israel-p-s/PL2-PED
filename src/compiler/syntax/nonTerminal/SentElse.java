package compiler.syntax.nonTerminal;

public class SentElse extends NonTerminal {

	private Sentencias sentencias;
	
	/*
	 * Constructor SentElse por defecto
	 */
	public SentElse() {
	}
	
	/*
	 * Constructor SentElse con sentencias
	 */
	public SentElse(Sentencias sentencias) {
		super();
		this.sentencias = sentencias;
	}

	/*
	 * Devuelve sentencias
	 */
	public Sentencias getSentencias() {
		return sentencias;
	}

	/*
	 * Modifica sentencias
	 */
	public void setSentencias(Sentencias sentencias) {
		this.sentencias = sentencias;
	}
	
}
