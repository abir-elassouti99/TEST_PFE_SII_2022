package sii.maroc;

public class Meal {
	private int number_Salad;
	
	private boolean MealInPreparationLine=false;
	
	public Meal() {
    	this.MealInPreparationLine=MealInPreparationLine;
    }
    

	public int getNumber_Salad() {
		return number_Salad;
	}

	public void setNumber_Salad(int number_Salad) {
		this.number_Salad = number_Salad;
	}

	
	public boolean isMealInPreparationLine() {
		return MealInPreparationLine;
	}
	public void setMealInPreparationLine(boolean mealInPreparationLine2) {
		this.MealInPreparationLine = mealInPreparationLine2;
		
	}
	
	public int servedDishes() {
	    
		if (MealInPreparationLine==true) {
			return number_Salad;}
		
			else return 0;
	}

	public int cookingDuration() {
	
		return number_Salad*6;
	}

}
