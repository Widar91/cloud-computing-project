package nl.tudelft.cloud_computing_project.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sql2o.Sql2o;

public class Database {
	private static final Logger LOG = LoggerFactory.getLogger(Database.class);
	
    private static final String dbname = "jdbc:mysql://cloudocr-db.c8yqjvuwxgg2.eu-west-1.rds.amazonaws.com:3306/cloudocr_db" ;
    private static final String dbuser = "cloudocr";
    private static final String dbpwd = "cloudocr";
    
    private static final Sql2o instance = new Sql2o(dbname, dbuser, dbpwd);
    
    /**
     * Get a database connection (thread-local)
     */
    public static Sql2o getConnection() {
    	return instance;
    }
}
   
    