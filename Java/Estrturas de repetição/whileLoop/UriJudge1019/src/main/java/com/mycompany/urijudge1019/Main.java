/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.urijudge1019;

import java.util.Scanner;

/**
 *
 * @author klebe
 */
public class Main {
    public static void main(String[] args) {
        int n, hora, minuto, segundo, resto;
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        resto = n;
        
        hora = resto / 3600;
        resto = resto % 3600;
        
        minuto = resto / 60;
        resto = resto % 60;
        
        segundo = resto;
        
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
    
}
