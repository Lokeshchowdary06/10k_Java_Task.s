package Variables;

public class Variables {

    public static void main(String[] args) {
        
        // task-1
        String name = "Lokesh";
        int age = 20;
        char grade = 'A';
        System.out.println("Name: " + name + " Age: " + age + " Grade: " + grade);

        // task-2
        int count = 10;
        count = 20;
        System.out.println(count);
        count = 30;
        System.out.println(count);

        // task-3
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 10.5f;
        double d = 20.99;
        char c = 'Z';
        boolean bool = true;
        System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + c + " " + bool);

        // task-4
        int x = 5, y = 10, temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("Swapped with temp: " + x + " " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Swapped without temp: " + x + " " + y);

        // task-5
        final double PI = 3.14159;
        System.out.println(PI);

        // task-6
        double myDouble = 9.78;
        int myInt = (int) myDouble;
        System.out.println(myInt);
        int num = 10;
        double numD = num;
        System.out.println(numD);
        char ch = 'A';
        int ascii = ch;
        System.out.println(ascii);

        // task-7
        int a1 = 20, b1 = 10;
        System.out.println(a1 + b1);
        System.out.println(a1 - b1);
        System.out.println(a1 * b1);
        System.out.println(a1 / b1);

        // task-8
        int length = 5, breadth = 10;
        System.out.println("Area: " + (length * breadth));

        // task-10
        int m1 = 80, m2 = 85, m3 = 90, m4 = 75, m5 = 95;
        int total = m1 + m2 + m3 + m4 + m5;
        double avg = total / 5.0;
        double percentage = (total / 500.0) * 100;
        System.out.println(total + " " + avg + " " + percentage);

        // task-11
        double fahrenheit = 98.6;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);

        // task-12
        int val = 10;
        System.out.println(++val);
        System.out.println(val++);
        System.out.println(--val);
        System.out.println(val--);

        // task-13
        double salary = 50000;
        salary = salary + (salary * 0.10);
        System.out.println(salary);

        // task-14
        double P = 1000, T = 2, R = 5;
        double SI = (P * T * R) / 100;
        System.out.println(SI);

        // task-15
        double radius = 7;
        System.out.println(2 * PI * radius);
        System.out.println(PI * radius * radius);

        // task-16
        byte b2 = 10;
        short s2 = 20;
        int i2 = 30;
        int result = b2 + s2 + i2;
        System.out.println(result);

        // task-17
        double inr = 1000;
        double rate = 0.012;
        double usd = inr * rate;
        System.out.println(usd);

        // task-18
        String firstName = "Lokesh";
        String lastName = "Chowdary";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        // task-19
        String str1 = "Hello";
        String str2 = "World";
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println(str1 + " " + str2);
    }
}