package inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RestaurantTest {
    Restaurant input;

    @Before
    public void start() throws Exception {
        input = new Restaurant("Beth's Cafe", 4, "$$");

        Review myReview = new Review(5, "DJ", "Waffles are ridiculously good");
        input.addReview((myReview));
    }

    @Test
    public void testConstructor() {
        Assert.assertEquals();
    }
}
