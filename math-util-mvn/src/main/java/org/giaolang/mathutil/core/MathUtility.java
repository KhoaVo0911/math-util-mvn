/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.giaolang.mathutil.core;

/**
 *
 * @author ACER
 */
// class nay clone giong class java.util.Math
// chua cac ham static Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    //hàm getF() là hàm tính n! = 1.2.3..n
    //thiet ke ham nhu sau:
    // 0! = 1! = 1
    //ko co giai thua cho so am. Neu dua -5! -> CHUI; nem ra Exception
    //vi giai thua tang rat nhanh, 21! long ko chua noi (long 18 so 0)
    //20! vua du cho long
    //21! 22! 23! > 20! -> CHUI, nem ra Exception
    
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, please");
        
        if (n == 0 || n ==1)
            return 1;
        
        long product = 1; //bien luu don` cac' tich'
        for (int i = 2; i <= n; i++) 
             product *= i;
        
        return product;
    }
}

//code chuan bi viet, hay dang viet, se tien hanh luon cai viec kiem thu
//viet code den dau, co code kiem thu den do, de dam bao ham` no ngon
//ki thuat code va test code song hanh voi nhau, dan xen voi nhau
// => goi la TDD(Test Driven Development)
