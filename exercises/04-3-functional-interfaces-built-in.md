# Using Built-in Functional Interfaces

__Objective__: To understand built-in Functional Interfaces and how you can implement them using lambdas.

<style>
details {
  margin: 2em;
}
</style>

### 1. Use the Predicate Interface

- The `Predicate` interface checks if a value meets a test (for example, whether it is odd or even or divisible by 3).
- Below is an example of creating an `isEven` predicate with an anonymous class.
- Convert it to use a lambda instead.
- Compile and test your solution.

    ```java
    Predicate<Integer> isEven = new Predicate<Integer>() {
        @Override
        public boolean test(Integer n) {
            return n % 2 == 0;
        }
    };
    System.out.println(isEven.test(4)); // should print true
    ```

<details>
<summary>Reveal Solution</summary>

```java
import java.util.function.Predicate;

public class IsEven {
  public static void main(String[] args) {
    Predicate<Integer> isEven = n -> n % 2 == 0;
    System.out.println(isEven.test(4)); // should print true
  }
}

```
</details>


### 2. Use the Function Interface

- Use a lambda to implement the `Function` interface that squares a number.
- Call the appropriate method on that instance to print out the square of an integer of your choice.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.function.Function;

public class SquareIt {
  public static void main(String[] args) {
    Function<Integer, Integer> square = n -> n * n;
    System.out.println(square.apply(5));  // should print 25

  }
}
```
</details>


### 3. Use Functional Interfaces with Existing Java APIs

- The code below is incomplete. It needs an "action listener" to perform an action when the button is clicked.
- Complete the code, compile, run and test it.

```java
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class LambdaButtonExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a new JFrame
            JFrame frame = new JFrame("Lambda Button Example");

            // Set the default close operation
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton button = new JButton("Click Me!");

            // Add an action listener to the button using a lambda expression
            // TODO: Add a call to button.addActionListener().
            //       The argument should be a lambda which prints
            //       out a message.
            // YOUR CODE HERE

            frame.add(button);
            frame.setSize(300, 200);

            // Center the frame
            frame.setLocationRelativeTo(null);

            frame.setVisible(true);
        });
    }
}
```
