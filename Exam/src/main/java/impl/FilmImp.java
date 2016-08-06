package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import dao.FilmDAO;
import entity.Customer;
import entity.Film;

public class FilmImp implements FilmDAO {

	public void addCus(Connection con,Film film) throws SQLException {
		String sql = "insert into film (film_id,title,description,language_id) values(?,?,?,?)";
		PreparedStatement prst = con.prepareStatement(sql);
		prst.setInt(1, film.getFilm_id());
		prst.setString(2, film.getTitle());
		prst.setString(3, film.getDescription());
		prst.setInt(4, film.getLanguage_id());
		prst.execute();
	}

	public void delCus(Connection con,Film film) throws SQLException {
		String sql = "delete from film where film_id=?";
		PreparedStatement prst = con.prepareStatement(sql);
		prst.setInt(1, film.getFilm_id());
		prst.execute();
	}

	public void updCus(Connection con,Film film) throws SQLException {
		String sql = "update from film set title=?,description=?,language_id=? where film_id=?";
		PreparedStatement prst = con.prepareStatement(sql);
		prst.setInt(4, film.getFilm_id());
		prst.setString(1, film.getTitle());
		prst.setString(2, film.getDescription());
		prst.setInt(3, film.getLanguage_id());
		prst.execute();
	}

	public ResultSet listCus(Connection con,Film film) throws SQLException {
		String sql = "select title,description,language_id from film where film_id=?";
		PreparedStatement prst = con.prepareStatement(sql);
		prst.setInt(1, film.getFilm_id());
		ResultSet rs = prst.executeQuery();
		
		
		return rs;
	}

}
