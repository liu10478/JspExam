package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Film;

public interface FilmDAO {
	
	public void addCus(Connection con,Film film) throws SQLException;
	
	public void delCus(Connection con,Film film) throws SQLException;
	
	public void updCus(Connection con,Film film) throws SQLException;
	
	public ResultSet listCus(Connection con,Film film) throws SQLException;
	
}
