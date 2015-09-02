/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;
import java.util.Scanner;
/**
 *
 * @author Jose
 */
public class exercicio1 {
    
    public static void main(String[] args){
        Scanner teste = new Scanner(System.in);
        int x = 10;
        int user;
        System.out.println("Digite um número");
        user = teste.nextInt();
        if(user > x)
            System.out.println("Número do usuário é maior que o número do sistema");
    }
    
}
