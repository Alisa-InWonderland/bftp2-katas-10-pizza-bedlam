package product;

public class Extras implements Product{
    private final String name;

    public Extras(String name) {
        this.name = name;
    }

    public Double getPrice() {
        switch (name) {
            case ("Jamón dulce"):
                return 0.90;
            case "PROSCIUTTO":
                return 12.00;
            case "MARGHERITA":
                return 9.30;
            case "4 STAGIONI":
                return 12.50;
            default:
                throw new IllegalArgumentException();
        }
    }
}

