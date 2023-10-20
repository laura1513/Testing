import org.example.Numero;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestPrueba {
    @Test
    public void pruebauno() {
        Numero num = new Numero(5,3,7);
        int n = Numero.numero_mayor(num);

        Assert.assertEquals(n, 7);

        /*boolean b = false;
        if(ab(num.getNum1(), num.getNum2()) && !ac(num.getNum1(), num.getNum3()) && !bc(num.getNum2(), num.getNum3())) {
            b = true;
        }
        if(b){
            System.out.println("El test ha pasado la prueba y el mayor número es " + num.getNum3());
        } else {
            System.out.println("El test no ha pasado la prueba y el mayor número no es " + num.getNum3());
        }*/
    }
    @Test
    public void pruebados() {
        Numero num = new Numero(5,3,4);
        int n = Numero.numero_mayor(num);

        Assert.assertEquals(n, 5);
        /*boolean b = false;
        if(ab(num.getNum1(), num.getNum2()) && ac(num.getNum1(), num.getNum3())) {
            b = true;
        }
        if(b){
            System.out.println("El test ha pasado la prueba y el mayor número es " + num.getNum1());
        } else {
            System.out.println("El test no ha pasado la prueba y el mayor número no es " + num.getNum1());
        }*/
    }
    @Test
    public void pruebatres() {
        Numero num = new Numero(5,7,6);
        int n = Numero.numero_mayor(num);

        Assert.assertEquals(n, 7);
        /*boolean b = false;
        if(!ab(num.getNum1(), num.getNum2()) && bc(num.getNum2(), num.getNum3())) {
            b = true;
        }
        if(b){
            System.out.println("El test ha pasado la prueba y el mayor número es " + num.getNum2());
        } else {
            System.out.println("El test no ha pasado la prueba y el mayor número no es " + num.getNum2());
        }*/
    }

    @Test
    public void pruebacuatro() {
        Numero num = new Numero(5,7,9);
        int n = Numero.numero_mayor(num);

        Assert.assertEquals(n, 9);
        /*boolean b = false;
        if(!ab(num.getNum1(), num.getNum2()) && !bc(num.getNum2(), num.getNum3())) {
            b = true;
        }
        if(b){
            System.out.println("El test ha pasado la prueba y el mayor número es " + num.getNum3());
        } else {
            System.out.println("El test no ha pasado la prueba y el mayor número no es " + num.getNum3());
        }*/
    }

    /*public static boolean ab (int a, int b) {
        boolean ok = false;
        if (a > b) {
            ok = true;
        }
        return ok;
    }
    public static boolean ac (int a, int c) {
        boolean ok = false;
        if (a > c) {
            ok = true;
        }
        return ok;
    }
    public static boolean bc (int b, int c) {
        boolean ok = false;
        if (b > c) {
            ok = true;
        }
        return ok;
    }*/
}
