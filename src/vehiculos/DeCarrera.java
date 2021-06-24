package src.vehiculos;

import src.interfaces.TriplicacionAceleracion;
import src.interfaces.Turbo;

public class DeCarrera extends Vehiculo implements Turbo, TriplicacionAceleracion {

    public DeCarrera(String combustible, int cantidadGalones, int cantidadPasajeros, double velocidadMaxima,
            double aceleracionBase) {
        super(combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    @Override
    public void acelerar() {
        System.out.println("El auto de carrera esta acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("El auto de carrera se apago ");

    }

    @Override
    public void avanzar() {
        System.out.println("El auto de carrera esta avanzando");

    }

    @Override
    public void encender() {
        System.out.println("El auto de carrera se encendio");

    }

    @Override
    public void frenar() {
        System.out.println("El auto de carrera freno");

    }

    public void girarIizquierda() {
        System.out.println("El auto de carrera giro a la izquierda");

    }

    public void girarDerecha(){
        System.out.println("El auto de carrera giro a la derecha");
    }

    public void aplicarTurbo() {
        System.out.print("\n");
        System.out.println("******Aumentando la Aceleracion*********");
    }

    public void triplicarAceleracion() {
        System.out.println("****** Aceleracion triplicada **********");
    
    }

}
