# Nested try Statements

- A try statement can be inside the block of another try.
- Each time a try statement is entered, the context of that exception is pushed on the stack.
- If an inner try statement does not have a catch handler for a particular exception, the stack is unwound and the next try statement’s catch handlers are inspected for a match.
- This continues until one of the catch statements succeeds, or until all of the nested try statements are exhausted.
- If no catch statement matches, then the Java run-time system will handle the exception.

# Nested try Statements (Example)

```

class NestTry {
    public static void main(String args[]) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            try { // nested try block
                if(a==1) a = a/(a-a); // one command-line arg, division by zero
                if(a==2) {
                    int c[] = { 1 };
                    c[42] = 99; // two command-line args, out-of-bounds exception
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out-of-bounds: " + e);
            }
        } catch(ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}

```

In this example, the outer try block is used to catch any divide by zero exceptions, while the inner try block is used to catch any array index out of bounds exceptions.


# Nested try Statements (Example)

## OUTPUT

- When the program is run with no arguments, a divide by zero exception is thrown and caught by the outer try-catch block.
- When the program is run with one argument, a divide by zero exception is thrown and caught by the outer try-catch block.
- When the program is run with two arguments, an ArrayIndexOutOfBoundsException is thrown and caught by the inner try-catch block.
```

C:\>java NestTry
Divide by 0: java.lang.ArithmeticException: / by zero
C:\>java NestTry One
a = 1
Divide by 0: java.lang.ArithmeticException: / by zero
C:\>java NestTry One Two
a = 2
Array index out-of-bounds: java.lang.ArrayIndexOutOfBoundsException: 42
```

# throw

- The throw statement is used to explicitly throw an exception.
- The flow of execution stops immediately after the throw statement.
- The nearest enclosing try block is inspected to see if it has a catch statement that matches the type of exception and control is transferred to that statement.
- If no match is found, the next enclosing try statement is inspected, and so on.
- If no matching catch is found in any block, the default exception handler halts the program and prints the stack trace.

## throw (example)

```

class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch(NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e; // rethrow the exception
        }
    }
    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}

```

In this example, the method `demoproc()` throws a `NullPointerException` which is caught and then rethrown. The exception is then caught in the `main()` method and printed.

# throw

The `throws` keyword is used in a method declaration to indicate that the method can throw a specific exception. 

This is useful when a method calls another method that throws an exception, and the calling method does not handle the exception. In this case, the calling method must include a `throws` clause that lists the types of exceptions that it might throw.

It is necessary for all exceptions, except `Error` or `RuntimeException`, or any of their subclasses.

## throws (example)
```

class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}

In this example, the `throwOne()` method throws an `IllegalAccessException`, and the `main()` method catches it and prints a message.

OUTPUT
Inside throwOne.
Caught java.lang.IllegalAccessException: demo

```

# finally

finally creates a block of code that will be executed after a try /catch block has completed and before the code following the try/catch block. 
- finally block will execute whether or not an exception is thrown.
- If an exception is thrown, the finally block will execute even if no catch statement matches the exception.
- useful for closing file handles and freeing up any other resources.
- finally clause is optional


# finally (example)

```

class FinallyDemo {
 static void procA() {
 try {
 System.out.println("inside procA"); throw new RuntimeException("demo");
 } finally { System.out.println("procA's finally");}
 }
 static void procB() {
 try {
 System.out.println("inside procB"); return;
 } finally { System.out.println("procB's finally"); }
 }
 static void procC() {
 try {
 System.out.println("inside procC");
 } finally { System.out.println("procC's finally"); }
 }
 public static void main(String args[]) {
 try {
 procA();
 } catch (Exception e) {
 System.out.println("Exception caught");
 }
 procB();
 procC();
 }
}

```
# finally (example)

```

OUTPUT

inside procA
procA's finally
Exception caught
inside procB
procB's finally
inside procC
procC's finally

```
