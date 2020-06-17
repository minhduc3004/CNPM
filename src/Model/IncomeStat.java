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
public class IncomeStat implements Serializable{
    private int totalAmount;

    @Override
    public String toString() {
        return "IncomeStat{" + "totalAmount=" + totalAmount + '}';
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public IncomeStat() {
    }

    public IncomeStat(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
