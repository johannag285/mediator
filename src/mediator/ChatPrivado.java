/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Johanna
 */
public class ChatPrivado implements IUsuarioChat {


    private HashMap<String, Usuario> participantes = new HashMap<String, Usuario>();
    private SalonChat salonChat;

    
    public ChatPrivado(SalonChat salon){
        this.salonChat = salon;
    }
    @Override
    public void recibe(String de, String msj) {

        
    }

    @Override
    public void envia(String a, String msj) {
     
    }

    public void bloquear(Usuario user) {
        participantes = this.salonChat.getParticipantes();
        if (participantes.containsKey(user.getNombre())) {
            participantes.remove(user.getNombre());
            //varibale de tipo iterador para recorrer los participantes
            Iterator it = participantes.keySet().iterator();
            System.out.println("\n¡Bloqueado!\n" + "Nueva lista de amigos:");
            while (it.hasNext()) {
                 System.out.println(it.next());
            }    
        } else {
            System.out.println("Usuario no existe en tu lista de amigos");
        }
    }

    public void desbloquear(Usuario user) {
        participantes = this.salonChat.getParticipantes();
        participantes.put(user.getNombre(), user);
        if (participantes.containsKey(user.getNombre())) {
            //varibale de tipo iterador para recorrer los participantes
            Iterator it = participantes.keySet().iterator();
            System.out.println("\n¡Desbloqueado!\n" + "Nueva lista de amigos:");
            while (it.hasNext()) {
                 System.out.println(it.next());
            }    
        } else {
            System.out.println("Usuario no existe en tu lista de amigos");
        }

    }

    public void invitar(Usuario user) {
        participantes = this.salonChat.getParticipantes();
        participantes.put(user.getNombre(), user);
        if (participantes.containsKey(user.getNombre())) {
            System.out.println("Invitaste a: " + user.getNombre());
            
        } else {
            System.out.println("El usuario que invitaste no existe");
        }
    }

    public void buscar(Usuario user){
        participantes = this.salonChat.getParticipantes();
        if (participantes.containsKey(user.getNombre())) {
            System.out.println("Buscaste a: " + user.getNombre());
            
        } else {
            System.out.println("El usuario buscado no existe");
        }
    }

}
