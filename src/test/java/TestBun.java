import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import praktikum.Bun;

public class TestBun {
    private static final String BUN_NAME = "Новая булочка";
    private static final float BUN_PRICE = 12345.123f;

    private static Bun bun;

    @BeforeClass
    public static void initializeBun() {
        bun = new Bun(BUN_NAME, BUN_PRICE);
    }

    @Test
    public void testBunGetNameMethod() {
        Assert.assertEquals(BUN_NAME, bun.getName());
    }

    @Test
    public void testBunGetPriceMethod() {
        Assert.assertEquals(BUN_PRICE, bun.getPrice(), 0.0);
    }
}
