package main.java.ru.leroymerlin.qa.test;

public class Test1 extends ParentClass implements Custom {
    public void metod1() {
        setPrivateField("String 1");
        System.out.println(getPrivateField());
    }

    @Override
    public void customMethod() {
        System.out.println("Test1 custom method");
    }
}
