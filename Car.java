public class Car extends Toy{

    public Car() {
        name = "Car";
    }

    /**
     * Overrides the assemble in the Toy class and calls the super
     * then outputs specific outputs for this class
     */
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Make the body\n" +
                "Add the wheels\n" +
                "Paint the car");
    }
}
