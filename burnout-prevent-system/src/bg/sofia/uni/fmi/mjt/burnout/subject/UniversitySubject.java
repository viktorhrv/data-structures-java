/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package bg.sofia.uni.fmi.mjt.burnout.subject;

/**
 *
 * @author user
 */

/**
 * @param name the name of the subject
 * @param credits number of credit hours for this subject
 * @param rating difficulty rating of the subject (1-5)
 * @param category the academic category this subject belongs to
 * @param neededStudyTime estimated study time in days required for this subject
 *                        
 * @throws IllegalArgumentException if the name of the subject is null or blank
 * @throws IllegalArgumentException if the credits are not positive
 * @throws IllegalArgumentException if the rating is not in its bounds
 * @throws IllegalArgumentException if the Category is null
 * @throws IllegalArgumentException if the neededStudy time is not positive
 */
public record UniversitySubject(String name, int credits, int rating, Category category, int neededStudyTime) {
    public UniversitySubject{
        if(name == null){
            throw new IllegalArgumentException("Name cant be null or blank");
        }
        if(credits <= 0){
            throw new IllegalArgumentException("Credits cant be negative");
        }
        if(rating <1 || rating > 5){
            throw new IllegalArgumentException("Out of its bounds");
        }
        if(category == null){
            throw new IllegalArgumentException("Category cant be null");
        }
        if(neededStudyTime <= 0 ){
            throw new IllegalArgumentException("Cant be negative");
        }
}
}
