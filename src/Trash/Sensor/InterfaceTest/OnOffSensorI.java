/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Trash.Sensor.InterfaceTest;

import Trash.Protocol.ValueType;

/**
 *
 * @author christian
 */
public class OnOffSensorI  implements Sensor_Interface{

    private ValueType status;
    private int id;
    private String name;
    private String info;

    public OnOffSensorI(int id, String name, String info) {
        this.status = new ValueType(name);
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public OnOffSensorI(int id, String name) {
        this(id,name,"keine Information vorhanden");
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

    public void setStatus(ValueType vt) {
        this.status = vt;
    }

    public ValueType getStatus() {
        return status;
    }

    public String toString(ValueType vt) {
        //koente mit Enum in ValueType geloest werden
        if (vt.getValueType().equals("OnOff")){
            return (vt.getOnOff()) ? "Lampe an" : "Lampe aus";
        } else if (vt.getValueType().equals("Percent")){
            return "Prozent";
        } else if (vt.getValueType().equals("Value")){
            return "Wert";
        } else {
            return "Falscher Wert";
        }
    }
}
