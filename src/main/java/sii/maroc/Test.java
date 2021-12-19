package sii.maroc;

import static org.fest.assertions.api.Assertions.assertThat;

public class Test {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant("6 balls Mozzarella", "20 tomatoes", "olive oil", "pepper");
        Ticket ticket = restaurant.order("1 Tomato Mozzarella Salad");
        Meal meal = restaurant.retrieve(ticket);
        
        System.out.println(ticket.isOrder_Accepted());
        System.out.println(meal.servedDishes());
        System.out.println(meal.cookingDuration());
	}

}
