/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activite_OpenClassroomLocal;

import java.util.Scanner;

/**
 *
 * @author Notsawo
 */
public class TestUtilisateur {
    Utilisateur u;
    Scanner sc = new Scanner(System.in);
    u = new Utilisateur();
    do{
        System.out.println("Entrez votre nom : ");
        u.setNom(sc.nextLine());
    }while(u.getNom().replaceAll(" ", "").equals(""));
    System.out.println("Entrez votre prenom : ");
    u.setPrenom(sc.nextLine());
    System.out.println(u);
}
