package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.Recibir datos
          Scanner lea=new Scanner(System.in);
          String playerName;
          String opcionUser;
          String opcionPc;
          final String pcName="SYNET";


          boolean bandera=false;

        //Interfaz de bienvenida
        System.out.println("\n*********  *  *********");
        System.out.println("**SCISSORS PAPER GAME**");
        System.out.println("*********  *  *********\n");

        System.out.print("Digita tu nombre de usuario: ");
        playerName=lea.nextLine();

        System.out.print("Juega, escribe tu opcion de juego (piedra, papel, tijera): ");
        opcionUser=lea.nextLine().toLowerCase();

        //2.Clasificar datos ingresados //3.Actualizar Bandera

        if (opcionUser.equals("piedra")||opcionUser.equals("papel")||opcionUser.equals("tijera")){
            bandera=true;
            System.out.println("La opcion es correcta");

        }else {
            bandera=false;
            System.out.println("La opcion es incorrecta");
        }

        //4.Implementar Ciclos (tres repeticiones)
        int contador=0;
        while (contador<3){
            //contador=contador+1;
            contador++;


            //5.Generando la accion aleatoria del computador
            Random aleatoria=new Random();
            int numeroAleatorio=aleatoria.nextInt(3);
            System.out.println(numeroAleatorio);

            if (numeroAleatorio==0){
                opcionPc="piedra";
            } else if (numeroAleatorio==1) {
                opcionPc="papel";
            }
            else{
                opcionPc="tijera";
            }

            System.out.println("El usuario elije: "+opcionUser);

            System.out.println("El computador elijer: "+opcionPc);

            System.out.println("-------------------------------");

        //6.Elegir el ganador
            if (opcionUser.equals("piedra")&&opcionPc.equals("piedra")) {
                System.out.println("Empate");
            }
            else if (opcionUser.equals("papel")&&opcionPc.equals("papel")) {
                System.out.println("Emapate");
            }
            else if (opcionUser.equals("tijera")&&opcionPc.equals("tijera")) {
                System.out.println("Empate");
            }

            else if (opcionUser.equals("piedra")&&opcionPc.equals("papel")) {
                System.out.println("gana: "+pcName);
            }
            else if (opcionUser.equals("papel")&&opcionPc.equals("tijera")) {
                System.out.println("gana: "+pcName);
            }
            else if (opcionUser.equals("tijera")&&opcionPc.equals("piedra")) {
                System.out.println("gana: "+pcName);
            }
            else if (opcionUser.equals("piedra")&&opcionPc.equals("tijera")) {
                System.out.println("gana: "+playerName);
            }
            else if (opcionUser.equals("papel")&&opcionPc.equals("piedra")) {
                System.out.println("gana: "+playerName);
            }
            else if (opcionUser.equals("tijera")&&opcionPc.equals("papel")) {
                System.out.println("gana: "+playerName);
            }
            else {
                System.out.println("upps tenemos un proboema");
            }




        }



    }
}