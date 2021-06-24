package src.principal;

import src.vehiculos.*;


public class Principal{
    private static Vehiculo[] vehiculos=new Vehiculo[20];
    public static void main( String[] args ){
        ManejadorVehiculos run=new ManejadorVehiculos();
        run.crearVehiculo(vehiculos);
        run.verVehiculo(vehiculos);
    }
}
