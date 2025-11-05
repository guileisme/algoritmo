package estrut;

import java.util.List;

public interface EstruturaElementar {
    //Métodos Consultivos
    public boolean buscaElemento(int valor);
    public int minimo();
    public int maximo();

    //Metodos Modificadores
    public void insereElemento(int valor);
    public void remove(int valor);
    List<Integer> emOrdem();
    List<Integer> preOrdem();
}
