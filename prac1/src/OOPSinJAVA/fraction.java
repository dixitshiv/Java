package OOPSinJAVA;

public class fraction {
    public static class Fractionvalue {
        int num;
        int den;

        public Fractionvalue(int num, int den) {
            this.num = num;
            this.den = den;
        }

    }


    public static void main(String[] args) {
        Fractionvalue f1 = new Fractionvalue(3, 7);
        Fractionvalue f2 = new Fractionvalue(7, 3);
    }
}
