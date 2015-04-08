package com.github.jrh3k5;

public class TestClass {
    private static enum TestEnum {
        A {
            @Override
            public String exampleOverloadedMethod() {
                return exampleOverloadedMethod(this) + 1;
            }
        },
        B {
            @Override
            public String exampleOverloadedMethod() {
                return exampleOverloadedMethod(this) + 2;
            }
        };

        public abstract String exampleOverloadedMethod();

        private static String exampleOverloadedMethod(TestEnum testEnum) {
            return "TEST_" + testEnum.name();
        }
    }
}
