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
public class Penalty implements Serializable{

    public Penalty() {
    }

    public Penalty(int quantity, int amount, DamageCatalog damage) {
        this.quantity = quantity;
        this.amount = amount;
        this.damage = damage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public DamageCatalog getDamage() {
        return damage;
    }

    public void setDamage(DamageCatalog damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Penalty{" + "quantity=" + quantity + ", amount=" + amount + ", damage=" + damage + '}';
    }
    private int quantity,amount;
    private DamageCatalog damage;
}
