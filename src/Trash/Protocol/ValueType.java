/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Trash.Protocol;

/**
 *
 * @author christian
 */
public class ValueType {

    private String valueType;
    private boolean onOff;
    private int percent;
    private double value;

//    private enum ValueTypes {ONOFF, PERCENT, VALUE}

    public ValueType(String valueType) {
        this.valueType = valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getValueType() {
        return valueType;
    }


    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
//        this.percent = -1;
//        this.value = ;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public boolean getOnOff() {
        return onOff;
    }

    public int getPercent() {
        return percent;
    }

    public double getValue() {
        return value;
    }

}
