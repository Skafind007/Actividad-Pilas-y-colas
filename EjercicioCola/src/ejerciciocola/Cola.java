/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciocola;

import java.util.Queue;

public class Cola {
  
      public static void agregarAcola(Queue<Cliente> cola, Cliente cliente) {
        cola.add(cliente);
      
          System.out.println("Se ha añadido a la fila de espera");
    
    }
              public static void eliminarDeCola(Queue<Cliente> cola) {
        if (!cola.isEmpty()) {
            Cliente clienteEliminado = cola.remove();
            System.out.println("Cliente atendido : " + clienteEliminado.getNombre()+" - - -Siguiente");
        } else {
            System.out.println("La cola está vacía.");
        }   
          }
   public static int obtenerTamanoCola(Queue<Cliente> cola) {
        return cola.size();
    }}  

