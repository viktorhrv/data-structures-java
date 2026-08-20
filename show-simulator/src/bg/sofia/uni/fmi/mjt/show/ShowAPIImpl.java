/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.sofia.uni.fmi.mjt.show;

import bg.sofia.uni.fmi.mjt.show.date.DateEvent;
import bg.sofia.uni.fmi.mjt.show.elimination.EliminationRule;
import bg.sofia.uni.fmi.mjt.show.ergenka.Ergenka;

/**
 *
 * @author user
 */
public class ShowAPIImpl implements ShowAPI{

    Ergenka[] ergenkas;
    EliminationRule[] defaultEliminationRules;
    
    public ShowAPIImpl(Ergenka[] ergenkas, EliminationRule[] defaultEliminationRules){
        this.ergenkas = ergenkas;
    }
    
    @Override
    public Ergenka[] getErgenkas() {
        
    }

    @Override
    public void playRound(DateEvent dateEvent) {
      
    }

    @Override
    public void eliminateErgenkas(EliminationRule[] eliminationRules) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void organizeDate(Ergenka ergenka, DateEvent dateEvent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
