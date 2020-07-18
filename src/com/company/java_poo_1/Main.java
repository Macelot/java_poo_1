package com.company.java_poo_1;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Produto p = new Produto();
        System.out.println(p.toString());
        p = new Produto("Notebook",1500.00f);
        System.out.println(p.toString());
        Carrinho carrinho = new Carrinho();
        System.out.println(carrinho.getP().length);
        carrinho.getP()[0]=p;

        Produto p2;
        p2 = new Produto("Pen",30.0f);
        carrinho.getP()[1]=p2;

        Armazenamento armazenamento;
        armazenamento = new Armazenamento();
        armazenamento.setNome("SSD");
        armazenamento.setUnidade("T");
//        System.out.println(armazenamento.getNome());
//        System.out.println(armazenamento.getPreco());
//        System.out.println(armazenamento.getCapacidade());
//        System.out.println(armazenamento.getUnidade());

        Armazenamento armazenamento2;
        armazenamento2 = new Armazenamento();
        armazenamento2.setCapacidade(32);

        carrinho.getP()[2]=armazenamento;
        carrinho.getP()[3]=armazenamento2;

        for (int i =0;i<carrinho.getP().length;i++){
            if(carrinho.getP()[i]!=null){
                System.out.println(carrinho.getP()[i].toString());
            }
        }

        carrinho.remove(1);
        System.out.println("-----------------");
        for (int i =0;i<carrinho.getP().length;i++){
            if(carrinho.getP()[i]!=null){
                System.out.println(carrinho.getP()[i].toString());
            }
        }
    }
}
