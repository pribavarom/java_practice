package main.java.ru.leroymerlin.qa.test;

public class ParentClass {
    private String privateField;
    public String publicField;

    public static final Integer CHISLO = 1;

    protected String getPrivateField() {
        return privateField;
    }

    protected void setPrivateField(String newValue) {
        privateField = modificate(newValue);
    }

    private String modificate(String newValue) {
        return "new string: " + newValue;
    }
}
