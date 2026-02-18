public class S01_Sandbox {
    public static void main(String[] args) {

        // Declare three variables
        int age = 21;
        String family = "Bridgerton";
        boolean invited = true;

        // Print each variable
        System.out.println(age);
        System.out.println(family);
        System.out.println(invited);

        // Trigger a controlled exception
        throw new RuntimeException("Lady Whistledown disapproves.");

        // OPTIONAL: Uncomment to see a parsing error
        // Integer.parseInt("not-a-number");
    }
}
