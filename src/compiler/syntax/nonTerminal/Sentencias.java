package compiler.syntax.nonTerminal;

public class Sentencias extends NonTerminal {
	
	private ListSentencia listSentencia;
	
	/*
	 * Constructor Sentencias por defecto
	 */
	public Sentencias() {
		super();
		this.listSentencia = new ListSentencia();
	}
	
	/*
	 * Constructor Sentencias con ListSentencia
	 */
	public Sentencias(ListSentencia listSentencia) {
		super();
		this.listSentencia = listSentencia;
	}

	/*
	 * Devuelve listSentencia
	 */
	public ListSentencia getListSentencia() {
		return listSentencia;
	}

	/*
	 * Modifica listSentencia
	 */
	public void setListSentencia(ListSentencia listSentencia) {
		this.listSentencia = listSentencia;
	}


}
