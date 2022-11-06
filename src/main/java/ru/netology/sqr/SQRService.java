package ru.netology.sqr;
public class SQRService {
    public int calcSqrt(int a, int b) {
        int result = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= a) & (i * i) <= b) {
                result = i;
                System.out.println(result);
            }
        }
        return result;
    }
}

