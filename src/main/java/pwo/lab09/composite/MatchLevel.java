/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.composite;


/**
 *
 * @author gman
 */
public class MatchLevel extends WaterSystem {
        public void fill() {
        super.fill();
    }

    public void afterFill() {
        super.afterFill();
    }

    public void drain() {
        super.drain();
    }

    public void afterDrain() {

        super.afterDrain();
    }

    @Override
    public void checkIfSufficient() {
       System.out.println("Poziom wody jest odpowiedni");
       super.checkIfSufficient();
    }
    
    
}
