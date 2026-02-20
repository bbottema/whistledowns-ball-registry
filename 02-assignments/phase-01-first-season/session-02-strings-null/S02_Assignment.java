// Session 02 – Strings & Null
//
// Start:
// 1) Read `README.md` in this folder.
// 2) Uncomment the TODO blocks below in order.
// 3) Run the file.

void main() {

    // For deeper explainers of the concepts introduced here:
    //   - /help me understand/= vs ==.md
    //   - /help me understand/equals vs == vs !=.md
    //   - /help me understand/What a method is.md

    // TODO 1: String equality
    // String expected = "OK";
    // String actual = "OK";
    // System.out.println(expected.equals(actual)); // should be true

    // TODO 2: Common string operations
    // These are *methods* on String (dot + name + parentheses).
    // The text "Status: OK" is ordinary sample input text; "OK" has no special meaning in Java.
    // String msg = "Status: OK";
    // System.out.println(msg.contains("OK"));
    // System.out.println(msg.startsWith("Status"));
    // System.out.println(msg.replace("Status: ", ""));
    // System.out.println(msg.toLowerCase());
    // System.out.println(" Status: OK ".trim());

    // TODO 3: Null safety
    // String familyName = null;
    // boolean respectable = familyName != null && !familyName.isBlank();
    // System.out.println(respectable); // should be false

    // OPTIONAL: Fail-fast check (will throw exception)
    // String familyName2 = null;
    // if (familyName2 == null) {
    //     throw new IllegalArgumentException("Family name is required.");
    // }
}