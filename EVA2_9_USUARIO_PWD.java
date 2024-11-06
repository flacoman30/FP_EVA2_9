/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA2_9_USUARIO_PWD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        final String USUARIO = "flac";//PERMITE SI EL USUARIO ESTE BIEN
        final String CONTRASEÑA = "XD";
        String usuario,contraseña;
      Scanner captu = new Scanner(System.in);
         
        do{
            System.out.println("Escribir tu nombre de usuario");
         usuario = captu.nextLine();
         System.out.println("Escribir tu contraseña porfa");
         contraseña = captu.nextLine();
        }while(!(usuario.equals(USUARIO) && contraseña.equals(CONTRASEÑA))); 
        System.out.println("eres de la grasa");
              
                
                
                
         
                
   
  }
}
