import tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insereElemento(10);
        b.insereElemento(1);
        b.insereElemento(5);
        b.insereElemento(20);
        b.insereElemento(14);
        b.insereElemento(25);
        b.insereElemento(23);
        b.insereElemento(6);
        b.insereElemento(3);
        b.insereElemento(2);
        b.insereElemento(-1);
        boolean b2 = b.buscaElemento(25);
        System.out.println(b2);
        System.out.println(b.emOrdem());
        b.remove(25);
        b2 = b.buscaElemento(25);
        System.out.println(b2);
        System.out.println(b.emOrdem());
    }

}
