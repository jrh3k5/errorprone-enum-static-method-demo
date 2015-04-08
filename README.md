This project is intended to demonstrate what happens if you try to compile an enum with a private static method overloading the name of a local method.

To compile using your default compiler, simply run:

```
mvn clean compile
```

To compile using the Error Prone compiler, run:

```
mvn clean compile -Perror-prone
```

You should see no errors with your first invocation, but the invocation with Error Prone should result in something similar to this:

```
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ errorprone-enum-static-method-demo ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /Users/jh016266/git/jh016266/errorprone-enum-static-method-demo/target/classes
/Users/jh016266/git/jh016266/errorprone-enum-static-method-demo/src/main/java/com/github/jrh3k5/TestClass.java:8: error: no suitable method found for exampleOverloadedMethod(<anonymous TestEnum>)
                return exampleOverloadedMethod(this) + 1;
                       ^
    method TestEnum.exampleOverloadedMethod() is not applicable
      (actual and formal argument lists differ in length)
    method <anonymous com.github.jrh3k5.TestClass$TestEnum$1>.exampleOverloadedMethod() is not applicable
      (actual and formal argument lists differ in length)
/Users/jh016266/git/jh016266/errorprone-enum-static-method-demo/src/main/java/com/github/jrh3k5/TestClass.java:14: error: no suitable method found for exampleOverloadedMethod(<anonymous TestEnum>)
                return exampleOverloadedMethod(this) + 2;
                       ^
    method TestEnum.exampleOverloadedMethod() is not applicable
      (actual and formal argument lists differ in length)
    method <anonymous com.github.jrh3k5.TestClass$TestEnum$2>.exampleOverloadedMethod() is not applicable
      (actual and formal argument lists differ in length)
2 errors
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.689 s
[INFO] Finished at: 2015-04-08T07:42:17-06:00
[INFO] Final Memory: 18M/246M
[INFO] ------------------------------------------------------------------------
```