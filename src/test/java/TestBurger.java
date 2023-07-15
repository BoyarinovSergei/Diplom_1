import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import praktikum.Burger;
import praktikum.Ingredient;

public class TestBurger {
    private Burger burger;

    @Mock
    private Ingredient ingredient;

    @Before
    public void initializeBurgerClass() {
        burger = new Burger();
    }

    @Test
    public void testBurgerAddIngredientMethod() {
        burger.addIngredient(ingredient);
        Assert.assertEquals(1, burger.ingredients.size());
    }

    @Test
    public void testBurgerRemoveIngredientMethod() {
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertEquals(0, burger.ingredients.size());
    }

    @Test
    public void testBurgerMoveIngredientMethod() {
        burger.addIngredient(new Ingredient(null, "First", 11.2f));
        burger.addIngredient(new Ingredient(null, "Second", 5.5f));

        burger.moveIngredient(1, 0);

        Assert.assertEquals("Second", burger.ingredients.get(0).name);
        Assert.assertEquals("First", burger.ingredients.get(1).name);
    }
}
