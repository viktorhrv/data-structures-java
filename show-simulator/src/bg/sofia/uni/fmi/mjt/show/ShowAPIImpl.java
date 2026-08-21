/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.sofia.uni.fmi.mjt.show;

import bg.sofia.uni.fmi.mjt.show.date.DateEvent;
import bg.sofia.uni.fmi.mjt.show.elimination.EliminationRule;
import bg.sofia.uni.fmi.mjt.show.elimination.LowestRatingEliminationRule;
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
        this.defaultEliminationRules = defaultEliminationRules;
    }
    
    @Override
    public Ergenka[] getErgenkas() {
            return ergenkas;
    }

    @Override
    public void playRound(DateEvent dateEvent) {
      for(Ergenka ergenka : ergenkas){
          organizeDate(ergenka, dateEvent);
      }
      
    }

    @Override
    public void eliminateErgenkas(EliminationRule[] eliminationRules) {
    if (eliminationRules.length == 0) {
        EliminationRule rule = new LowestRatingEliminationRule();
        ergenkas = rule.eliminateErgenkas(ergenkas);
    } else {
        for (int i = 0; i < eliminationRules.length; i++) {
            ergenkas = eliminationRules[i].eliminateErgenkas(ergenkas);
        }
    }
}

    @Override
    public void organizeDate(Ergenka ergenka, DateEvent dateEvent) {
        ergenka.reactToDate(dateEvent);
    }
    
    
}
