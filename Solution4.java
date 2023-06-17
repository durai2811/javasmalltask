package com.intereface.demo;
/**
Requirements:
•	The Food class must implement the Selectable interface.
•	The onSelect() method in the Food class should display the phrase "The food was selected".
•	The callFoodMethods method should call the methods of a Food object.
•	The callSelectableMethods method should call methods available on any object that implements the Selectable interface.
**/


public class Solution4 {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
    	food.onEat();
    	food.onSelect();
    	
    }

    public static void callSelectableMethods(Selectable selectable) {
    	selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        public void onEat() {
            System.out.println("The food was eaten");
        }

		@Override
		public void onSelect() {
			System.out.println("The food was selected");
			
		}
    }
}