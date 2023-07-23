import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class TestIngredientType {

    private final String enumValue;

    public TestIngredientType(String enumValue) {
        this.enumValue = enumValue;
    }

    @Parameterized.Parameters
    public static Object[] setOfTestData() {
        return new Object[]{
                "SAUCE", "FILLING"
        };
    }

    @Test
    public void testIngredientTypeEnum() {
        IngredientType.valueOf(enumValue);
    }
}
