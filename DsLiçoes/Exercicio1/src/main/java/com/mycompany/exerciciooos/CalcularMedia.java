package com.mycompany.exerciciooos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */

    public class CalcularMedia {
        public static void main(String[] args) {
        
    //Chmando o Objeto
    mediaAluno func= new mediaAluno();
      
       
    String nome = JOptionPane.showInputDialog("Digite seu Nome");
    JOptionPane.showMessageDialog(null, " Veja suas informações "+nome+"!!");
    
    //chmando as funções
    func.lerNota();
        func.calcMedia();
        
        }
    }

