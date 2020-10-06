package compiler.syntax.nonTerminal;

public class CabModule extends NonTerminal {

	private String identificador;
	
	/*
	 * Constructor CabModule con String
	 */
	public CabModule(String identificador) {
		super();
		this.identificador = identificador;
	}

	/*
	 * Devuelve idenficador
	 */
	public String getIdentificador() {
		return identificador;
	}

	/*
	 * Modifica identificador
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	
}
