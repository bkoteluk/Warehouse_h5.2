package pl.homework.lib;

public class Device {
    //code, producer, type, price
    private String code;
    private String producer;
    private String type;
    private double price;

    public Device() {
    }

    public Device(String code, String producer, String type) {
        setCode(code);
        setProducer(producer);
        setType(type);
    }

    public Device(String code, String producer, String type,double price) {
        this(code,producer,type);
        setPrice(price);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return "Kod: " + getCode() + ", producent: " + getProducer() + ", typ: " + getType() + ", cena: " + getPrice();
    }
}
