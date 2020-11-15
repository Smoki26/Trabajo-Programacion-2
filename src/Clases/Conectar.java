package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
    private static Connection conn ;
    public static final String driver = "com.mysql.cj.jdbc.Driver" ;
    public static final String user = "root" ;
    public static final String password = "42357434";
    public static final String url = "jdbc:mysql://localhost:3306/Cliente_Registros?serverTimezone=UTC";

public Conectar(){
    conn = null;
    try{
        Class.forName(driver);
        conn = DriverManager.getConnection(url,user,password);
        if(conn != null){
            System.out.println("Conexion Completada ...");
        }
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println("Error al Conectar..."+e);
    }
}
public Connection getConnection(){
    return conn;
}

public void desconectar(){
conn = null;
if(conn == null){
    System.out.println("Se Desconecto de la BD con exito...");
}
}
}
