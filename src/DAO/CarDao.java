/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Car;

/**
 *
 * @author LEGION
 */
public class CarDao extends DAO {

    public ArrayList<Car> searchCar(String key, int type, int brand) {
        ArrayList<Car> res = new ArrayList<Car>();
        CarTypeDao typeDao = new CarTypeDao();
        CarClassificationDao classDao = new CarClassificationDao();
        String sql = "SELECT * FROM tblCar WHERE name = ?, type=?,brand = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, key);
            ps.setInt(2, type);
            ps.setInt(3, brand);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Car car = new Car();
                car.setId(rs.getInt("id"));
                car.setName(rs.getString("name"));
                car.setPrice(rs.getInt("price"));
                car.setBrand(rs.getString("brand"));
                car.setDesc(rs.getString("desc"));
                car.setState(rs.getString("state"));
                car.setClasss(classDao.getCarClassById(rs.getInt("tblCarClassification_id")));
                car.setType(typeDao.getCarTypeById(rs.getInt("tblCarType_id")));
                res.add(car);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }
}
