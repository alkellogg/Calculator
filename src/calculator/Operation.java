/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

/**
 *
 * @author audreykellogg
 */
public enum Operation {
    ADDITION("+"), SUBTRACTION("-"), MULTIPLICATION("x"), DIVISION("÷"), NONE("");
    
    private Operation(String label) {
        this.label = label;
    }
    
    private String label;

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
}
