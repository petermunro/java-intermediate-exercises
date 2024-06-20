# Nested Classes

## Exercise 1

```java
public class Company {
    public static class Employee {
        public static void companyDetails() {
            System.out.println("Company: ABC Corp");
        }

        public void employeeDetails() {
            System.out.println("Employee: John Doe");
        }
    }

    public static void main(String[] args) {
        Company.Employee emp = new Company.Employee();
        Company.Employee.companyDetails();
        emp.employeeDetails();
    }
}
```


## Exercise 2

```java
public class Library {
    private String libraryName = "Central Library";

    public class Book {
        public void bookDetails() {
            System.out.println("Book: Java Programming");
            System.out.println("Library: " + libraryName);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Library.Book book = library.new Book();
        book.bookDetails();
    }
}
```

## Exercise 3


```java
public class Calculator {
    public void performCalculation() {
        final int a = 10;
        final int b = 20;

        class Addition {
            public int add(int x, int y) {
                return x + y;
            }
        }

        Addition addition = new Addition();
        int result = addition.add(a, b);
        System.out.println("Sum: " + result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.performCalculation();
    }
}
```

## Exercise 4

**Sample Code:**
```java
public class ButtonHandler {
    public void handleButtonClick() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Button Clicked");
            }
        }).start();
    }

    public static void main(String[] args) {
        ButtonHandler handler = new ButtonHandler();
        handler.handleButtonClick();
    }
}
```
