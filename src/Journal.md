What happens if you try to write new DigitalMonster() in your main method, and why does Java prevent this?

The Java compiler will throw a compilation error if you attempt to write new DigitalMonster() in your main method.

An abstract class is designed strictly as a template for subclasses, not as a standalone object. Because DigitalMonster declares an abstract method without an implementation body, the class is incomplete. Java prevents direct instantiation to enforce domain logic and ensure safety—guaranteeing you never attempt to call a method that has no executable code behind it.