Phase 1 Question

What happens if you try to write new DigitalMonster() in your main method, and why does Java prevent this?

The Java compiler will throw a compilation error if you attempt to write new DigitalMonster() in your main method.

An abstract class is designed strictly as a template for subclasses, not as a standalone object. Because DigitalMonster declares an abstract method without an implementation body, the class is incomplete. Java prevents direct instantiation to enforce domain logic and ensure safety—guaranteeing you never attempt to call a method that has no executable code behind it.



Phase 2 Question

Why is it more flexible to use an interface for an ability like Flyable rather than putting a fly() method in the DigitalMonster base class?

Placing a fly() method in the base class forces all creatures to inherit it, even when it isn't relevant to every monster. Using a Flyable interface ensures this capability is granted strictly to the monsters that actually need it. Also, Java allows classes to implement multiple interfaces, so you can mix and match traits like flying or electric.
