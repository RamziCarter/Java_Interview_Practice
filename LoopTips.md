## Looping

> While loop

```java
Scanner scan = new Scanner(System.in);
String name = "";

while(name.isBlank())
    {
        System.out.println("Enter your name: ");
        name = scan.nextLine();
    }

System.out.println("Hello " + name);
```
---
> Do while loop

```java

do(name.isBlank())
    {
        System.out.println("Enter your name: ");
        name = scan.nextLine();
    }while(name.isBlank());

System.out.println("Hello " + name);

```

* Do while loop always executes the block of code once
* while loop only executes if condition is met
