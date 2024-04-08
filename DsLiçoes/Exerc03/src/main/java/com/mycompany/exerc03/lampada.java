/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc03;

import javax.swing.JOptionPane;

/**
 *
 * @author aange
 */
public class lampada {
 int opcoes;
    
 //criando o metodo
    void VerMostrarEstado(){
        
        //passando e pedindo informações
       opcoes =Integer.parseInt(JOptionPane.showInputDialog(" Escolha uma opção \n 1-Ligada \n 2-Desligada"));
       
       //condicao caso a opcao escolhida for inválida
       if(opcoes>2 || opcoes <1){
           JOptionPane.showMessageDialog(null, "Digite um estado válido!!");
       opcoes =Integer.parseInt(JOptionPane.showInputDialog(" Escolha uma opção \n 1-Ligada \n 2-Desligada"));
       }
       
       //condicao caso esteja certa
       else if(opcoes==1){
        JOptionPane.showMessageDialog(null, "O estado da sua lampada é ligada/Acesa");
    }
       else {
           JOptionPane.showMessageDialog(null, "O estado da sua lampada é desligada/apagada");
       }
   
           
    }
}
   

