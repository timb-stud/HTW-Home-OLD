/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Sensor.AbstractTest;

/**
 *
 * @author christian
 */
public class OnOffSensor extends Sensor_Abstract {

    private boolean status;

    public OnOffSensor(int id, String name, String info) {
        super(id, name, info);
        this.status = false;
    }

    public OnOffSensor(int id, String name) {
        this(id,name,"keine Information vorhanden");
    }

    public void setStatus(boolean trueFalse){
        this.status = trueFalse;
    }

    public boolean getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return "Status Licht: " + getStatus();
    }

}
