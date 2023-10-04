package com.company;

import javax.swing.*;

public class Conversor extends JFrame{
    private JPanel mainPanel;

    //Método Construtor
    public Conversor(String tittle){
        //Chama o construtor de JFrame
        super(tittle);
        //Faz o programa encerrar ao fechar a janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Adiciona o Panel criado para a janela
        this.setContentPane(mainPanel);
        //Ajusta os tamanhos mínimos dos componentes
        this.pack();
    }

    public static void main(String[] args) {
        System.out.println("Oi!");
        //Inicia o frame
        JFrame frame = new Conversor("Título");
        //Torna-o visível
        frame.setVisible(true);
    }
}
