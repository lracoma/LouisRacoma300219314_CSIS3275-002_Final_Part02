package com.example.louisracoma300219314_csis3275002_final_part02;

import java.sql.SQLException;
import java.util.List;

public interface SavingsInterface {
    public void add(Savings sav) throws ClassNotFoundException, SQLException;
    public Savings edit(Savings sav, String custno) throws ClassNotFoundException, SQLException;
    public void delete(String custno) throws ClassNotFoundException, SQLException;
    public List<Savings> display() throws ClassNotFoundException, SQLException;
}
