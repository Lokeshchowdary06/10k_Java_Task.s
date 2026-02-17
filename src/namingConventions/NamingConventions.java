package namingConventions;

public class NamingConventions {
    public static void main(String[] args) {

        // task-1
        String studentName = "Lokesh Chowdary";
        int studentAge = 20;
        char studentGrade = 'A';
        System.out.println("Student: " + studentName + ", Age: " + studentAge + ", Grade: " + studentGrade);

        // task-2

        // task-3
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double d = 19.99;
        char c = 'J';
        boolean bool = true;
        System.out.println(b + ", " + s + ", " + i + ", " + l + ", " + f + ", " + d + ", " + c + ", " + bool);

        // task-4
        int intValue = 100;
        float floatValue = intValue; 
        double doubleValue = floatValue;
        byte byteValue = (byte) doubleValue;
        System.out.println("Int: " + intValue + " -> Float: " + floatValue + " -> Double: " + doubleValue + " -> Byte: " + byteValue);

        // task-5
        System.out.println("Byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        // task-6
        String employeeName = "Lokesh Chowdary";
        double employeeSalary = 75000.50;
        String employeeDepartment = "Software Engineering";
        String joiningDate = "2026-02-17";
        System.out.println("Emp: " + employeeName + " | Salary: " + employeeSalary + " | Dept: " + employeeDepartment + " | Date: " + joiningDate);

        // task-7
        final double PI = 3.14159;
        double radius = 5.5;
        double area = PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is: " + area);

        // task-8
        int numInt = 50;
        double numDouble = numInt;
        System.out.println("Int to Double (Implicit): " + numDouble);
        
        float numFloat = 10.5f;
        int floatToInt = (int) numFloat;
        System.out.println("Float to Int (Explicit): " + floatToInt);
        
        char letter = 'A';
        int charToInt = letter;
        System.out.println("Char to Int (Implicit): " + charToInt);
    }
}
