import java.util.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        Scanner dcto = new Scanner(System.in);
        System.out.println("Ingrese valor del Vehiculo :");
        double valorVehiculo = entrada.nextDouble();
        double valorImpuesto = (valorVehiculo * 20)/100;

        System.out.println("Su valor a pagar por el impuesto sin descuento es:");
        System.out.println(valorImpuesto);

        double descuentoProntoPago = (valorVehiculo * 1)/100;
        double descuentoServicioPublico = 5;
        double descuentoTrasladoCuenta = (valorImpuesto * 10)/100;

        System.out.println("Tiene descuento por pronto pago:");
        System.out.println("1 = SI");
        System.out.println("2 = NO");

        double dctoProntoPago = dcto.nextDouble();


        if (dctoProntoPago == 1 || dctoProntoPago == 2){
            System.out.println("Respuesta valida");

        }
        else {
            System.out.println("La respuesta no es correcta");
            System.out.println(dctoProntoPago);
        }

        System.out.println("Tiene descuento por Servicio Publico:");
        System.out.println("1 = SI");
        System.out.println("2 = NO");
        double dctoServicioPublico = dcto.nextDouble();
        if (dctoServicioPublico == 1 || dctoServicioPublico == 2){
            System.out.println("Respuesta valida");
        }
        else {
            System.out.println("La respuesta no es correcta");
        }

        System.out.println("Tiene descuento por Traslado cuenta:");
        System.out.println("1 = SI");
        System.out.println("2 = NO");
        double dctoTrasladoCuenta = dcto.nextDouble();
        if (dctoTrasladoCuenta == 1 || dctoTrasladoCuenta == 2){
            System.out.println("Respuesta valida");
        }
        else {
            System.out.println("La respuesta no es correcta");
        }

        //CALCULAR DESCUENTOS

        if (dctoProntoPago ==1 && dctoServicioPublico ==2 && dctoTrasladoCuenta ==2)
        {
            valorImpuesto = valorImpuesto - descuentoProntoPago;
            System.out.println("El valor a pagar es : ");
            System.out.println(valorImpuesto);
        }
        else if (dctoProntoPago ==1 && dctoServicioPublico ==1 && dctoTrasladoCuenta ==2){
            valorImpuesto=(valorImpuesto - descuentoProntoPago) - descuentoServicioPublico ;
            System.out.println("El valor a pagar es : ");
            System.out.println(valorImpuesto);
        }
        else if (dctoProntoPago ==1 && dctoServicioPublico ==1 && dctoTrasladoCuenta ==1){
            System.out.println("El valor a pagar es : ");
            valorImpuesto=((valorImpuesto - descuentoProntoPago) - descuentoServicioPublico)- descuentoTrasladoCuenta;
            System.out.println(valorImpuesto);
        }
        else if (dctoProntoPago ==2 && dctoServicioPublico ==1 && dctoTrasladoCuenta ==2){
            System.out.println("El valor a pagar es : ");
            valorImpuesto= valorImpuesto - descuentoServicioPublico;
            System.out.println(valorImpuesto);

        }
        else if (dctoProntoPago ==2 && dctoServicioPublico ==1 && dctoTrasladoCuenta ==1){
            System.out.println("El valor a pagar es : ");
            valorImpuesto= (valorImpuesto - descuentoServicioPublico)-descuentoTrasladoCuenta;
            System.out.println(valorImpuesto);

        }
        else if (dctoProntoPago ==2 && dctoServicioPublico ==2 && dctoTrasladoCuenta ==1){
            System.out.println("El valor a pagar es : ");
            valorImpuesto= (valorImpuesto -descuentoTrasladoCuenta);
            System.out.println(valorImpuesto);

        }
        else {
            System.out.println("No tiene descuento y su tarifa es : ");
            System.out.println(valorImpuesto);
        }




    }
}

