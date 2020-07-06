package com.codedifferently;

public class calculator {

    private double value;
    public double currentValue;

    public double add (double value){

        currentValue += value; 
        return currentValue;
        
    }


    public double subtract (double value){
        currentValue = currentValue - value;
        return currentValue;
    }


    public double divide (double value){
        currentValue = currentValue /value;
        return currentValue;
    }

    public double multiply (double value){
        currentValue = currentValue*value;
        return currentValue;
    }



    public double negate (double value){
        currentValue = -(currentValue);
        return currentValue;
    }
    



    public void clear (double value){

    }




    public void setCurrentVal (double value){
    }



}