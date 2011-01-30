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
public interface Sensor_Interface {
    public void setID(int id);
    public int getID();

    public void setName(String name);
    public String getName();

    public void setInfo(String info);
    public String getInfo();

    public void setStatus(ValueType vt); // uebergabewert pruefen
    public ValueType getStatus(); //rueckgabewert pruefen

//    public void setLocation(String location);
//    public String getLocation();
}
