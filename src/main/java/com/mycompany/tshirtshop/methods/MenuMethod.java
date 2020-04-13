/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tshirtshop.methods;

import com.mycompany.tshirtshop.methods.TshirtCreation;
import com.mycompany.tshirtshop.models.Tshirt;
import com.mycompany.tshirtshop.sortingalgorithms.SortingAlgorithms;
import com.mycompany.tshirtshop.comparators.SortByColorComparator;
import com.mycompany.tshirtshop.comparators.SortByFabricComparator;
import com.mycompany.tshirtshop.comparators.SortBySizeComparator;
import com.mycompany.tshirtshop.comparators.SortBySizeColorAndFabricComparator;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Natasa
 */
public class MenuMethod {

    public void startMenu() {

        Scanner sc = new Scanner(System.in);
        TshirtCreation s1 = new TshirtCreation();
        ArrayList<Tshirt> ar = s1.makeManyTShirts();
        System.out.println("T-shirts made:");
        for (Tshirt tshirt : ar) {

            System.out.println(tshirt);

        }
        System.out.println();
        String menuChoice;

        do {

            System.out.println("Press 1 to view the T-shirts by Color in ascending.");
            System.out.println("Press 2 to view the T-shirts by Color in descending.");
            System.out.println("Press 3 to view the T-shirts by Size in ascending.");
            System.out.println("Press 4 to view the T-shirts by Size in descending.");
            System.out.println("Press 5 to view the T-shirts by Fabric in ascending.");
            System.out.println("Press 6 to view the T-shirts by Fabric in descending.");
            System.out.println("Press 7 to view the T-shirts by Size, then Color and then Fabric in ascending.");
            System.out.println("Press 8 to view the T-shirts by Size, then Color and then Fabric in descending.");

            System.out.println("Press 0 to quit.");

            menuChoice = sc.nextLine();

            if (menuChoice.isEmpty()) {

                System.out.println("Please try again.");
                continue;
            }

            switch (menuChoice) {

                case "1":
                    System.out.println("T-shirts by Color in ascending.");
                    System.out.println("Which sorting algorithm would you like to be used?");
                    System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");

                    OUTER:
                    do {
                        String submenuChoice = sc.nextLine();
                        switch (submenuChoice) {
                            case "1":

                                System.out.println("List sorted by BubbleSort - Color in ascending");
                                SortingAlgorithms.bubbleSort(ar, new SortByColorComparator());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            case "2":

                                System.out.println("List sorted by QuickSort - Color in ascending");
                                SortingAlgorithms.quickSort(ar, 0, ar.size() - 1, new SortByColorComparator());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;

                            case "3":
                                System.out.println("List sorted by BucketSort - Color in ascending");
                                SortingAlgorithms.bucketSort(ar, new SortByColorComparator());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            default:
                                if (submenuChoice.isEmpty() || !(submenuChoice.equals("1") || !submenuChoice.equals("2") || !submenuChoice.equals("3"))) {

                                    continue;

                                }
                                System.out.println("Please try again");
                                System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");
                                break;

                        }
                    } while (!menuChoice.equals("0"));
                    break;

                case "2":
                    System.out.println("T-shirts by Color in descending.");
                    System.out.println("Which sorting algorithm would you like to be used?");
                    System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");

                    OUTER:
                    do {
                        String submenuChoice = sc.nextLine();
                        switch (submenuChoice) {
                            case "1":

                                System.out.println("List sorted by BubbleSort - Color in descending");
                                SortingAlgorithms.bubbleSort(ar, new SortByColorComparator().reversed());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            case "2":

                                System.out.println("List sorted by QuickSort - Color in descending");
                                SortingAlgorithms.quickSort(ar, 0, ar.size() - 1, new SortByColorComparator().reversed());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;

                            case "3":
                                System.out.println("List sorted by BucketSort - Color in descending");
                                SortingAlgorithms.bucketSort(ar, new SortByColorComparator().reversed());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            default:
                                if (submenuChoice.isEmpty() || !(submenuChoice.equals("1") || !submenuChoice.equals("2") || !submenuChoice.equals("3"))) {

                                    continue;

                                }
                                System.out.println("Please try again");
                                System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");
                                break;

                        }
                    } while (!menuChoice.equals("0"));
                    break;

                case "3":
                    System.out.println("T-shirts by Size in ascending.");
                    System.out.println("Which sorting algorithm would you like to be used?");
                    System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");

                    OUTER:
                    do {
                        String submenuChoice = sc.nextLine();
                        switch (submenuChoice) {
                            case "1":

                                System.out.println("List sorted by BubbleSort - Size in ascending");
                                SortingAlgorithms.bubbleSort(ar, new SortBySizeComparator());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            case "2":

                                System.out.println("List sorted by QuickSort - Size in ascending");
                                SortingAlgorithms.quickSort(ar, 0, ar.size() - 1, new SortBySizeComparator());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;

                            case "3":
                                System.out.println("List sorted by BucketSort - Size in ascending");
                                SortingAlgorithms.bucketSort(ar, new SortBySizeComparator());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            default:
                                if (submenuChoice.isEmpty() || !(submenuChoice.equals("1") || !submenuChoice.equals("2") || !submenuChoice.equals("3"))) {

                                    continue;

                                }
                                System.out.println("Please try again");
                                System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");
                                break;

                        }
                    } while (!menuChoice.equals("0"));
                    break;

                case "4":
                    System.out.println("T-shirts by Size in descending.");
                    System.out.println("Which sorting algorithm would you like to be used?");
                    System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");

                    OUTER:
                    do {
                        String submenuChoice = sc.nextLine();
                        switch (submenuChoice) {
                            case "1":

                                System.out.println("List sorted by BubbleSort - Size in descending");
                                SortingAlgorithms.bubbleSort(ar, new SortBySizeComparator().reversed());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            case "2":

                                System.out.println("List sorted by QuickSort - Size in descending");
                                SortingAlgorithms.quickSort(ar, 0, ar.size() - 1, new SortBySizeComparator().reversed());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;

                            case "3":
                                System.out.println("List sorted by BucketSort - Size in descending");
                                SortingAlgorithms.bucketSort(ar, new SortBySizeComparator().reversed());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            default:
                                if (submenuChoice.isEmpty() || !(submenuChoice.equals("1") || !submenuChoice.equals("2") || !submenuChoice.equals("3"))) {

                                    continue;

                                }
                                System.out.println("Please try again");
                                System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");
                                break;

                        }
                    } while (!menuChoice.equals("0"));
                    break;

                case "5":
                    System.out.println("T-shirts by Fabric in ascending.");
                    System.out.println("Which sorting algorithm would you like to be used?");
                    System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");

                    OUTER:
                    do {
                        String submenuChoice = sc.nextLine();
                        switch (submenuChoice) {
                            case "1":

                                System.out.println("List sorted by BubbleSort - Fabric in ascending");
                                SortingAlgorithms.bubbleSort(ar, new SortByFabricComparator());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            case "2":

                                System.out.println("List sorted by QuickSort - Fabric in ascending");
                                SortingAlgorithms.quickSort(ar, 0, ar.size() - 1, new SortByFabricComparator());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;

                            case "3":
                                System.out.println("List sorted by BucketSort - Fabric in ascending");
                                SortingAlgorithms.bucketSort(ar, new SortByFabricComparator());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }

                                System.out.println();
                                break OUTER;
                            default:
                                if (submenuChoice.isEmpty() || !(submenuChoice.equals("1") || !submenuChoice.equals("2") || !submenuChoice.equals("3"))) {

                                    continue;

                                }
                                System.out.println("Please try again");
                                System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");
                                break;

                        }
                    } while (!menuChoice.equals("0"));
                    break;

                case "6":
                    System.out.println("T-shirts by Fabric in descending.");
                    System.out.println("Which sorting algorithm would you like to be used?");
                    System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");

                    OUTER:
                    do {
                        String submenuChoice = sc.nextLine();
                        switch (submenuChoice) {
                            case "1":

                                System.out.println("List sorted by BubbleSort - Fabric in descending");
                                SortingAlgorithms.bubbleSort(ar, new SortByFabricComparator().reversed());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            case "2":

                                System.out.println("List sorted by QuickSort - Fabric in descending");
                                SortingAlgorithms.quickSort(ar, 0, ar.size() - 1, new SortByFabricComparator().reversed());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;

                            case "3":
                                System.out.println("List sorted by BucketSort - Fabric in descending");
                                SortingAlgorithms.bucketSort(ar, new SortByFabricComparator().reversed());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            default:
                                if (submenuChoice.isEmpty() || !(submenuChoice.equals("1") || !submenuChoice.equals("2") || !submenuChoice.equals("3"))) {

                                    continue;

                                }
                                System.out.println("Please try again");
                                System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");
                                break;

                        }
                    } while (!menuChoice.equals("0"));
                    break;

                case "7":
                    System.out.println("T-shirts by Size and Color and Fabric in ascending");
                    System.out.println("Which sorting algorithm would you like to be used?");
                    System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");

                    OUTER:
                    do {
                        String submenuChoice = sc.nextLine();
                        switch (submenuChoice) {
                            case "1":

                                System.out.println("List sorted by BubbleSort by Size and Color and Fabric in ascending");
                                SortingAlgorithms.bubbleSort(ar, new SortBySizeColorAndFabricComparator());

                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            case "2":

                                System.out.println("List sorted by QuickSort by Size and Color and Fabric in ascending");
                                SortingAlgorithms.quickSort(ar, 0, ar.size() - 1, new SortBySizeColorAndFabricComparator());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }

                                System.out.println();

                                break OUTER;

                            case "3":
                                System.out.println("List sorted by BucketSort by Size and Color and Fabric in ascending");
                                SortingAlgorithms.bucketSort(ar, new SortBySizeColorAndFabricComparator());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }

                                System.out.println();
                                break OUTER;
                            default:
                                if (submenuChoice.isEmpty() || !(submenuChoice.equals("1") || !submenuChoice.equals("2") || !submenuChoice.equals("3"))) {

                                    continue;

                                }
                                System.out.println("Please try again");
                                System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");
                                break;

                        }
                    } while (!menuChoice.equals("0"));
                    break;

