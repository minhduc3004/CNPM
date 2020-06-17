/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Model.Contract;

/**
 *
 * @author LEGION
 */
public class ContractDao extends DAO {

    public boolean addContract(Contract contract) {
        String sql = "INSERT INTO tblclient(bookingDate, state, address, phone, license, type) VALUES(?,?,?,?,?,?)";
        return true;
    }
}
