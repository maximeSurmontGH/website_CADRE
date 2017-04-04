package projet.cadre.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import projet.cadre.model.Rappel;

public class RappelDao {
	
	// Enregistrer un nouveau rappel
	public Rappel saveRappel(Rappel rappel) {
		
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			
			PreparedStatement stmt = connection.prepareStatement("INSERT INTO `rappels`(`idRappel`,`dateRappel`,`messageRappel`,`employes_idEmploye`) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1,rappel.getIdRappel());
			stmt.setString(2,rappel.getDateRappel());
			stmt.setString(3,rappel.getMessageRappel());
			stmt.setString(4,rappel.getEmployes_idEmploye());
			stmt.executeUpdate();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rappel;
	
	}

}
