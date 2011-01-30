/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Trash.Protocol;

/**
 *
 * @author christian
 */
public class OnOff extends ValueType{
    boolean status;

    public OnOff(String name) {
        super(name);
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean trueFalse){
        this.status = trueFalse;
    }

}
