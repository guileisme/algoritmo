package tree;

import java.util.ArrayList;
import java.util.List;

import estrut.EstruturaElementar;

public class BinarySearchTree implements EstruturaElementar{

    private No raiz;
    @Override
    public boolean buscaElemento(int valor) {
        if (raiz == null){
            return false;
        }
        No atual = raiz;
        while (atual != null){
            if (atual.getValor() == valor){    
                return true;
            } else if (atual.getValor() < valor){
                atual = atual.getDireita(); 
            } else {
                atual = atual.getEsquerda(); 
            }
        }
        return false;
    }

    @Override
    public void insereElemento(int valor) {
        if (raiz == null){
            No novoNo = new No(valor);
            raiz = novoNo;
            return;
        }
        No atual = raiz;
        while (atual != null){
            if (atual.getValor() < valor){
                if (atual.getDireita() == null){
                    No novoNo = new No(valor);
                    atual.setDireita(novoNo);
                    return;
                }
                atual = atual.getDireita(); 
            } else {
                if (atual.getEsquerda() == null){
                    No novoNo = new No(valor);
                    atual.setEsquerda(novoNo);
                    return;
                }
                atual = atual.getEsquerda(); 
            }
        }
    }

    @Override
    public List<Integer> emOrdem() {
        List<Integer> valores = new ArrayList<>();
        emOrdemRecursivo(raiz, valores);
        return valores;
    }

    private void emOrdemRecursivo(No no, List<Integer> valores){
        if (no != null){
            emOrdemRecursivo(no.getEsquerda(), valores); //visita esquerda
            valores.add(no.getValor()); //visita nó
            emOrdemRecursivo(no.getDireita(), valores); //visita direita
        }
    }

    @Override
    public List<Integer> preOrdem() 
    {
        List<Integer> valores = new ArrayList<>();
        preOrdemRecursivo (raiz, valores);
        return valores;
    }

    private void preOrdemRecursivo(No no, List<Integer> valores)
    {
        if (no != null) {
            preOrdemRecursivo(no.getEsquerda(), valores);
            preOrdemRecursivo(no.getDireita(), valores);
        }
    }

    @Override
    public void remove(int valor) 
    {
        //faça somente remover folha e um nó com um filho
        if (raiz == null){
            System.out.println("Árvore vazia");
            return;
        }
        No atual = raiz;
        while (atual != null && atual.getValor() != valor)
        {
            if (atual.getValor() < valor){
                if (atual.getDireita().getValor() == valor && (atual.getDireita().getDireita() != null && atual.getEsquerda().getEsquerda() != null) ){
                    atual.setDireita(null);
                    return;
                }
                else if (atual.getDireita().getValor() == valor && atual.getDireita().getDireita() != null)
                {
                    atual.setEsquerda(atual.getDireita().getEsquerda());
                }

                else if (atual.getDireita().getValor() == valor && atual.getDireita().getEsquerda() != null)
                {
                    atual.setDireita(atual.getDireita().getDireita());
                }
                atual = atual.getDireita(); 
            } 

            else if (atual.getValor() > valor && (atual.getDireita().getDireita() != null && atual.getEsquerda().getEsquerda() != null))
            {
                if (atual.getEsquerda().getValor() == valor && (atual.getDireita().getDireita() != null && atual.getEsquerda().getEsquerda() != null) ){
                    atual.setEsquerda(null);
                    return;
                }
                else if (atual.getEsquerda().getValor() == valor && atual.getDireita().getDireita() != null)
                {
                    atual.setEsquerda(atual.getDireita().getEsquerda());
                }

                else if (atual.getDireita().getValor() == valor && atual.getDireita().getEsquerda() != null)
                {
                    atual.setDireita(atual.getDireita().getDireita());
                }
                atual = atual.getEsquerda(); 
            }
        }
    }

    @Override
    public int minimo() {
        No atual = raiz;
        while (atual.getEsquerda() != null)
        {
            atual = atual.getEsquerda();
        }
        return 0;
    }

    @Override
    public int maximo() {
        No atual = raiz;
        while (atual.getDireita() != null)
        {
            atual = atual.getDireita();
        }
        return 0;
    }

}