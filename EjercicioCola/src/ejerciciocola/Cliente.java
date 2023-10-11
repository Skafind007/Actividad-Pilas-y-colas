/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciocola;

import javax.swing.JOptionPane;

public class Cliente {
    private String nombre;



    public Cliente() {
    }

    public Cliente(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }



  public  void PedirNombre(){
         this.nombre=  JOptionPane.showInputDialog("Digite su nombre");
        
                
  }      

}  