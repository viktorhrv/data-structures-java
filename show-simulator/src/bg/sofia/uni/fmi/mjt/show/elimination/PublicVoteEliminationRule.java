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
public class PublicVoteEliminationRule implements EliminationRule {

    private String[] votes;

    public PublicVoteEliminationRule(String[] votes) {
        this.votes = votes;
    }

    @Override
    public Ergenka[] eliminateErgenkas(Ergenka[] ergenkas) {

        Ergenka eliminatedErgenka = null;

        // Find the ergenka with more than 50% of the votes
        for (Ergenka ergenka : ergenkas) {
            int countVotes = 0;

            for (String vote : votes) {
                if (vote.equals(ergenka.getName())) {
                    countVotes++;
                }
            }

            if (countVotes > votes.length / 2) {
                eliminatedErgenka = ergenka;
                break;
            }
        }

        // Nobody has the majority
        if (eliminatedErgenka == null) {
            return ergenkas;
        }

        // Create an array without the eliminated ergenka
        Ergenka[] remainingErgenkas = new Ergenka[ergenkas.length - 1];

        int index = 0;

        for (Ergenka ergenka : ergenkas) {
            if (ergenka != eliminatedErgenka) {
                remainingErgenkas[index] = ergenka;
                index++;
            }
        }

        return remainingErgenkas;
    }

}
