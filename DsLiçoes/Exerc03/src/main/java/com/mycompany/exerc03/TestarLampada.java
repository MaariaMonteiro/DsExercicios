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
public class TestarLampada {

    public static void main(String[] args) {
            String nome;
    
        lampada func= new lampada();
        
        nome=JOptionPane.showInputDialog("Ola!\n Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Vamos ver o estado da sua lampada " +nome+"!");
        func.VerMostrarEstado();
       
        
}
}
