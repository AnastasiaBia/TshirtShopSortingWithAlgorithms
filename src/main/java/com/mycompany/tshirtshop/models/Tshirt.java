/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tshirtshop.models;

import com.mycompany.tshirtshop.elements.Color;
import com.mycompany.tshirtshop.elements.Fabric;
import com.mycompany.tshirtshop.elements.Size;

/**
 *
 * @author bia_a
 */
public class Tshirt {

    private Color c;
    private Size s;
    private Fabric f;

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Size getS() {
        return s;
    }

    public void setS(Size s) {
        this.s = s;
    }

    public Fabric getF() {
        return f;
    }

    public void setF(Fabric f) {
        this.f = f;
    }

    public Tshirt(Color c, Size s, Fabric f) {
        this.c = c;
        this.s = s;
        this.f = f;

    }

    @Override
    public String toString() {
        return "Tshirt: " + "Color=" + c + ", Size=" + s + ", Fabric=" + f;
    }

}
