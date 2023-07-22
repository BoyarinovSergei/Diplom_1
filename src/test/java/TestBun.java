import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestBun {
    private final String name;
    private final float price;

    public TestBun(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] setOfTestData() {
        return new Object[][]{
                {"Флюоресцентная булка R2-D3", -10000f},
                {"", 0f},
                {null, 10000f},
                {"N-200i", 1f}
        };
    }

    @Test
    public void returnActualNameAndPrice() {
        Bun bun = new Bun(name, price);
        assertEquals(name, bun.getName());
        assertEquals(price, bun.getPrice(), 0);
    }
}