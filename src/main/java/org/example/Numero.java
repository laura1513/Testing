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
    public static int numero_mayor(Numero num) {
        int n = 0;
        if (num.getNum1() >= num.getNum2() && num.getNum1() >= num.getNum3()) {
            n = num.getNum1();
        } else if (num.getNum2() >= num.getNum1() && num.getNum2() >= num.getNum3()) {
            n = num.getNum2();
        } else if (num.getNum3() >= num.getNum2() && num.getNum3() >= num.getNum1()) {
            n = num.getNum3();
        }
        return n;
    }
}