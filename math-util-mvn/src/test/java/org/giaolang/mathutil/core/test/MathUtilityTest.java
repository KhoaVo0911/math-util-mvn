/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.giaolang.mathutil.core.test;

import org.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //assertEquals(69, 69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        
    }
    
}



//TDD: TEST DRIVEN DEVELOPMENT
//KI THUAT LAP TRINH MA DAN DEV VIET CODE DEN DAU THI VIET BO TEST CASE DEN DO(JUNIT, NUNIT, MOCHA) VA DUNG 2 MAU XANH DO DE 
//DAM BAO CHAT LUONG CODE/CHAT LUONG HAM!! DA DOC XONG

//HOC KY THUAT KIEM THU CHO DAN DEV - KI THUAT DDT
//DATA DRIVEN TESTING - BO TRO VIEC XAI UNIT TEST
//GIUP CAC TEST CASE DE DOC HON, DE BAO TRI HON
//PHAN MO RONG THEM CUA TDD
//LA KI THUAT VIET CODE KIEM THU MA TACH BO DATA KIEM THU
//RA KHOI CAU LENH ASSERTEQUALS() CHO DE KIEM SOAT TEST CASE 