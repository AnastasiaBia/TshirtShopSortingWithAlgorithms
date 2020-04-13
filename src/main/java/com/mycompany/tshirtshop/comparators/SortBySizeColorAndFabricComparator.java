/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tshirtshop.comparators;

import com.mycompany.tshirtshop.models.Tshirt;
import java.util.Comparator;

/**
 *
 * @author Natasa
 */
public class SortBySizeColorAndFabricComparator implements Comparator<Tshirt> {

    @Override
    public int compare(Tshirt o1, Tshirt o2) {
        int sizeCompared = o1.getS().value - o2.getS().value;
        if (sizeCompared == 0) {
            int colorCompared = o1.getC().value - o2.getC().value;
            if (colorCompared == 0) {
                int fabricCompared = o1.getF().value - o2.getF().value;
                if (fabricCompared == 0) {
                    return 0;
                } else {
                    return fabricCompared;
                }
            } else {
                return colorCompared;
            }
        } else {
            return sizeCompared;
        }
    }

}
