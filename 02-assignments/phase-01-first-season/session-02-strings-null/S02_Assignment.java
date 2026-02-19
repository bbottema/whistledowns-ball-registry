// Session 02 – Strings & Null (JShell)
//
// Start:
// 1) Read `README.md` in this folder (it explains what’s going on, in human terms).
// 2) Follow the TODO blocks below in order.
//
// How to use this file:
// - These snippets are meant for JShell (Tools -> JShell Console...).
// - Copy/paste lines into JShell WITHOUT the leading `//`.
//
// If this is your first time hitting `null` in Java: congrats, you’ve met a classic.

// TODO 1: String equality
// String expected = "OK";
// String actual = "OK";
// System.out.println(expected.equals(actual)); // should be true

// TODO 2: Common string operations
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
