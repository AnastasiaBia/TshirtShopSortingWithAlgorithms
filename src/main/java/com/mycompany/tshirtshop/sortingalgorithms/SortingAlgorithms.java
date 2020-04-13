/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tshirtshop.sortingalgorithms;

import com.mycompany.tshirtshop.models.Tshirt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Natasa
 */
public class SortingAlgorithms {

    public static void bubbleSort(ArrayList<Tshirt> input, Comparator comp) {
        int inputLength = input.size();
        Tshirt tempTshirt;
        boolean is_sorted;
        for (int i = 0; i < inputLength; i++) {
            is_sorted = true;
            for (int j = 1; j < (inputLength - i); j++) {
                if (comp.compare(input.get(j - 1), input.get(j)) > 0) {
                    tempTshirt = input.get(j - 1);
                    input.set(j - 1, input.get(j));
                    input.set(j, tempTshirt);
                    is_sorted = false;
                }
            }
            if (is_sorted) {
                break;
            }
        }
    }

    public static ArrayList<Tshirt> quickSort(ArrayList<Tshirt> input, int left, int right, Comparator comparator) {
        int l = left;
        int r = right;
        if (r > l) {
            Tshirt pivot = input.get((l + r) / 2);
            while (l <= r) {
                while (l < right && comparator.compare(input.get(l), pivot) < 0) {
                    l += 1;
                }
                while (r > left && comparator.compare(input.get(r), pivot) > 0) {
                    r -= 1;
                }
                if (l <= r) {
                    Collections.swap(input, l, r);
                    l += 1;
                    r -= 1;
                }
            }
            if (left < r) {
                quickSort(input, left, r, comparator);
            }
            if (l < right) {
                quickSort(input, l, right, comparator);
            }
        }
        return input;
    }

    public static ArrayList<Tshirt> bucketSort(ArrayList<Tshirt> input, Comparator comparator) {
        final int noOfBuckets = (int) Math.sqrt(input.size());
        List<Tshirt>[] buckets = new List[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) {
            buckets[i] = new LinkedList<>();
        }
        for (Tshirt t : input) {
            buckets[hash(t)].add(t);
        }
        for (List<Tshirt> bucket : buckets) {
            Collections.sort(bucket, comparator);
        }
        int i = 0;
        for (List<Tshirt> bucket : buckets) {
            for (Tshirt t : bucket) {
                input.set(i++, t);
            }
        }
        return input;
    }

    private static int hash(Tshirt t) {
        return t.getC().value / 10;
    }
}
