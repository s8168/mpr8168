package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pozyczak.Uzytkownik;



public class UrzytkownikDBManager {
	
	private Connection conn;
	private Statement StworzTabele;
	private PreparedStatement DodajUrzytkownikStmt;
	private PreparedStatement PobierzUrzytkownikowStmt;
	private PreparedStatement ZnajdzUrzytkownikStmt;
	private PreparedStatement UsunUrzytkownikStmt;
	private PreparedStatement UsunWszystkichUrzytkownikowStmt;
	

    public UrzytkownikDBManager() {

	  
	  try {
		  conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
		  StworzTabele = conn.createStatement();
		  ResultSet wynik =conn.getMetaData().getTables(null, null, null, null);
		  boolean UrzytkownicyTableExists=false;
		  while(wynik.next())
		  {
		  if("Urzytkownicy".equalsIgnoreCase(wynik.getString("Table_Name")))
		  {
			UrzytkownicyTableExists=true;
		  break;
		  }
		  }
		  if(!UrzytkownicyTableExists)
		  {
		  StworzTabele.executeUpdate("" +
		  "CREATE TABLE Urzytkownicy(" +
		  "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY," +
		  "imie varchar(25),"+
		  "" +"nazwisko varchar (50)" + "" +
		  ")");
		  }

		  DodajUrzytkownikStmt = conn.prepareStatement("INSERT INTO Urzytkownicy (imie, nazwisko) VALUES (?, ?)");
		  PobierzUrzytkownikowStmt = conn.prepareStatement("SELECT * FROM Urzytkownicy");
		  ZnajdzUrzytkownikStmt = conn.prepareStatement("SELECT * FROM Urzytkownicy WHERE nazwisko = ?");       
          UsunUrzytkownikStmt = conn.prepareStatement("DELETE FROM Urzytkownicy WHERE ID = ?");
          UsunWszystkichUrzytkownikowStmt = conn.prepareStatement("DELETE FROM Urzytkownicy");
        
		  } catch (SQLException e) {

		  e.printStackTrace();
		  }
		  }

  public void DodajUrzytkownik (Uzytkownik U) {
	  try
	  {
	  DodajUrzytkownikStmt.setString(1, U.getImie());
	  DodajUrzytkownikStmt.setString(2, U.getNazwisko());
	  DodajUrzytkownikStmt.executeUpdate();
	  }
	  catch (SQLException e)
	  	{

	  e.printStackTrace();
	  	}

	  }
  public List<Uzytkownik> PobierzUrzytkownikow(){
	  List<Uzytkownik> osoby =new ArrayList<Uzytkownik>();

	  try {
	  ResultSet wynik = PobierzUrzytkownikowStmt.executeQuery();

	  while(wynik.next())
	  	{
	  osoby.add(new Uzytkownik(wynik.getString("imie"),wynik.getString("nazwisko")));
	  	}
	  } 
	  
	  catch (SQLException e) {

	  e.printStackTrace();
	  }

	  return osoby;
	  }
  public List<Integer> ZnajdzUrzytkownik (String nazwisko) {
	  try {
	  List<Integer> znaleziony = new ArrayList<Integer>();
	  ZnajdzUrzytkownikStmt.setString(1, nazwisko);
	  ResultSet wynik = ZnajdzUrzytkownikStmt.executeQuery();
	  while (wynik.next())
	  znaleziony.add(wynik.getInt("ID"));
	  return znaleziony;
	  	} 
	  catch (SQLException e) {
	  e.printStackTrace();
	  	}
	  return null;
	  }
  public void UsunUrzytkownik(List<Integer> urzytkownicy) {
	  try {
	  for (Integer id : urzytkownicy) {
	  UsunUrzytkownikStmt.setInt(1, id);
	  UsunUrzytkownikStmt.executeUpdate();
	  	}
	  } 
	  catch (SQLException e) {
	  e.printStackTrace();
	  	}
	  }
  public void UsunWszystkichUrzytkownikow() {
	  try {
		  UsunWszystkichUrzytkownikowStmt.executeUpdate();
	  	}
	  catch (SQLException e)
	  	{
	  e.printStackTrace();
	  }
	}

  
  
	  
}
  
  /*
  select  nazwisko,tytul,urzytkownicy.id,gry.id from urzytkownicy,gry where gry.id_urzytkownik=urzytkownicy.
		  id
		  ;*/

