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
 *
 * @param category the academic category this subject belongs to
 * @param minAmountEnrolled minimum amount of subject enrolled for the category
 *                          
 * @throws IllegalArgumentException if the category is null
 * @throws IllegalArgumentException if the minAmountEnrolled is negative
 */
public record SubjectRequirement(Category category, int minAmountEnrolled) {

    public SubjectRequirement{
        if(category == null){
            throw new IllegalArgumentException("Cant be null");
        }
        if(minAmountEnrolled <= 0){
            throw new IllegalArgumentException("Cant be negative");
        }
    }
}

