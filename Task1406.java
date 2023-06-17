package com.intereface.demo;
/**
Requirements:
•  	The GrayMouse class must inherit the Mouse class.
•	The Jerry class must inherit the GrayMouse class.
•	The obj variable must store an object that is simultaneously a Mouse, GrayMouse, and Jerry.
•	The main method should call the printClasses method.
**/

public class Task1406 {
	public static void main(String[] args) {
		Object obj = new Jerry();

		Mouse mouse = (Mouse) obj;
		GrayMouse grayMouse = (GrayMouse) mouse;
		Jerry jerry = (Jerry) grayMouse;

		printClasses(obj, mouse, grayMouse, jerry);

	}

	public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
		System.out.println(jerry.getClass().getSimpleName());
		System.out.println(grayMouse.getClass().getSimpleName());
		System.out.println(mouse.getClass().getSimpleName());
		System.out.println(obj.getClass().getSimpleName());
	}

	static class Mouse {
	}

	static class GrayMouse extends Mouse {
	}

	static class Jerry extends GrayMouse {
	}
}
