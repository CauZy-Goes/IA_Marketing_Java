package br.com.mariojp.exemplos.marketing;

import br.com.mariojp.ai.agent.AbstractState;

/**
 * 
 * @project AgenteFW
 * @package br.com.mariojp.exemplos.aspirador
 * @file Estado.java
 * @author Mario Jorge Pereira
 * @version 1.1
 * <p>Classe que representa a o Ambiente para o problema do Aspirador</p>
 *
 */
public class Estado extends AbstractState {

	/**
	 * Constantes 
	 */
	//Areas da para investir
	public static final int TV = 0;
	public static final int REDES_SOCIAIS = 1;
	//Nivel de retorno dos investimentos
	public static final int RETORNO_ALTO = 0;
	public static final int RETORNO_MEDIO = 1;
	public static final int RETORNO_BAIXO = 2;
	//limite ate os retorno reduzir o valor
	public static final int LIMITE_RETORNO_ALTO = 1000;
	public static final int LIMITE_RETORNO_MEDIO = 1500;
	public static final int LIMITE_RETORNO_BAIXO = 2000;
	//Valor que é retornado
	public static final int VALOR_RETORNO_ALTO = 100;
	public static final int VALOR_RETORNO_MEDIO = 50;
	public static final int VALOR_RETORNO_BAIXO = 25;
	//valor de investimento padrao
	public static final int INVESTIMENTO_PADRAO = 100;
	
	private int areaAtual;
	private int nivelRetornoTv = 0;
	private int nivelRetornoRedesSociais = 0;
	private int investimentoTv = 0;
	private int investimentoRedesSociais = 0;
	private int totalRetornoTv = 0;
	private int totalRetornoRedesSociais = 0;
	private int orcamentoDisponivel;

	 public Estado(){
	 }

	  public Estado(int areaAtual, int orcamentoDisponivel){
		 this.areaAtual = areaAtual;
		 this.orcamentoDisponivel = orcamentoDisponivel;
	 }
	 
	//  public Estado(int areaAtual, int nivelRetorno, int investimentoTotal, int totalRetorno, 
	//  int numeroInvestimentos, int orcamentoDisponivel){
	// 	 this.areaAtual = areaAtual;
	// 	 this.nivelRetorno = nivelRetorno;
	// 	 this.investimentoTotal = investimentoTotal;
	// 	 this.totalRetorno = totalRetorno;
	// 	 this.numeroInvestimentos = numeroInvestimentos;
	// 	 this.orcamentoDisponivel = orcamentoDisponivel;
	//  }
	
    /**
    * Metodo necessario para criar copias do Estado.
    * Caso o estado tenha somente tipos primitivos, apenas copie este metodo. 
    * @return Object
    */
   public Object clone() {
       Object copia = null;
       try {
			copia = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
       return copia;
   }
	
	/**
	 * Verifica se os estados s�o iguais
	 */
	public boolean equals(Object arg0) {
        Estado outro = (Estado) arg0;
        boolean igual = false;
        if(this.getAreaAtual() == outro.getAreaAtual() &&
        	this.getOrcamentoDisponivel() == outro.getOrcamentoDisponivel() &&
        	this.getInvestimentoRedesSociais() == outro.getInvestimentoRedesSociais() &&
        	this.getInvestimentoTv() == outro.getInvestimentoTv()) {
            igual = true;
        }
        return igual;
	}

	/**
	 * Obtem a area atual 
	 * @return int - area atual
	 */
	public int getAreaAtual() {
		return areaAtual;
	}

	/**
	 * Atribui a area
	 * @param areaAtual
	 */
	public void setAreaAtual(int areaAtual) {
		this.areaAtual = areaAtual;
	}

	/**
	 * 
	 * @return int - retorna o nivel de retorno da area redes sociais
	 */
	public int getNivelRetornoRedesSociais() {
		return nivelRetornoRedesSociais;
	}

	/**
	 * Atribui o nivel de retorno da area redes sociais
	 * @param nivelRetorno
	 */
	public void setNivelRetornoRedesSociais(int nivelRetornoRedesSociais) {
		this.nivelRetornoRedesSociais = nivelRetornoRedesSociais;
	}

	/**
	 * 
	 * @return int - retorna o nivel de retorno da area tv
	 */
	public int getNivelRetornoTv() {
		return nivelRetornoTv;
	}

	/**
	 * Atribui o nivel de retorno da area tv
	 * @param nivelRetorno
	 */
	public void setNivelRetornoTv(int nivelRetornoTv) {
		this.nivelRetornoTv = nivelRetornoTv;
	}

	/**
	 * 
	 * @return int - retorna o investimento na area tv
	 */
	public int getInvestimentoTv() {
		return investimentoTv;
	}

	/**
	 * Atribui o nivel de retorno da area de tv
	 * @param nivelRetorno
	 */
	public void setInvestimentoTv(int investimentoTv) {
		this.investimentoTv = investimentoTv;
	}

	/**
	 * 
	 * @return int - retorna o investimento na area redes sociais
	 */
	public int getInvestimentoRedesSociais() {
		return investimentoRedesSociais;
	}

	/**
	 * Atribui o nivel de retorno da area de redes sociais
	 * @param nivelRetorno
	 */
	public void setInvestimentoRedesSociais(int investimentoRedesSociais) {
		this.investimentoRedesSociais = investimentoRedesSociais;
	}

	/**
	 * 
	 * @return int - retorna o retorno total da area tv
	 */
	public int getTotalRetornoTv() {
		return totalRetornoTv;
	}

	/**
	 * Atribui retorno da area de tv
	 * @param nivelRetorno
	 */
	public void setTotalRetornoTv(int totalRetornoTv) {
		this.totalRetornoTv = totalRetornoTv;
	}

	/**
	 * 
	 * @return int - retorna o retorno total da area redes sociais
	 */
	public int getTotalRetornoRedesSociais() {
		return totalRetornoRedesSociais;
	}

	/**
	 * Atribui retorno da area de redes sociais
	 * @param nivelRetorno
	 */
	public void setTotalRetornoRedesSociais(int totalRetornoRedesSociais) {
		this.totalRetornoRedesSociais = totalRetornoRedesSociais;
	}

	/**
	 * 
	 * @return int - orcamento disponivel
	 */
	public int getOrcamentoDisponivel() {
		return orcamentoDisponivel;
	}


	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Sala Direita: ");
		sb.append((this.getSalaDireita()==Estado.SALA_LIMPA)?"SALA LIMPA":"SALA SUJA");
		sb.append("\n");
		sb.append("Sala Esquerda: ");
		sb.append((this.getSalaEsquerda()==Estado.SALA_LIMPA)?"SALA LIMPA":"SALA SUJA");
		sb.append("\n");
		sb.append("Aspirador: ");
		sb.append((this.getSalaAtual()==Estado.SALA_DIREITA)?"SALA DIREITA":"SALA ESQUERDA");
		sb.append('\n');
		return sb.toString();
	}

}
