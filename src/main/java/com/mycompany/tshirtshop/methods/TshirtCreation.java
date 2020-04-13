/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tshirtshop.methods;

import com.mycompany.tshirtshop.elements.Size;
import com.mycompany.tshirtshop.elements.Fabric;
import com.mycompany.tshirtshop.elements.Color;
import com.mycompany.tshirtshop.models.Tshirt;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author bia_a
 */
public class TshirtCreation {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Tshirt> tshirts = new ArrayList<>();

    public ArrayList<Tshirt> makeManyTShirts() {

        boolean valid = false;
        while (!valid) {
            System.out.println("How many T-shirts would you like to make?");
            System.out.println("Choose a number from 6 to 100");
            try {
                int i = sc.nextInt();
                if (i >= 6 && i <= 100) {
                    valid = true;
                    for (int j = 0; j < i; j++) {
                        tshirts.add(new Tshirt(Color.getRandomColor(), Size.getRandomSize(), Fabric.getRandomFabric()));

                    }
                    return tshirts;
                } else {
                    System.out.println("Out of range.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a valid number.");
                sc.next();
            }

        }
        return tshirts;
    }
}
