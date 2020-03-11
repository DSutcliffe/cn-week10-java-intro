package com.company;

// Private is default - ie. if you don't start class with public
public class SubClass extends TestClass {

    public void displayInformation() {
        System.out.println("This is the subclass.");
    }

    public void connectingPage() {
        System.out.println("I am in the SubClass");
    }

    public void myNewMethod() {
        SubClass newSubClass = new SubClass();
        newSubClass.displayInformation();
        // grab parent class's displayInformation
        super.displayInformation();
    }
}
