/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicua;
import java.util.Scanner;
 
public class Capicua {
 
    public static void main(String[] args) {
     int n=11;
      
     while (n!=-1){
        int n2, inverso = 0, cifra;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número >= 10: ");
        n = sc.nextInt();
        if(n>=10){
        //le damos la vuelta al número 
        n2 = n;   //para poder igualar al final añadimos la variante
        while (n2!=0){
            cifra = n2 % 10; //coge la cifra del final
            inverso = inverso * 10 + cifra; //va colocandola en unidad,decena,centena, etc...
            n2 = n2 / 10; //va reduciendo el n, eleminando el de atras
        }
 
        if(n == inverso){ //si son iguales, será capicua.
            System.out.println("***Es capicua***");}
        else{
            System.out.println("***No es capicua***");} 
        }
        else{System.out.println("Número demasiado pequeño.");}
     }    
   }
}
