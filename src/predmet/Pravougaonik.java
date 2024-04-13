package predmet;

public class Pravougaonik extends Predmet{


    @Override
    protected void povrsina() {
        super.povrsina();
        System.out.println(x*y);
    }


}
