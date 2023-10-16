package org.example;
public class Numero {
    int num1;
    int num2;
    int num3;

    public Numero(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }
    public static int numero_mayor(int a, int b, int c) {
        int num = 0;
        if (a >= b && a >= c) {
            num = a;
        } else if (b >= a && b >= c) {
            num = b;
        } else if (c >= b && c >= a) {
            num = c;
        }
        return num;
    }
}