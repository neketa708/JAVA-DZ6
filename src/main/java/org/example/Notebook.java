package org.example;

public class Notebook {
    private String name;
    private int amountRAM;
    private String operatingSystem;
    private int price;
    private String model;

    public Notebook(String name, int amountRAM, String operatingSystem, int price, String model) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.model = model;
    }
    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + amountRAM +
                ", операционная система: " + operatingSystem + '\'' +
                ", цена: " + price +
                ", модель: " + model;
    }

    public String getName() {
        return name;
    }
    public int getAmountRAM() {
        return amountRAM;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public int getPrice() {
        return price;
    }
    public String getModel() {
        return model;
    }
}
