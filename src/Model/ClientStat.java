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
public class ClientStat extends Client implements Serializable {
    private int totalPayment, totalContract;    

    public ClientStat(int totalPayment, int totalContract) {
        this.totalPayment = totalPayment;
        this.totalContract = totalContract;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getTotalContract() {
        return totalContract;
    }

    public void setTotalContract(int totalContract) {
        this.totalContract = totalContract;
    }

    @Override
    public String toString() {
        return "ClientStat{" + "totalPayment=" + totalPayment + ", totalContract=" + totalContract + '}';
    }

    public ClientStat() {
    }
}
