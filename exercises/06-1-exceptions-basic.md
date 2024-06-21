# Exception Handling

__Objective__: To understand and implement basic and advanced exception handling in Java

1. Create a class `ExceptionDemo` with a `main` method.

<details>
<summary>Reveal Solution</summary>

We'll place this in a file called "ExceptionDemo.java":

```java
public class ExceptionDemo {
    public static void main(String[] args) {
        
    }
}
```
</details>

2. Add code in the `main` method to prompt the user to enter a number and read the input.

    - You can use the `Scanner` class.
        - Create a `new Scanner(System.in)` and assign it to a variable.
        - You can then prompt the user to enter a number.
        - Finally, use `scanner.nextLine()` to read their input into a variable.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
    }
}
```
</details>

3. Attempt to parse the input to an integer and handle potential `NumberFormatException`.

    - Use `Integer.parseInt()`, giving it the input from the user.
    - You'll need to surround this with a try-catch block.
    - Display the parsed number to the user, or an error.

<details>
<summary>Reveal Solution</summary>

```java
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        }
    }
}
```
</details>

4. Add a method `readFile` that takes a filename and reads its contents, handling `IOException`.

    - Create a new method named `readFile` in the `ExceptionDemo` class.
    - Use a `BufferedReader` to read the contents of the file line by line.
    - Surround the file reading code with a try-catch block to handle `IOException`.
    - Print each line of the file to the console.

<details>
<summary>Reveal Solution</summary>

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        // Previous code
    }

    public static void readFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
```
</details>

5. Call the `readFile` method from the `main` method and handle any exceptions that might be thrown.

    - In the `main` method, prompt the user to enter a filename.
    - Call the `readFile` method with the provided filename.
    - Surround the method call with a try-catch block if necessary.
    - Print any exceptions that occur.

<details>
<summary>Reveal Solution</summary>

```java
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        }

        System.out.print("Enter a filename: ");
        String filename = scanner.nextLine();
        readFile(filename);
    }

    public static void readFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
```
</details>

6. Implement a custom resource class `MyResource` that implements `AutoCloseable` and use it in a `try-with-resources` statement.

    - Create a class named `MyResource` that implements `AutoCloseable`.
    - In the `MyResource` class, add a method `use()` that simulates resource usage.
    - Implement the `close()` method to print a message indicating the resource is closed.
    - In the `main` method of `ExceptionDemo`, use the `MyResource` class in a try-with-resources statement to ensure it is closed automatically.

<details>
<summary>Reveal Solution</summary>

```java
public class MyResource implements AutoCloseable {
    public void use() {
        System.out.println("Using MyResource");
    }

    @Override
    public void close() {
        System.out.println("Closing MyResource");
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        // Previous code

        try (MyResource resource = new MyResource()) {
            resource.use();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
```
</details>

7. Demonstrate handling multiple exceptions in a single `catch` block by modifying the `main` method to include code that might throw `IOException` and `SQLException`.

    - Add a new method `mightThrowExceptions` in the `ExceptionDemo` class that simulates throwing `IOException` and `SQLException`.
    - In the `main` method, call the `mightThrowExceptions` method and handle both exceptions in a single `catch` block.
    - Print any exceptions that occur.

<details>
<summary>Reveal Solution</summary>

```java
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionDemo {
    public static void main(String[] args) {
        // Previous code

        try {
            mightThrowExceptions();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void mightThrowExceptions() throws IOException, SQLException {
        // Simulating code that might throw exceptions
        if (Math.random() > 0.5) {
            throw new IOException("Simulated IOException");
        } else {
            throw new SQLException("Simulated SQLException");
        }
    }

    public static void readFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
```
</details>

## Complete code

MyResource.java:

```java
public class MyResource implements AutoCloseable {
    public void use() {
        System.out.println("Using MyResource");
    }

    @Override
    public void close() {
        System.out.println("Closing MyResource");
    }
}
```

ExceptionDemo.java:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.sql.SQLException;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        }

        System.out.print("Enter a filename: ");
        String filename = scanner.nextLine();
        readFile(filename);

        try (MyResource resource = new MyResource()) {
            resource.use();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            mightThrowExceptions();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void mightThrowExceptions() throws IOException, SQLException {
        if (Math.random() > 0.5) {
            throw new IOException("Simulated IOException");
        } else {
            throw new SQLException("Simulated SQLException");
        }
    }
}

