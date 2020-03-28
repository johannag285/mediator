/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.Scanner;

/**
 *
 * @author Johanna
 */
public class Cliente {

    
    public static boolean inicio = true;
    private static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalonChat s = new SalonChat();
        
        ChatPrivado c = new ChatPrivado(s);
        
        Usuario Juan = new Usuario(s);
        Juan.setNombre("Juan");
        s.registra(Juan);
        
        Usuario Pepe = new Usuario(s);
        Pepe.setNombre("Pepe");
        s.registra(Pepe);
        
        Usuario Pedro = new Usuario(s);
        Pedro.setNombre("Pedro");
        s.registra(Pedro);
        
        Usuario Johanna = new Usuario(s);
        Johanna.setNombre("Johanna");
        s.registra(Johanna);
        
        Usuario Felipe = new Usuario(s);
        Felipe.setNombre("Felipe");
        s.registra(Felipe);
        
        Usuario Martin = new Usuario(s);
        Martin.setNombre("Martin");
        s.registra(Martin);
        
        Juan.envia("Pepe", "Hola cómo andas?");
        Pepe.envia("Juan", "Todos ok, vos?");
        Pedro.envia("Martin", "Martin estás?");
        Johanna.envia("Pedro", "Amigo nuevo");
        Felipe.envia("Johanna", "Hola amigo nuevo");
        Martin.envia("Pedro", "Bien, gracias");
          
        
        
        while(inicio){
             System.out.print(
                    "Menu opciones\n"
                    + "1. Bloquear usuario\n"
                    + "2. Desbloquear usuario\n"
                    + "3. Buscar Usuario\n"
                    + "4. Invitar Usuario\n"
                    + "5. desea salir\n"
            );
             
            switch(scanner.next()){
             case "1":
              c.bloquear(Pedro);
              c.bloquear(Juan);
             break;
             
             case "2":
              c.desbloquear(Pedro);
             break;
             
             case "3":
               c.buscar(Pedro);
             break;
             
             case "4":
              c.invitar(Johanna);   
             break;
             
             case "5":
                inicio = false;
             break;
             
             default:
                 System.out.println("Opción no valida");
             break;
                 
            }
        }
    }
    
}
