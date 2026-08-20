/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bg.sofia.uni.fmi.mjt.show.date;


public class DateEvent {
    private static final int TENSION_LEVEL_MIN = 0;
    private static final int TENSION_LEVEL_MAX = 10;

    private final String location;
    private final int tensionLevel;
    private final int duration;

    public DateEvent(String location, int tensionLevel, int duration) {
        this.location = location;
        this.duration = duration;
        this.tensionLevel = Math.max(TENSION_LEVEL_MIN, Math.min(tensionLevel, TENSION_LEVEL_MAX));    
    }

    public String getLocation() {
        return location;
    }

    public int getTensionLevel() {
        return tensionLevel;
    }

    public int getDuration() {
        return duration;
    }
}