package practicalsqa.step_definitions;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLQuery {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//		String connectionString="jdbc:oracle:thin:@//costco:8081/apex";
		String connectionString="jdbc:oracle:thin:@localhost:1521:xe";
//		jdbc:oracle:thin:@//HOSTNAME:PORT/SERVICENAME
		//jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS_LIST =(ADDRESS =(PROTOCOL=TCP)(HOST=blah.example.com)
		//(PORT=1521)))(CONNECT_DATA=(SID=BLAHSID)(GLOBAL_NAME=BLAHSID.WORLD)(SERVER=DEDICATED)))
//		XE =(DESCRIPTION =(ADDRESS = (PROTOCOL = TCP)(HOST = costco)(PORT = 1521))(CONNECT_DATA = (SERVER = DEDICATED)(SERVICE_NAME = XE)))
		String dbUserName="ADMIN";
		String dbPwd="Artemka89!";
		Driver myDriver = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver( myDriver );
		Connection dbConnection = DriverManager.getConnection(connectionString,dbUserName,dbPwd);
		System.out.println("Database connection Successful");
		if(dbConnection!=null)
			dbConnection.close();	
		
		
		
/*		try(
				Connection dbConn = DriverManager.getConnection(connectionString, dbUserName, dbPwd);
				
//				Connection dbConn=DBUtil.getConnection(DBType.ORACLE);
				Statement sqlQuery=dbConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet resultSet=sqlQuery.executeQuery("select employee_id,first_name,job_id,salary from employees where salary>5000");
				
				)
		{
			resultSet.absolute(8);
			System.out.println(resultSet.getString("first_name")+"\t"+resultSet.getString("job_id"));
			
			 
			
			resultSet.last();
			resultSet.relative(-2); //move 2 steps back
			System.out.println("Numbers of records: "+resultSet.getRow());
			System.out.println(resultSet.getString("first_name")+"\t"+resultSet.getString("job_id"));
		}
			catch(SQLException ex){
			ex.getMessage();
		}
*/

	}

}
