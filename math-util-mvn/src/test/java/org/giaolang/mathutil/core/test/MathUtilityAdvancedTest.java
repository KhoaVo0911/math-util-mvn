/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.giaolang.mathutil.core.test;

import org.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ACER
 */
public class MathUtilityAdvancedTest {
    
    public static Object[][] initTestData() {
        
        Object testData[][] = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24},  
                               {6, 720}};
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource(value = "initTestData")
                                                           //cot 0      cot 1
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}
