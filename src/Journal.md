Phase 1 Question

What happens if you try to write new DigitalMonster() in your main method, and why does Java prevent this?

The Java compiler will throw a compilation error if you attempt to write new DigitalMonster() in your main method.

An abstract class is designed strictly as a template for subclasses, not as a standalone object. Because DigitalMonster declares an abstract method without an implementation body, the class is incomplete. Java prevents direct instantiation to enforce domain logic and ensure safety—guaranteeing you never attempt to call a method that has no executable code behind it.



Phase 2 Question

Why is it more flexible to use an interface for an ability like Flyable rather than putting a fly() method in the DigitalMonster base class?

Placing a fly() method in the base class forces all creatures to inherit it, even when it isn't relevant to every monster. Using a Flyable interface ensures this capability is granted strictly to the monsters that actually need it. Also, Java allows classes to implement multiple interfaces, so you can mix and match traits like flying or electric.



Phase 3 Question

Explain how polymorphism allows you to store different types of monsters (Flame, Aqua, Storm, etc.) in a single ArrayList. Why is this better than creating separate lists for every single monster species?

Polymorphism allows you to store different monster types in a single list by treating child classes as their shared parent class. This works through inheritance and the "IS-A" relationship—for example, a FlameMonster is a DigitalMonster. Storing monsters this way eliminates duplicate code by allowing a single loop to manage your whole team, while making the codebase easy to expand whenever you add new monster species.



Phase 4 Question

How does the instanceof operator help you handle interfaces in a polymorphic list? Describe a scenario where this would be useful in a real game (e.g., a “flying-only” zone).

The instanceof operator acts as a type-checking safety guard, allowing you to inspect an object at runtime to check if it implements a specific interface and safely cast it. Imagine an RPG dungeon in an "Underwater Temple" where an environmental trap sends an electrical surge across a flooded floor, affecting each creature differently based on its capabilities. 
By looping through an ArrayList, the game can use instanceof Electric to heal conductive creatures or instanceof Swimmable to let aquatic monsters navigate the flood safely. Ultimately, instanceof enables the game to dynamically trigger interface-specific behaviors across any creature without risking runtime errors.



Phase 5 Question

What bugs or edge cases did you discover during testing? If you consulted an LLM, what feedback did it provide, and did you choose to apply any of it? Explain your reasoning.

During testing, I identified a constructor parameter mismatch and updated the arguments in both Main and the subclass constructors. The LLM noted a potential logical issue regarding Charizard not being able to fly, suggesting that I either make FlameMonster implement Flyable or create a new DragonMonster class. I chose not to make FlameMonster implement Flyable because that would force all flame-type monsters (including non-flying ones like Charmander) to inherit the fly() method. 
Instead, I kept Flyable isolated to specific classes so that flying capabilities remain strictly limited to the individual monster species that actually need them.