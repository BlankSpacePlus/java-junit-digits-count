package com.blankspace.test;

import com.blankspace.test.exception.ANoLessThanBException;
import com.blankspace.test.exception.NumberOutOfBoundException;

public class DigitCount {

    private static final int DIGIT_NUM = 10, INIT_SIZE = 20;

    private static void solve(long x, long[] count, long[] ten, long[] dp) {
        int[] num = new int[INIT_SIZE];
        int len = 0;
        while (x > 0) {
            num[++len] = (int) (x % DIGIT_NUM);
            x = x / DIGIT_NUM;
        }
        for (int i = len; i >= 1; i--) {
            for (int j = 0; j <= DIGIT_NUM - 1; j++) {
                count[j] += dp[i - 1] * num[i];
            }
            for (int j = 0; j < num[i]; j++) {
                count[j] += ten[i - 1];
            }
            long num2 = 0;
            for (int j = i - 1; j >= 1; j--) {
                num2 = num2 * DIGIT_NUM + num[j];
            }
            count[num[i]] += num2 + 1;
            count[0] -= ten[i - 1];
        }
    }

    public static long[] digitCount(long a, long b) throws NumberOutOfBoundException, ANoLessThanBException {
        final long lowerBound = 0, upperBound = 10_000_000_000_000L;
        final int initDpSize = 15;
        if (a <= lowerBound || b <= lowerBound || a >= upperBound || b >= upperBound) {
            throw new NumberOutOfBoundException();
        }
        if (a >= b) {
            throw new ANoLessThanBException();
        }
        long[] result = new long[DIGIT_NUM];
        long[] ten = new long[INIT_SIZE];
        long[] dp = new long[INIT_SIZE];
        long[] countA = new long[INIT_SIZE];
        long[] countB = new long[INIT_SIZE];
        ten[0] = 1;
        for (int i = 1; i <= initDpSize; i++) {
            dp[i] = dp[i - 1] * DIGIT_NUM + ten[i - 1];
            ten[i] = DIGIT_NUM * ten[i - 1];
        }
        solve(a - 1, countA, ten, dp);
        solve(b, countB, ten, dp);
        for (int i = 0; i < DIGIT_NUM; i++) {
            result[i] = countB[i] - countA[i];
        }
        return result;
    }

}
