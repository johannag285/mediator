/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Johanna
 */
public class Usuario implements IUsuarioChat{
    private String nombre;
    private SalonChat salon;
    
    public Usuario(SalonChat salonChat){
        this.salon = salonChat;
    }

    @Override
    public void recibe(String de, String msj) {
        String s = "El usuario " + de + " te dice: " + msj;
        System.out.println(nombre + ": " + s);
    }

    @Override
    public void envia(String a, String msj) {
        salon.envia(nombre, a, msj);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SalonChat getSalon() {
        return salon;
    }

    public void setSalon(SalonChat salon) {
        this.salon = salon;
    }
    
    
    
}
