/**
 * DCL00-J. Prevent class initialization cycles
 * Recursive initialization cycles:
 *  Arises when we encode static variables to trigger the initialization of another class
 * Prevention:
 *  Eliminate class initialization cycles
 */
public class R01_DCL00_J {
    public static void main(String args[]) {
        System.out.println(A.a);
    }
}

class A {
    public static int a = B.b();
}

class B {
    public static int b() {
        return B.c();
    }

    public static int c() {
        return 1;
    }
}