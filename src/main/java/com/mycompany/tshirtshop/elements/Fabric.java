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
public enum Fabric {

    Wool(7), Cotton(2), Polyester(4), Rayon(5), Linen(3), Cashmere(1), Silk(6);

    public int value;

    private Fabric(int i) {
        this.value = i;

    }

    public static Fabric getRandomFabric() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}
