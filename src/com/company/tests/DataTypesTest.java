package com.company.tests;

import datatypes.DataTypes;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataTypesTest {
    DataTypes dataTypes = new DataTypes();

    @Test
    public void  inchesToMeters(){
        double meters = DataTypes.inchesToMeters(1);
        assertEquals(0.0254,meters);
        //assertEquals(0.0252,meters);
    }

    @Test
    public void sumOfDigits3(){
        assertEquals(6, dataTypes.sumOfDigits3(123));
    }

    @Test
    public void power2_3_4(){
        assertArrayEquals(new double[]{4,8,16}, dataTypes.power2_3_4(2));
    }

}