                case "8":
                    System.out.println("T-shirts by Size and Color and Fabric in descending");
                    System.out.println("Which sorting algorithm would you like to be used?");
                    System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");

                    OUTER:
                    do {
                        String submenuChoice = sc.nextLine();
                        switch (submenuChoice) {
                            case "1":
                                System.out.println("List sorted by BubbleSort by Size and Color and Fabric in descending");
                                SortingAlgorithms.bubbleSort(ar, new SortBySizeColorAndFabricComparator().reversed());

                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }
                                System.out.println();
                                break OUTER;
                            case "2":

                                System.out.println("List sorted by QuickSort by Size and Color and Fabric in descending");
                                SortingAlgorithms.quickSort(ar, 0, ar.size() - 1, new SortBySizeColorAndFabricComparator().reversed());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }

                                System.out.println();

                                break OUTER;

                            case "3":
                                System.out.println("List sorted by BucketSort by Size and Color and Fabric in descending");

                                SortingAlgorithms.bucketSort(ar, new SortBySizeColorAndFabricComparator().reversed());
                                for (Tshirt tshirt : ar) {
                                    System.out.println(tshirt);

                                }

                                System.out.println();

                                break OUTER;
                            default:
                                if (submenuChoice.isEmpty() || !(submenuChoice.equals("1") || !submenuChoice.equals("2") || !submenuChoice.equals("3"))) {

                                    continue;

                                }
                                System.out.println("Please try again");
                                System.out.println("Type '1' for BubbleSort, '2' for QuickSort,or '3' for BucketSort.");
                                break;

                        }
                    } while (!menuChoice.equals("0"));
                    break;

            }

        } while (!menuChoice.equals("0"));

    }

}
