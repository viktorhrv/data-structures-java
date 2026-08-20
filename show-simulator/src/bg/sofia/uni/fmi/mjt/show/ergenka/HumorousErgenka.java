/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.sofia.uni.fmi.mjt.show.ergenka;

import bg.sofia.uni.fmi.mjt.show.date.DateEvent;

/**
 *
 * @author user
 */
public class HumorousErgenka implements Ergenka{
    
    private String name;
    private short age;
    private int romanceLevel;
    private int humorLevel;
    private int rating;
    
    public HumorousErgenka(String name, short age, int romanceLevel, int humorLevel, int rating){
       this.name = name; 
       this.age = age;
       this.romanceLevel = romanceLevel;
       this.humorLevel = humorLevel;
       this.rating = rating;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public short getAge() {
        return age;
    }

    @Override
    public int getRomanceLevel() {
        return romanceLevel;
    }

    @Override
    public int getHumorLevel() {
        return humorLevel;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void reactToDate(DateEvent dateEvent) {
        int bonusses = 0;
        
        if(dateEvent.getDuration() >=30 && dateEvent.getDuration() <= 90){
            bonusses += 4;
        }else if(dateEvent.getDuration()<30){
            bonusses -= 2;
        }else{
            bonusses -=3;
        }
        rating = (humorLevel*5)/dateEvent.getTensionLevel() + romanceLevel/3 + bonusses;
    
    }
    
}
