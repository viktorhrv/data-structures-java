/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.sofia.uni.fmi.mjt.show.elimination;

import bg.sofia.uni.fmi.mjt.show.ergenka.Ergenka;

/**
 *
 * @author user
 */
public class LowestRatingEliminationRule implements EliminationRule {

    @Override
    public Ergenka[] eliminateErgenkas(Ergenka[] ergenkas) {
        int min = Integer.MAX_VALUE;
        int count = 0;

        // Find the lowest rating
        for (int i = 0; i < ergenkas.length; i++) {
            if (ergenkas[i].getRating() < min) {
                min = ergenkas[i].getRating();
            }
        }

        // Count how many Ergenkas have the lowest rating
        for (int i = 0; i < ergenkas.length; i++) {
            if (ergenkas[i].getRating() == min) {
                count++;
            }
        }

        // Create an array for all Ergenkas that will be eliminated
        Ergenka[] result = new Ergenka[count];

        // Add them to the result array
        int resultIndex = 0;

        for (int i = 0; i < ergenkas.length; i++) {
            if (ergenkas[i].getRating() == min) {
                result[resultIndex] = ergenkas[i];
                resultIndex++;
            }
        }

        return result;
    }
}
