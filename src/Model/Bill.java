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
public class Bill implements Serializable{

    public Bill() {
    }

    public Bill(int id, float amount, String paymentType, String paymentDate, String note, float penaltyAmount, Staff staff, Contract contract) {
        this.id = id;
        this.amount = amount;
        this.paymentType = paymentType;
        this.paymentDate = paymentDate;
        this.note = note;
        this.penaltyAmount = penaltyAmount;
        this.staff = staff;
        this.contract = contract;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public float getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(float penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Bill{" + "id=" + id + ", amount=" + amount + ", paymentType=" + paymentType + ", paymentDate=" + paymentDate + ", note=" + note + ", penaltyAmount=" + penaltyAmount + ", staff=" + staff + ", contract=" + contract + '}';
    }
    private int id;
    private float amount;
    private String paymentType,paymentDate,note;
    private float penaltyAmount;
    private Staff staff;
    private Contract contract;
}
