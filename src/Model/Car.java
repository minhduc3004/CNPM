/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author LEGION
 */

public class Car implements Serializable{
    public Car(){
        super();
    }

    public Car(int id, String name, String brand, String desc, int price, String state, CarType type, CarClassification classs) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.desc = desc;
        this.price = price;
        this.state = state;
        this.type = type;
        this.classs = classs;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrice() {
        return price;
    }

    public String getState() {
        return state;
    }

    public CarType getType() {
        return type;
    }

    public CarClassification getClasss() {
        return classs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public void setClasss(CarClassification classs) {
        this.classs = classs;
    }

    
    
    private int id;
    private String name,brand,desc;
    private int price;
    private String state;
    private CarType type;
    private CarClassification classs;
    
    
}
