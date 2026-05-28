/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class CasoEvaluado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido");
        String salario = JOptionPane.showInputDialog(null, "Ingrese su monto de salario");
        double salarioo = Double.parseDouble(salario);
        double gobierno = 0;
        /*if (salario < 922000 &&  > 1 352 000){
            gobierno = salario % 10;
        }
        if else (salario>1352000 && salario<2373 00){
            gobierno= salario%15;
        }else{
            gobierno= salario%20;    
            }
        
       double SEM = salario%9.25;
       double IVM = salario  5.08;
       double asociacion = salario  2.5;
       double salariototal = salarioo-SEM-IVM-asociacion-gobierno; 
        JOptionPane.showMessageDialog(null,nombre+""+apellido+ "Su monto de salario final es: "+salario+"\n Los rebajos realizados fueron:  "
                + "Seguro de Enfermedad y Maternidad: "+SEM+"Invalidez, Vejez y Muerte: "+IVM+"Impuesto al salario: "+gobierno+"Asociacion: "+asociacion);*/
        
    }
    
}
