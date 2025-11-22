import java.util.Scanner;

void main() {

    // extract a substring
    String name = "kevin hyde-opoku";
    String firstName = name.substring(0, 5);   // kevin
    IO.println(firstName);

    // validate user commands
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    // Create category: 1 = under 18, 2 = 18 or above
    int category = (age >= 18) ? 2 : 1;

    switch (category) {
        case 1:
            IO.println("You are under 18.");
            break;

        case 2:
            IO.println("You are 18 or above.");
            break;
    }

    scanner.close();

    // convert a name to upper case
    IO.println(name.toUpperCase());
}