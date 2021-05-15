package pl.zima6006.tymeleafhelloworld;

public class Car {
    private String model;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String mark;

    public Car() {
    }

    public Car(String mark, String model) {
        this.model = model;
        this.mark = mark;
    }
}
