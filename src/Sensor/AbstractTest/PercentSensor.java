/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Sensor.AbstractTest;

/**
 *
 * @author christian
 */
public class PercentSensor extends Sensor_Abstract {

    private int status;


    public PercentSensor(int id, String name, String info) {
        super(id, name, info);
        this.status = -1;
    }

    public PercentSensor (int id, String name) {
        this(id,name,"keine Information vorhanden");
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Prozent: " + getStatus() + " %";
    }
}
