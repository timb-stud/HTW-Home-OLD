/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package htwhome;

import Sensor.AbstractTest.OnOffSensor;
import Sensor.AbstractTest.PercentSensor;

/**
 *
 * @author christian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("OnOff Test");
        OnOffSensor lampe = new OnOffSensor(1, "OnOffLampe", "Test Lampe Abstract");
        System.out.println("Info: " + lampe.getInfo());
        System.out.println(lampe.toString());
        lampe.setStatus(true);
        System.out.println(lampe.toString());


        System.out.println("\nProzent Test");
        PercentSensor markise = new PercentSensor(2, "ProzentMarkise", "Küchen Markise");
        System.out.println("Info: " + markise.getInfo());
        System.out.println(markise.toString());
        markise.setStatus(50);
        System.out.println(markise.toString());
    }

}
