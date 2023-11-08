
class inhert {

    public static void main(String args[]) {
        A o = new A();
        o.display();
        o.sub();
        o.mult();
        o.add();
        o.divide();

    }
}

class D {
    int a = 50;
    int b = 30;

    public void mult() {
        System.out.println("The multiplication is" + a * b);
    }

}

class C extends D {
    public void add() {
        System.out.println("The addition is " + a + b);
    }

}

class B extends C {
    public void divide() {
        System.out.println("The division is " + a / b);
    }
}

interface E {
    void display();
}

class A extends B implements E {

    public void display() {
        System.out.println("This is interface implemented");
    }

    public void sub() {

        int su = a - b;
        System.out.println("the substraction is " + su);
    }
}
