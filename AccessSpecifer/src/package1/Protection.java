package package1;

public class Protection
{
    private int private_a=100;
    protected int protected_b=98;
    int default_c=97;
    public int pubic_d=96;
    public Protection()
    {
        System.out.println("Private:"+private_a);
        System.out.println("Protected:"+protected_b);
        System.out.println("Default:"+default_c);
        System.out.println("Public:"+pubic_d);
        System.out.println("------------------");
    }
}
