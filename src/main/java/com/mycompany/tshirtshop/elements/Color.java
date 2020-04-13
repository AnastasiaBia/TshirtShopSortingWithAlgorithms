/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tshirtshop.elements;

import java.util.Random;

/**
 *
 * @author bia_a
 */
public enum Color {

    Red(5), Orange(4), Yellow(7), Green(2), Blue(1), Indigo(3), Violet(6);

    public int value;

    private Color(int i) {
        this.value = i;

    }

    public static Color getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
