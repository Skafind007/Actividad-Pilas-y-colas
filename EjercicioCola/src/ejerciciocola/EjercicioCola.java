/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocola;

import static ejerciciocola.Cola.agregarAcola;
import static ejerciciocola.Cola.eliminarDeCola;
import static ejerciciocola.Cola.obtenerTamanoCola;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author skafi
 */
public class EjercicioCola {

  
    public static void main(String[] args) {
          Queue<Cliente> Cola = new LinkedList<>();
          for (int i = 0; i < 100; i++) {
         String pre=JOptionPane.showInputDialog("Desea entrar a la cola (Digite Si o No)");
                
              if (pre.equals("Si")) {
                  Cliente cliente1 = new Cliente();
        cliente1.PedirNombre();
        agregarAcola(Cola, cliente1);
              }else {
                 
                   eliminarDeCola(Cola);
                      int tamanoCola = obtenerTamanoCola(Cola);
        System.out.println("Tamaño de la cola: " + tamanoCola); 
              }
   }}
    }





          
    