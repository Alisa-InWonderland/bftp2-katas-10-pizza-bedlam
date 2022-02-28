import product.Pizza;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PizzaBedlamTest {

    @Test
    void pizzaProscuttoEFunghi() {

        assertThat(new Pizza("PROSCIUTTO E FUNGHI").getPrice(), equalTo(12.50));
    }

    @Test
    void pizzaMargherita() {

        assertThat(new Pizza("MARGHERITA").getPrice(), equalTo(9.30));
    }

    @Test
    void pizzaProscutto() {

        assertThat(new Pizza("PROSCIUTTO").getPrice(), equalTo(12.00));
    }

    @Test
    void pizza4STAGIONI() {

        assertThat(new Pizza("4 STAGIONI").getPrice(), equalTo(12.5));
    }
}
