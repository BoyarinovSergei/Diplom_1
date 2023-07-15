import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import praktikum.Bun;

public class TestBun {
    private static final String bunName = "Новая булочка";
    private static final float bunPrice = 12345.123f;

    private static Bun bun;

    @BeforeClass
    public static void initializeBun() {
        bun = new Bun(bunName, bunPrice);
    }

    @Test
    public void testBunGetNameMethod() {
        Assert.assertEquals(bunName, bun.getName());
    }

    @Test
    public void testBunGetPriceMethod() {
        Assert.assertEquals(bunPrice, bun.getPrice(), 0.0);
    }
}
