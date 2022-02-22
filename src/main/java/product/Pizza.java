package product;

public class Pizza {
        private final String name;

        public Pizza(String name) {
            this.name = name;
        }

        public String getTicket() {
            switch (name) {
                case ("PROSCIUTTO E FUNGHI"):
                    return "PROSCIUTTO E FUNGHI   12,50€\n" +
                            "   _____________________________\n" +
                            "   TOTAL                 12,50€";
                case "PROSCIUTTO":
                    return "PROSCIUTTO   12,00€\n" +
                            "   _____________________________\n" +
                            "   TOTAL                 12,00€";
                case "MARGHERITA":
                    return "MARGHERITA   9,30€\n" +
                            "   _____________________________\n" +
                            "   TOTAL                 9,30€";
                case "4 STAGIONI":
                    return "4 STAGIONI   12,50€\n" +
                            "   _____________________________\n" +
                            "   TOTAL                 12,50€";
                default:
                    throw new IllegalArgumentException();
            }
        }
}
