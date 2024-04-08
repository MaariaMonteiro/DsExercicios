/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aange
 */
import javax.swing.JOptionPane;
public class Valoures {
   
    //declarando as variáveis
    double val1;
    double val2;
    double diferenca;
    double valmaior;
    double valmenor;
    
    
    void diferença(){
        val1=Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° valor"));
                val2=Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° valor"));
                
                
                if(val1>=val2){
                    //atribuindo o valor maior e menor
                  valmaior=val1;
               valmenor=val2;
                    JOptionPane.showMessageDialog(null, +valmaior+"é maior que "+valmenor);
                }
                else{
                  valmaior=val2;
                  valmenor=val1;
                    
                    JOptionPane.showMessageDialog(null, +valmaior+"é maior que "+valmenor);
                }
    
    
        //Calculando a diferença
        diferenca=valmaior-valmenor;
        JOptionPane.showMessageDialog(null, "A diferença de "+valmaior+" para "+valmenor+" é de "+diferenca);
    }
}
