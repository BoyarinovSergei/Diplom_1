import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static praktikum.IngredientType.SAUCE;

public class TestIngredient {
    private static final IngredientType INGREDIENT_TYPE = SAUCE;
    private static final String INGREDIENT_NAME = "name";
    private static final float INGREDIENT_PRICE = 45.5f;
    private static final Ingredient INGREDIENT =
            new Ingredient(INGREDIENT_TYPE, INGREDIENT_NAME, INGREDIENT_PRICE);

    @Test
    public void testIngredientGetPriceMethod() {
        Assert.assertEquals(INGREDIENT_PRICE, INGREDIENT.getPrice(), 0.0);
    }

    @Test
    public void testIngredientGetNameMethod() {
        Assert.assertEquals(INGREDIENT_NAME, INGREDIENT.getName());
    }

    @Test
    public void testIngredientGetTypeMethod() {
        Assert.assertEquals(INGREDIENT_TYPE, INGREDIENT.getType());
    }
}
