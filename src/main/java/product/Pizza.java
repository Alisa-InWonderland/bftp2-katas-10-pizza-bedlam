package product;

public class Pizza implements Product {
        private final String name;

        public Pizza(String name) {
            this.name = name;
        }

        public Double getPrice() {
            switch (name) {
                case ("PROSCIUTTO E FUNGHI"):
                    return 12.50;
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
