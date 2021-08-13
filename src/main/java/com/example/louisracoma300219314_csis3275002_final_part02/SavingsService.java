package com.example.louisracoma300219314_csis3275002_final_part02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SavingsService implements SavingsInterface {

    Connection connection;

    public SavingsService(Connection connection)
    {
        this.connection = connection;
    }
    @Override
    public void add(Savings sav) throws ClassNotFoundException, SQLException {
        String query1 = "INSERT INTO savingstable VALUES(?,?,?,?,?)";
        PreparedStatement query = connection.prepareStatement(query1);

        query.setString(1, sav.getCustno());
        query.setString(2, sav.getCustname());
        query.setDouble(3, sav.getCdep());
        query.setInt(4, sav.getNyears());
        query.setString(5, sav.getSavtype());

        query.executeUpdate();
    }

    @Override
    public Savings edit(Savings sav, String custno) throws ClassNotFoundException, SQLException {
        PreparedStatement query;
        query = connection.prepareStatement("UPDATE savingstable SET custno=?, custname=?, cdep=?, nyears=?, savtype=? WHERE custno=?");
        query.setString(1, sav.getCustno());
        query.setString(2, sav.getCustname());
        query.setDouble(3, sav.getCdep());
        query.setInt(4, sav.getNyears());
        query.setString(5, sav.getSavtype());
        query.setString(6, custno);

        query.executeUpdate();
        return sav;
    }

    @Override
    public void delete(String custno) throws ClassNotFoundException, SQLException {
        String query1 = "SELECT * FROM savingstable WHERE custno = ?";
        PreparedStatement query = connection.prepareStatement(query1);
        query.setString(1,custno);
        query.executeUpdate();
    }

    @Override
    public List<Savings> display() throws ClassNotFoundException, SQLException {
        List<Savings>savingsList = new ArrayList<Savings>();
        Savings savingsObject;
        String query1 = "SELECT * FROM savingstable";
        PreparedStatement query = connection.prepareStatement(query1);
        ResultSet resultSet = query.executeQuery();

        while(resultSet.next())
        {
            savingsObject = new Savings(resultSet.getString("custno"),
                    resultSet.getString("custname"),resultSet.getDouble("cdep"),
                    resultSet.getInt("nyears"), resultSet.getString("savtype"));
            savingsList.add(savingsObject);
        }
        return savingsList;
    }
}
