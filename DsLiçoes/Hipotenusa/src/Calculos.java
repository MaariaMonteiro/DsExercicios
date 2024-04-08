/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aange
 */
import javax.swing.JOptionPane;
public class Calculos {
    double altura;
    double base;
    double Hipotenusa;
    
    //criando o método
    
    void Hipotenusa(){
        base=Double.parseDouble(JOptionPane.showInputDialog("Olá!! \n digite o valor da base para calcularmos a Hipotenusa."));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Agora digite o valor da altura para calcularmos a Hipotenusa."));
        
        //Calculo da hipotenusa
        Hipotenusa= (base * base) + (altura * altura);
        
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é " +Hipotenusa+ "Cm");
    }
}
