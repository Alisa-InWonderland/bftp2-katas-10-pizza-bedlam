import product.Pizza;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PizzaBedlamTest {

    @Test
    void pizzaProscuttoEFunghi() {

        assertThat(new Pizza("PROSCIUTTO E FUNGHI").getTicket(), equalTo("PROSCIUTTO E FUNGHI   12,50€\n" +
                "   _____________________________\n" +
                "   TOTAL                 12,50€"));
    }

    @Test
    void pizzaMargherita() {

        assertThat(new Pizza("MARGHERITA").getTicket(), equalTo("MARGHERITA   9,30€\n" +
                "   _____________________________\n" +
                "   TOTAL                 9,30€"));
    }

    @Test
    void pizzaProscutto() {

        assertThat(new Pizza("PROSCIUTTO").getTicket(), equalTo("PROSCIUTTO   12,00€\n" +
                "   _____________________________\n" +
                "   TOTAL                 12,00€"));
    }

    @Test
    void pizza4STAGIONI() {

        assertThat(new Pizza("4 STAGIONI").getTicket(), equalTo("4 STAGIONI   12,50€\n" +
                "   _____________________________\n" +
                "   TOTAL                 12,50€"));
    }
}
