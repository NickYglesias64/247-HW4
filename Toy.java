//Nicholas Yglesias
public abstract class Toy {
    protected String name;

    /**
     * creates three methods to be called when making the toys
     * that each have different outputs
     */
    public void assemble() {
        System.out.println("putting together a "+name);
    }

    public void boxToy() {
        System.out.println("putting the "+name+" in a box");
    }

    public void priceToy() {
        System.out.println("adding price on "+name);
    }

}
