
## **__Day2: Record Patterns__**

Record Patterns allow you to deconstruct records directly inside "instanceof" checks
and switch statements. This meand we can:
1. extract records fields inline
2. Avoid boilerplate code
3. Use powerful pattern matching inside conditional logic


_**Object type check before records patterns**_

```java
if (obj instanceof User) {
    User u = (User) obj;
    String name = obj.getName();
    int age = obj.getAge();
}
```

_**Boom!!! here we go with record patterns**_

No need of
1. manual casting
2. call getters

Benefits:
1. No boilerplate code
2. clean code
3. error-prone
4. easier to read
5. more maintainable
```java
if (obj instanceof User(String name, int age)){
    // you logic here goes here
}
```

**_We can use powerful pattern matching inside conditional logic._**

Pattern matching allows you to embed the coditional logic based on object structure.
its more powerful than just instanceof -- its a way of to match the exact structure and exact values in one clean step.

```java
if (obj instanceof User(String name, int age, Address(String city, int zip))) {
    //your code goes here    
}
```
