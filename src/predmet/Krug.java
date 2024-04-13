package predmet;

import java.text.DecimalFormat;

public class Krug extends Predmet{

        private double r;
        private final static double PI = Math.PI;

    @Override
    protected void povrsina() {
        super.povrsina();
        DecimalFormat df = new DecimalFormat("#.##");
        double povrsina = Math.pow(r, 2) * PI;
        System.out.println(df.format(povrsina));
    }

    //overloading
    protected void povrsina(double r) {
        super.povrsina();
        DecimalFormat df = new DecimalFormat("#.##");
        double povrsina = Math.pow(r, 2) * PI;
        System.out.println(df.format(povrsina));
    }

    protected void povrsina(double r, String ispis) {
        super.povrsina();
        DecimalFormat df = new DecimalFormat("#.##");
        double povrsina = Math.pow(r, 2) * PI;
        System.out.println(ispis + df.format(povrsina));
    }





    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
