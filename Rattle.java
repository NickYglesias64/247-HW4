public class Rattle extends Toy {

    public Rattle() {
        name = "Rattle";
    }

    /**
     * Overrides the assemble in the Toy class and calls the super
     * then outputs specific outputs for this class
     */
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Create the frame\n" +
                "Add the pebbles\n" +
                "Secure the sides");
    }
}
