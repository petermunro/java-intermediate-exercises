# Date/Time API

__Objective__: To understand and implement the new Date/Time API (JSR 310) in Java

### Step-by-Step Exercise

Follow these steps:

1. Create a class `DateTimeApiDemo` with a `main` method.

<details>
<summary>Reveal Solution</summary>

We'll place this in a file called "DateTimeApiDemo.java":

```java
public class DateTimeApiDemo {
    public static void main(String[] args) {

    }
}
```
</details>

2. Get the current date using `LocalDate` and print it to the console.

    - Use `LocalDate.now()` to get the current date.
    - Print the result.

<details>
<summary>Reveal Solution</summary>

```java
import java.time.LocalDate;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
    }
}
```
</details>

3. Get the current time using `LocalTime` and print it to the console.

    - Use `LocalTime.now()` to get the current time.
    - Print the result.

<details>
<summary>Reveal Solution</summary>

```java
import java.time.LocalTime;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);
    }
}
```
</details>

4. Get the current date and time using `LocalDateTime` and print it to the console.

    - Use `LocalDateTime.now()` to get the current date and time.
    - Print the result.

<details>
<summary>Reveal Solution</summary>

```java
import java.time.LocalDateTime;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);
    }
}
```
</details>

5. Get the current date and time with a specific time zone using `ZonedDateTime` and print it to the console.

    - Use `ZonedDateTime.now()` to get the current date and time with the default time zone.
    - Print the result.

<details>
<summary>Reveal Solution</summary>

```java
import java.time.ZonedDateTime;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Current date and time with time zone: " + zonedDateTime);
    }
}
```
</details>

6. Create a specific date using `LocalDate` and print it to the console.

    - Use `LocalDate.of(year, month, day)` to create a specific date.
    - Print the result.

<details>
<summary>Reveal Solution</summary>

```java
public class DateTimeApiDemo {
    public static void main(String[] args) {
        LocalDate specificDate = LocalDate.of(2024, 5, 24);
        System.out.println("Specific date: " + specificDate);
    }
}
```
</details>

7. Create a specific time using `LocalTime` and print it to the console.

    - Use `LocalTime.of(hour, minute)` to create a specific time.
    - Print the result.

<details>
<summary>Reveal Solution</summary>

```java
public class DateTimeApiDemo {
    public static void main(String[] args) {
        LocalTime specificTime = LocalTime.of(15, 30);
        System.out.println("Specific time: " + specificTime);
    }
}
```
</details>

8. Create a specific date and time using `LocalDateTime` and print it to the console.

    - Use `LocalDateTime.of(date, time)` to create a specific date and time.
    - Print the result.

<details>
<summary>Reveal Solution</summary>

```java
public class DateTimeApiDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 5, 24);
        LocalTime time = LocalTime.of(15, 30);
        LocalDateTime specificDateTime = LocalDateTime.of(date, time);
        System.out.println("Specific date and time: " + specificDateTime);
    }
}
```
</details>

9. Calculate the period between two dates using `Period` and print the result.

    - Use `Period.between(startDate, endDate)` to calculate the period between two dates.
    - Print the result.

<details>
<summary>Reveal Solution</summary>

```java
import java.time.Period;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 5, 24);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period between dates: " + period);
    }
}
```
</details>

10. Calculate the duration between two times using `Duration` and print the result.

    - Use `Duration.between(startTime, endTime)` to calculate the duration between two times.
    - Print the result.

<details>
<summary>Reveal Solution</summary>

```java
import java.time.Duration;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(17, 0);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration between times: " + duration);
    }
}
```
</details>

11. Format a date using `DateTimeFormatter` and print the formatted date.

    - Use `DateTimeFormatter.ofPattern("dd-MM-yyyy")` to create a custom formatter.
    - Format the current date and print the result.

<details>
<summary>Reveal Solution</summary>

```java
import java.time.format.DateTimeFormatter;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted date: " + formattedDate);
    }
}
```
</details>

12. Parse a date string using `DateTimeFormatter` and print the parsed date.

    - Use `DateTimeFormatter.ofPattern("dd-MM-yyyy")` to create a custom formatter.
    - Parse a date string and print the result.

<details>
<summary>Reveal Solution</summary>

```java
public class DateTimeApiDemo {
    public static void main(String[] args) {
        String dateString = "24-05-2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed date: " + parsedDate);
    }
}
```
</details>

## Complete code

DateTimeApiDemo.java:

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Current date and time with time zone: " + zonedDateTime);

        LocalDate specificDate = LocalDate.of(2024, 5, 24);
        System.out.println("Specific date: " + specificDate);

        LocalTime specificTime = LocalTime.of(15, 30);
        System.out.println("Specific time: " + specificTime);

        LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime);
        System.out.println("Specific date and time: " + specificDateTime);

        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 5, 24);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period between dates: " + period);

        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(17, 0);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration between times: " + duration);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted date: " + formattedDate);

        String dateString = "24-05-2024";
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed date: " + parsedDate);
    }
}
