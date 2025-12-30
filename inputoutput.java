public class inputoutput {
    public static void main (String[] args){
        // take input from user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }
}