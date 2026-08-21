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
public class LowAttributeSumEliminationRule implements EliminationRule{
    
    private int threshold;
    
    public LowAttributeSumEliminationRule(int threshold){
        this.threshold = threshold;
    }
    
    @Override
    public Ergenka[] eliminateErgenkas(Ergenka[] ergenkas) {
        int countErgenkas = 0;
        // Count the ergenkas that remain
        for(Ergenka ergenka : ergenkas){
            if(ergenka.getHumorLevel() + ergenka.getRomanceLevel() >= threshold){
                countErgenkas++;
            }
        }
        Ergenka[] remainingErgenkas = new Ergenka[countErgenkas];
        
        int index = 0;
        // Put the remaining ergenkas into the new array

        for(Ergenka ergenka : ergenkas){
            if(ergenka.getHumorLevel() + ergenka.getRomanceLevel() >= threshold){
                remainingErgenkas[index] = ergenka;
                index++;
            }
        }
        return remainingErgenkas;
    }


    
}
