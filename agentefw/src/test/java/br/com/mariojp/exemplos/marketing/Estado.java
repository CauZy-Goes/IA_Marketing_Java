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
	
	private int AREA_ATUAL;
	private int NIVEL_RETORNO;
	private int INVESTIMENTO_TOTAL;
	private int total_retorno;
	private int numero_investimentos;
	private int orcamento_disponivel;

	 public Estado(){
	 }
	 
	 public Estado(int salaAtual,int salaDireita, int salaEsquerda){
		 this.salaAtual = salaAtual;
		 this.salaDireita = salaDireita;
		 this.salaEsquerda = salaEsquerda;
	 }
	
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
        if(this.getSalaDireita() == outro.getSalaDireita() &&
        	this.getSalaEsquerda() == outro.getSalaEsquerda() &&
        	this.getSalaAtual() == outro.getSalaAtual()) {
            igual = true;
        }
        return igual;
	}

	/**
	 * Obtem a sala atual do aspirador (DIREITA ou ESQUERDA). 
	 * @return int - Sala Atual
	 */
	public int getSalaAtual() {
		return salaAtual;
	}

	/**
	 * Atribui a sala atual do aspirador (DIREITA ou ESQUERDA). 
	 * @param salaAtual
	 */
	public void setSalaAtual(int salaAtual) {
		this.salaAtual = salaAtual;
	}

	/**
	 * Obtem o estado da sala direita (SUJA ou LIMPA)
	 * @return int - Estado da Sala
	 */
	public int getSalaDireita() {
		return salaDireita;
	}

	/**
	 * Atribui o estado da sala direita (SUJA ou LIMPA) 
	 * @param salaDireita
	 */
	public void setSalaDireita(int salaDireita) {
		this.salaDireita = salaDireita;
	}

	/**
	 * Obtem o estado da sala esquerda (SUJA ou LIMPA)
	 * @return int - Estado da Sala
	 */
	public int getSalaEsquerda() {
		return salaEsquerda;
	}

	/**
	 * Atribui o estado da sala esquerda (SUJA ou LIMPA) 
	 * @param salaEsquerda
	 */
	public void setSalaEsquerda(int salaEsquerda) {
		this.salaEsquerda = salaEsquerda;
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
