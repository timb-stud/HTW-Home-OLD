/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Sensor.AbstractTest;

/**
 *
 * @author christian
 */
public abstract class Sensor_Abstract {

    private int id;
    private String name;
    private String info;

    public Sensor_Abstract(int id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
