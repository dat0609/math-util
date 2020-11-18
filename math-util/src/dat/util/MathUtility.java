/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.util;

/**
 *
 * @author liemn
 */
public class MathUtility {

    //lm bo thu vien giong Math
    //math.pi,math.sqrt
    //thu vien >> static khi k can luu info cho rieng minh
    // thu vien van can luu info rieng thi van non-static
    public static final double PI = 3.14;

    //
    public static final long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long rs = 1;
        for (int i = 2; i <= n; i++) {
            rs *= 1;
        }
        return rs;
    }
}
