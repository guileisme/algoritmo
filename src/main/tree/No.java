package tree;

public class No {

  private int valor;
  private No esquerda;
  private No direita;

  public No(int valor) {
    this.valor = valor;
    this.esquerda = null;
    this.direita = null;
  }

  public int getValor() {
    return valor;
  }

  public No getDireita() {
    return direita;
  }

  public No getEsquerda() {
    return esquerda;
  }

  public void setDireita(No novoNo) {
    direita = novoNo;
  }

  public void setEsquerda(No novoNo) {
    esquerda = novoNo;
  }

}
