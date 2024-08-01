/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ahorcado;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author soria
 */
public class Ahorcado {
     
    //opcional animacion del ahorcado
    //ingresar la palabra, luego que la persona comience a jugar 
    //no poner cantidad de letras que tiene la palabra
    //condiciones de intentos (7 intentos cabeza, cuerpo, brazos, manos, ahorcado)
    //cuando repita letra que no sea tomado como error, que salga un msj que diga "ya utilzaste esta letra"
    //la letra debe aparecer adaptandose a cualquier palabra , separar la palabra por caracteres 
    //usar listas 
    //si la palabra se adivina o no esta se elimina y comienza otro juego 
    //actualizacion despues de cada letra ingresada 
    //imprimir lo que voy a mostrar
    //si arriega la palabra y le erra que pierda definitivamente
    //si queda una sola letra por descubrir debe poner la plabra completa(gana o pierde);
    //la lista que cambia es la lista paralela osea la que ve el usuario
   
    
    //LinkedList palabraSecreta=new LinkedList();
    LinkedList palabraOculta=new LinkedList();
    LinkedList letrasAdivinadas=new LinkedList();
    Scanner teclado=new Scanner(System.in);
    String palabra;
    //int contadorLetras = 0;
    int contadorIntentos = 0;
    int intentosFallidos = 0;
    String letra;

    
    public void ingresarPalabra(){
        System.out.println("------------- EL AHORCADO ------------");
        System.out.println(" ");
        System.out.println("Para comenzar a jugar ingresa una palabra: ");
        palabra = teclado.next(); 
        //lista.add(palabra);
        
         for (int i = 0; i < palabra.length(); i++) {
            palabraOculta.add('_');
        }
        
       
         int intentos =7;
         
        
         
        //descomprimir en caracteres
        /*String palabra="SILLA";
        for(int x =0; x<palabra.length();x++){
              lista.add(palabra.charAT(x)):
        }*/
         
        int j=0;
        while(j<100){
            System.out.println(" ");
            j++;
        }
        
        
        System.out.println("----------- Adivina la palabra ----------------");
        System.out.println(" ");
        //System.out.println("Intento nº: "+contadorIntentos);
        //System.out.println(" ");
        imprimirHorca(intentos);
        
       
        System.out.println("PALABRA");
        
         while(intentos > 0){
             
             System.out.println("Palabra a adivinar: " + palabraOculta);
             System.out.println("Intentos restantes: " + intentos);
             System.out.println("Letras Intentadas: " + letrasAdivinadas);
             
             
             /*if (palabraOculta.contains('_')){
                if (palabraOculta.indexOf('_') == palabraOculta.lastIndexOf('_')) {
                    System.out.print("¡Queda una letra por adivinar... Tenes que arriegar la palabra");
                    
                        System.out.print("Ingresa la palabra completa: ");
                        String intentoPalabra = teclado.next().toLowerCase();

                        if (intentoPalabra.equals(palabra)) {
                            System.out.println("¡Has ganado! La palabra es: " + palabra);
                            break;
                        } else {
                            System.out.println("¡Palabra incorrecta! Has perdido.");
                            break;
                        }
                    
                }
             }*/
            
            System.out.print("Ingresa una letra: ");
            char letra = teclado.next().charAt(0);
            
            
            if(letrasAdivinadas.contains(letra)){
                System.out.println("Ya has intentado con esa letra.");
            }else{
                boolean acierto = false;
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra) {
                        palabraOculta.set(i, letra);
                        letrasAdivinadas.add(letra);
                        acierto = true;
                        //dibujarHombrecito(intentos);
                        //limpiarConsola();
                    }
                }
                
                if (!acierto) {
                    intentos--;
                    dibujarHombrecito(intentos);
                    letrasAdivinadas.add(letra);
                    System.out.println("Letra incorrecta.");
                }
            }
            
            
            if (!palabraOculta.contains('_')) {
                System.out.println("¡Has ganado! La palabra es: " + palabra);
                break;
            }
        
        
         
         if (intentos == 0) {
            System.out.println("¡Has perdido! La palabra era: " + palabra);
           }
     }
         
    }
    
    public void limpiarConsola(){
        int x=0;
         while(x<100){
            System.out.println(" ");
            x++;
        }
    }
    
    
    public static void dibujarHombrecito(int intentosRestantes){
        switch(intentosRestantes) {
        case 0:
                System.out.println(" ------------------- ");
                System.out.println("  |   /            |");
                System.out.println("  |  /             |");
                System.out.println("  | /              |");
                System.out.println("  |                O ");
                System.out.println("  |              --|--");
                System.out.println("  |                |");
                System.out.println("  |               / \\");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println(" / \\ ");
                break;
        case 1:
                System.out.println(" ------------------- ");
                System.out.println("  |   /            |");
                System.out.println("  |  /             |");
                System.out.println("  | /              |");
                System.out.println("  |                O ");
                System.out.println("  |              --|--");
                System.out.println("  |                |");
                System.out.println("  |               / ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println(" / \\ ");
                break;
        case 2:
                System.out.println(" ------------------- ");
                System.out.println("  |   /            |");
                System.out.println("  |  /             |");
                System.out.println("  | /              |");
                System.out.println("  |                O ");
                System.out.println("  |              --|--");
                System.out.println("  |                |");
                System.out.println("  |               ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println(" / \\ ");;        
                break;
        case 3:
               System.out.println(" ------------------- ");
                System.out.println("  |   /            |");
                System.out.println("  |  /             |");
                System.out.println("  | /              |");
                System.out.println("  |                O ");
                System.out.println("  |                |--");
                System.out.println("  |                |");
                System.out.println("  |               ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println(" / \\ ");      
                break;
        case 4:
                System.out.println(" ------------------- ");
                System.out.println("  |   /            |");
                System.out.println("  |  /             |");
                System.out.println("  | /              |");
                System.out.println("  |                O ");
                System.out.println("  |                |");
                System.out.println("  |                |");
                System.out.println("  |               ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println(" / \\ ");       
                break;
        case 5:
               System.out.println(" ------------------- ");
                System.out.println("  |   /            |");
                System.out.println("  |  /             |");
                System.out.println("  | /              |");
                System.out.println("  |                O ");
                System.out.println("  |                |  ");
                System.out.println("  |                  ");
                System.out.println("  |                  ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println(" / \\ ");       
                break;
        case 6:
        default:
                System.out.println(" ------------------- ");
                System.out.println("  |   /            |");
                System.out.println("  |  /             |");
                System.out.println("  | /              |");
                System.out.println("  |                O ");
                System.out.println("  |                  ");
                System.out.println("  |                  ");
                System.out.println("  |                  ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println(" / \\ ");       
                break;
        }
    }       
 
        
    
    
    public void imprimirHorca(int intentos){
        System.out.println("Intento nº: "+contadorIntentos);
        System.out.println(" ");
        System.out.println(" ------------------- ");
        System.out.println("  |   /            |");
        System.out.println("  |  /             |");
        System.out.println("  | /              |");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println(" / \\ ");
    }
    
   
    public static void main(String[] args) {
      Ahorcado juego= new Ahorcado();
      juego.ingresarPalabra();
      //juego.ingresarLetra();
      boolean condicion=true;
      /*while(condicion==true){
          juego.ingresarPalabra();
          
      }*/
    }
    
}
