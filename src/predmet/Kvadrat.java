package predmet;

public class Kvadrat extends Predmet{

    private double a;

    @Override
    protected void povrsina() {
        System.out.println("Povrsina kvadrata: " + Math.pow(a, 2));
    }
}
