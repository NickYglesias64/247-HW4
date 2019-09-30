//Nicholas Yglesias
public class ToyStore {

    public ToyStore() {}

    /**
     * Creates the Toy type and takes in the type input from the user
     * Also calls the toy classes methods
     * @param type
     * @return
     */
    public Toy orderToy(String type) {
        Toy toy;

        if(type.equals("doll")) {
            toy = new Doll();
        } else if(type.equals("car")) {
            toy = new Car();
        } else if(type.equals("rattle")) {
            toy = new Rattle();
        } else {
            toy = new Doll();
        }
        toy.assemble();
        toy.boxToy();
        toy.priceToy();

        return toy;
    }

}
