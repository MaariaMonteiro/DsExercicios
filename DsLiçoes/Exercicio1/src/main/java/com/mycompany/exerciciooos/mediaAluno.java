package com.mycompany.exerciciooos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author dti
 */
 import javax.swing.JOptionPane;

   
public class mediaAluno {
   
    double n1;
    double n2;
     double media;
    
     //metodo para ler a nota
    void lerNota(){
        
        
           n1=Double.parseDouble(JOptionPane.showInputDialog("Digite sua 1° nota"));
           n2=Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota"));
          
    }
    void calcMedia(){
       
         media=(n1+n2)/2;
     
    //condições para aprovação
    if(media>=7){
         
    JOptionPane.showMessageDialog(null, "Você foi aprovado!!");
     JOptionPane.showMessageDialog(null, "Sua média é "+media);
}
    else{
        JOptionPane.showMessageDialog(null, "Você foi reprovado! :(");
         JOptionPane.showMessageDialog(null, "Sua média é "+media);
    }
}

}

