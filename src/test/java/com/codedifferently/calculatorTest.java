package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {


    @Test
    public void addTesting(){

      //given
      double value = 6.0;
      double currentValue = 6.0;
      calculator calctest = new calculator();

      //when
      calctest.currentValue = currentValue;
      

      //then
      
      double expectedvalue = currentValue + value;
      double actualvalue = calctest.add(value);
   
      Assert.assertEquals(expectedvalue, actualvalue, 0.0);
      

    }

    @Test

    public void subtractTesting(){

        //given
        double value= 2.0;
        double currentValue = 6.0;
        calculator calctest = new calculator();

        // when
        calctest.currentValue = currentValue;

        //then
        double expectedValue = currentValue - value;
        double actualValue = calctest.subtract(value);

        Assert.assertEquals(expectedValue, actualValue, 0.0);


    }


    @Test

    public void multiplyTesting(){

        //given
        double value= 2.0;
        double currentValue = 6.0;
        calculator calctest = new calculator();

        // when
        calctest.currentValue = currentValue;

        //then
        double expectedValue = currentValue * value;
        double actualValue = calctest.multiply(value);

        Assert.assertEquals(expectedValue, actualValue, 0.0);


    }

    @Test

    public void divideTesting(){

        //given
        double value= 2.0;
        double currentValue = 6.0;
        calculator calctest = new calculator();

        // when
        calctest.currentValue = currentValue;

        //then
        double expectedValue = currentValue / value;
        double actualValue = calctest.divide(value);

        Assert.assertEquals(expectedValue, actualValue, 0.0);


    }


    @Test

    public void negeteTesting(){

        //given
        double currentValue = 6.0;
        calculator calctest = new calculator();

        // when
        calctest.currentValue = currentValue;

        //then
        double expectedValue = -(currentValue);
        double actualValue = calctest.negate(currentValue);

        Assert.assertEquals(expectedValue, actualValue, 0.0);


    }

    
    
}