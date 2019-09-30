public class Doll extends Toy{

    public Doll() {
        name = "Doll";
    }

    /**
     * Overrides the assemble in the Toy class and calls the super
     * then outputs specific outputs for this class
     */
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Connecting all the pieces\n" +
                "Painting the face\n" +
                "Adding the dress\n" +
                "Adding the shoes");
    }
}
