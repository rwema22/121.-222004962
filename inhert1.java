class inhert1 {
    public static void main(String args[]) {
        A myobj = new A();
        myobj.show();
        myobj.display();
        myobj.calculate();
        myobj.add();
        myobj.interf();
    }
}

class D {
    int a = 5;
    int b = 10;

    public void add() {
        int result = a + b;
        System.out.println(result);
    }
}

class C extends D {
    public static void display() {
        System.out.println(" This is class B");
    }
}

class B extends C {
    public static void calculate() {
        int c = 5;
        int d = 20;
        int result = d * c;
    }
}

interface E {
    void interf();
}

class A extends B implements E {
    public void show() {
        System.out.println(a + b);
    }

    public void interf() {
        System.out.println("This is interface's method");
    }
}
