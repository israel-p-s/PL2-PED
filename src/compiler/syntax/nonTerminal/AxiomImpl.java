package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.intermediate.LabelIF;

public class AxiomImpl extends Axiom {

	private LabelIF label;
	
	/*
	 * Contructor AxiomImpl con CabModule y Cuerpo
	 */
	public AxiomImpl(CabModule cabModule, Cuerpo cuerpo) {
		super(cabModule, cuerpo);
	}
	
	/*
	 * DevuelveLabelIF
	 */
	public LabelIF getLabel() {
		return label;
	}
	
	/*
	 * Modifica LabelIF
	 */
	public void setLabel(LabelIF label) {
		this.label = label;
	}
}
