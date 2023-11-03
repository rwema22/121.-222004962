public class r1 {

    public double methodsimpleinterest(double p, double r, double t) {

        return (p * r / 100 * t);
    }

    public static void main(String[] arg) {

        r1 objct = new r1();
        double p = 100000;
        double r = 5;
        double t = 5;
        double result = objct.methodsimpleinterest(p, r, t);
        System.out.println("simple Interestis:" + result);

    }
}
