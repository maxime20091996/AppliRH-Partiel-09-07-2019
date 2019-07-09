package com.ensup.applirh.dao;

import com.ensup.applirh.domaine.Formation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class FormationDao {

	public ArrayList<Formation> selectAllFormation() throws SQLException {

		ConnectionDao cd = new ConnectionDao();
                
		
	    ArrayList<Formation> liste = new ArrayList<Formation>();
            Statement stm = (Statement) cd.connection();
            ResultSet res = stm.executeQuery("SELECT * FROM formation");

            while (res.next()) {
            Formation fo = new Formation();
            fo.setTheme(res.getString("theme"));
            fo.setDate_debut(res.getDate("date_debut"));
            fo.setDuree(res.getInt("duree"));
            fo.setDescription(res.getString("description"));
            fo.setAvis(res.getString("avis"));
            
            liste.add(fo);
        }
		
		cd.deconnection();
                return liste;
	}
}