package exampleBuilder;

public class PlaceOrder 
{
	public static void main(String[] args)
	{
	MealBuilder mealbuilder = new MealBuilder();
	Meal veg = mealbuilder.vegMeal();
	veg.showMeal();
	System.out.println("Meal Cost: " + veg.getCost());
	
	Meal nonveg = mealbuilder.nonvegMeal();
	nonveg.showMeal();
	System.out.println("Meal Cost: " + nonveg.getCost());
	}
}
