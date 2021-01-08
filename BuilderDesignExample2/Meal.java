package exampleBuilder;

import java.util.ArrayList;
import java.util.List;

public class Meal 
{
	List<Item> list = new ArrayList<Item>();
	
	public void addItem(Item item)
	{
		list.add(item);
	}
	
	public float getCost()
	{
		float cost = 0.0f;
		for (Item item : list) 
		{
	         cost += item.price();
	    }		
	      return cost;
	}
	
	public void showMeal()
	{
		for(Item i : list)
		{
			System.out.print("Item Name " + i.name());
			System.out.print("\t Item Packing " + i.packing().pack());
			System.out.println("\t Item Price " + i.price() );
		}
	}
}
