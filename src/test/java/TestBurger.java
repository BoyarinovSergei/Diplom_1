import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class TestBurger {
    private Burger burger;

    @Mock
    private Ingredient ingredient;

    @Mock
    Bun bun;

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

    @Test
    public void testBurgerGetPriceMethod() {
        burger.setBuns(bun);
        Mockito.when(bun.getPrice()).thenReturn(4.5f);

        burger.addIngredient(new Ingredient(null, "First", 11.5f));
        burger.addIngredient(new Ingredient(null, "Second", 5.5f));

        var expectedResult = (bun.getPrice() * 2) +
                burger.ingredients.get(0).price +
                burger.ingredients.get(1).price;

        Assert.assertEquals(expectedResult, burger.getPrice(), 0.0);
    }

    @Test
    public void testBurgerGetReceiptMethod() {
        burger.setBuns(bun);
        Mockito.when(bun.getName()).thenReturn("new bun name");

        burger.addIngredient(new Ingredient(SAUCE, "FirstIng", 11.5f));
        burger.addIngredient(new Ingredient(FILLING, "SecondIng", 5.5f));
        burger.getReceipt();

        Mockito.verify(bun, Mockito.times(2)).getName();
    }
}
