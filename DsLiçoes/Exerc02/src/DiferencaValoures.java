


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aange
 */
    import javax.swing.JOptionPane;
public class DiferencaValoures {
    
    
    
    public static void main(String[] args) {
           
        Valoures func= new Valoures();
        
        //comunicação com o usuario
        String nome = JOptionPane.showInputDialog("Digite seu Nome");
                JOptionPane.showMessageDialog(null, "Veja a diferença de dois valores "+nome+"!");
                
                func.diferença();
    }
}

