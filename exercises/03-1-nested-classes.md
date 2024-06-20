### Lab Exercise 1: Understanding Static Nested Classes

**Objective:** Understand how to create and use static nested classes.

**Instructions:**

1. Create a new Java project and add a class named `Company`.
2. Within `Company`, create a static nested class named `Employee` with the following:
   - A static method `companyDetails` that prints "Company: ABC Corp".
   - A method `employeeDetails` that prints "Employee: John Doe".
3. In the main method of `Company`, instantiate `Employee` and call both `companyDetails` and `employeeDetails`.

### Lab Exercise 2: Working with Inner Classes

**Objective:** Learn how to create and use inner classes.

**Instructions:**

1. Create a new Java project and add a class named `Library`.
2. Within `Library`, create an inner class named `Book` with the following:
   - A method `bookDetails` that prints "Book: Java Programming".
3. In the main method of `Library`, instantiate `Book` and call the `bookDetails` method.

### Lab Exercise 3: Using Local Classes

**Objective:** Learn how to create and use local classes within a method.

**Instructions:**

1. Create a new Java project and add a class named `Calculator`.
2. Within `Calculator`, create a method named `performCalculation` that does the following:
   - Declare a local class `Addition` with a method `add` that takes two integers and returns their sum.
   - Instantiate `Addition` and use it to add two numbers, printing the result.



### Lab Exercise 4: Creating Anonymous Classes

**Objective:** Understand how to use anonymous classes.

**Instructions:**

1. Create a new Java project and add a class named `ButtonHandler`.
2. Within `ButtonHandler`, create a method named `handleButtonClick` that does the following:
   - Use an anonymous class to implement the `Runnable` interface.
   - Override the `run` method to print "Button Clicked".
   - Create a `Thread` with the anonymous `Runnable` and start it.


### Lab Exercise 5: Implementing Event Handling in GUI

**Objective:** Learn how to use nested classes for event handling in a GUI application.

**Instructions:**

1. Create a new Java project and add a class named `GUIExample`.
2. Within `GUIExample`, create a `JButton` and set up an event listener using an anonymous class to handle button clicks.
3. When the button is clicked, print "Button clicked!".

**Sample Code:**
```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIExample {
    private JButton button;

    public GUIExample() {
        button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Example");
        GUIExample gui = new GUIExample();
        frame.add(gui.button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

These exercises should help students understand and apply the concepts of nested classes in practical scenarios.