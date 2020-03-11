package com.company;

class TestClass {

    private void secretInformation() {
        System.out.println("Sssshhh... Will Will have a fit if he reads this?");
    }
    public void displayInformation() {
        // can call private method within same class
//        secretInformation();
//        System.out.println("This should sat something. Anything Please.");
        System.out.println("This is the parent class");
    }
}

// Main method where we execute everything
public class Main {

    public static void main(String[] args) {
	// write your code here

        // Create a new instance of class
        TestClass newTestClass = new TestClass();
//        newTestClass.displayInformation();

        // Create new instance
        SubClass newSubClass = new SubClass();
//        newSubClass.connectingPage();
        newSubClass.myNewMethod();

        String name = "Danny";
        int age = 41;
        boolean really = true;
//        char workPlace = 'Code Nation';
        String workPlace = "Code Nation"; // Doesn't like single quotes for string
        char workingChar = 'C';
        float weightInLbs = 153.9f;
        double weightInKG = 69.9;

        // type 'sout' for shortcut = Console.Log
//        System.out.println(name);
    }
}
