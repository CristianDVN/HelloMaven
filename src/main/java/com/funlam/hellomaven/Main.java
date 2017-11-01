package com.funlam.hellomaven;

public class Main{
    public static void main (String ... args){
        System.out.println("Hello Maven!");
        
        Persona persona = new Persona();
        persona.setNombre("Cristian David");
        persona.setApellido("Valencia");
        persona.setEdad(21);
    }
}