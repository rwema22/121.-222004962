public class r2 {
    public double interest(int p, double r, int t, int n) {
        return p * (Math.pow((1 + r / 1200), n * t));

    }
}

class main {
    public static void main(String[] args) {
        r2 myobjeR2 = new r2();
        double answer = myobjeR2.interest(500000, 18, 3, 12);
        System.out.println("result is:" + answer);
    }
}