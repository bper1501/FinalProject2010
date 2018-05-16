package application;

import java.lang.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.control.TableView;

public class SampleController implements Initializable {
	

	//pane
	@FXML
	private Pane pane;
	//banner
	@FXML
	private ImageView banner;
	@FXML
	private Label Logo;
	@FXML
	private ImageView RonaldoPng;
	@FXML
	private ImageView MessiPng;
	
	//button bar
	@FXML
	private ButtonBar ButtonBar;
	//BUTTONS
	@FXML
	private Button EPLBTN;
	@FXML
	private void LoadEpl() {
		
		String queryEpl = "Select * " + "from Teams where League = 'EPL'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException g) {
			// TODO Auto-generated catch block
			g.printStackTrace();
		}
		try {
		Connection Conn = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/finalproject2010","bper233","270313bp");
		System.out.println("Connected");
		Statement data = Conn.createStatement();
		ResultSet reset;
		reset = data.executeQuery(queryEpl);
		List EPLlist = new ArrayList();
		while (reset.next()) {
			String Team =  reset.getString("TeamName");
			String GamesPlayed = reset.getString("GamesPlayed");
			String Pts = reset.getString("Pts");
			String GamesWon = reset.getString("GamesWon");
			String GamesDrawn = reset.getString("GamesDrawn");
			String GamesLost = reset.getString("GamesLost");

			
			Team TeamInstance = new Team(Team, GamesPlayed,Pts, GamesWon, GamesDrawn, GamesLost);
			
			EPLlist.add(TeamInstance);
		}
		ObservableList observableTeam = FXCollections.observableArrayList(EPLlist);
		PropertyValueFactory<Team,String> Team =  new PropertyValueFactory<Team,String>("TeamName");
		PropertyValueFactory<Team,String> GamesPlayed = new PropertyValueFactory<Team,String>("GamesPlayed");
		PropertyValueFactory<Team,String> Pts = new PropertyValueFactory<Team,String>("Pts");
		PropertyValueFactory<Team,String> GamesWon = new PropertyValueFactory<Team,String> ("GamesWon");
		PropertyValueFactory<Team,String> GamesDrawn = new PropertyValueFactory<Team,String> ("GamesDrawn");
		PropertyValueFactory<Team,String> GamesLost = new PropertyValueFactory<Team,String> ("GamesLost");

		
		TeamName.setCellValueFactory(Team);
		FXGamesPlayed.setCellValueFactory(GamesPlayed);
		FXPts.setCellValueFactory(Pts);
		FXGamesWon.setCellValueFactory(GamesWon);
		FXGamesDrawn.setCellValueFactory(GamesDrawn);
		FXGamesLost.setCellValueFactory(GamesLost);

		
		TableView.setItems(observableTeam);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	@FXML
	private Button LigaBTN;
	@FXML
	private void LoadLiga() {
		
		String queryLiga = "Select * " + "from Teams where League = 'LaLiga'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException g) {
			// TODO Auto-generated catch block
			g.printStackTrace();
		}
		try {
		Connection Conn = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/finalproject2010","bper233","270313bp");
		System.out.println("Connected");
		Statement data = Conn.createStatement();
		ResultSet reset;
		reset = data.executeQuery(queryLiga);
		List Ligalist = new ArrayList();
		while (reset.next()) {
			String Team =  reset.getString("TeamName");
			String GamesPlayed = reset.getString("GamesPlayed");
			String Pts = reset.getString("Pts");
			String GamesWon = reset.getString("GamesWon");
			String GamesDrawn = reset.getString("GamesDrawn");
			String GamesLost = reset.getString("GamesLost");

			
			Team TeamInstance = new Team(Team, GamesPlayed,Pts, GamesWon, GamesDrawn, GamesLost);
			
			Ligalist.add(TeamInstance);
		}
		ObservableList observableTeam = FXCollections.observableArrayList(Ligalist);
		PropertyValueFactory<Team,String> Team =  new PropertyValueFactory<Team,String>("TeamName");
		PropertyValueFactory<Team,String> GamesPlayed = new PropertyValueFactory<Team,String>("GamesPlayed");
		PropertyValueFactory<Team,String> Pts = new PropertyValueFactory<Team,String>("Pts");
		PropertyValueFactory<Team,String> GamesWon = new PropertyValueFactory<Team,String> ("GamesWon");
		PropertyValueFactory<Team,String> GamesDrawn = new PropertyValueFactory<Team,String> ("GamesDrawn");
		PropertyValueFactory<Team,String> GamesLost = new PropertyValueFactory<Team,String> ("GamesLost");

		
		TeamName.setCellValueFactory(Team);
		FXGamesPlayed.setCellValueFactory(GamesPlayed);
		FXPts.setCellValueFactory(Pts);
		FXGamesWon.setCellValueFactory(GamesWon);
		FXGamesDrawn.setCellValueFactory(GamesDrawn);
		FXGamesLost.setCellValueFactory(GamesLost);

		
		TableView.setItems(observableTeam);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	@FXML
	private Button SerieBTN;
	@FXML
	private void LoadSerie() {
		
		String querySerie = "Select * " + "from Teams where League = 'SerieA'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException g) {
			// TODO Auto-generated catch block
			g.printStackTrace();
		}
		try {
		Connection Conn = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/finalproject2010","bper233","270313bp");
		System.out.println("Connected");
		Statement data = Conn.createStatement();
		ResultSet reset;
		reset = data.executeQuery(querySerie);
		List Serielist = new ArrayList();
		while (reset.next()) {
			String Team =  reset.getString("TeamName");
			String GamesPlayed = reset.getString("GamesPlayed");
			String Pts = reset.getString("Pts");
			String GamesWon = reset.getString("GamesWon");
			String GamesDrawn = reset.getString("GamesDrawn");
			String GamesLost = reset.getString("GamesLost");

			
			Team TeamInstance = new Team(Team, GamesPlayed,Pts, GamesWon, GamesDrawn, GamesLost);
			
			Serielist.add(TeamInstance);
		}
		ObservableList observableTeam = FXCollections.observableArrayList(Serielist);
		PropertyValueFactory<Team,String> Team =  new PropertyValueFactory<Team,String>("TeamName");
		PropertyValueFactory<Team,String> GamesPlayed = new PropertyValueFactory<Team,String>("GamesPlayed");
		PropertyValueFactory<Team,String> Pts = new PropertyValueFactory<Team,String>("Pts");
		PropertyValueFactory<Team,String> GamesWon = new PropertyValueFactory<Team,String> ("GamesWon");
		PropertyValueFactory<Team,String> GamesDrawn = new PropertyValueFactory<Team,String> ("GamesDrawn");
		PropertyValueFactory<Team,String> GamesLost = new PropertyValueFactory<Team,String> ("GamesLost");

		
		TeamName.setCellValueFactory(Team);
		FXGamesPlayed.setCellValueFactory(GamesPlayed);
		FXPts.setCellValueFactory(Pts);
		FXGamesWon.setCellValueFactory(GamesWon);
		FXGamesDrawn.setCellValueFactory(GamesDrawn);
		FXGamesLost.setCellValueFactory(GamesLost);

		
		TableView.setItems(observableTeam);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	@FXML
	private Button BundeBTN;
	@FXML
	private void LoadBundes() {
		
		String querySerie = "Select * " + "from Teams where League = 'Bundes'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException g) {
			// TODO Auto-generated catch block
			g.printStackTrace();
		}
		try {
		Connection Conn = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/finalproject2010","bper233","270313bp");
		System.out.println("Connected");
		Statement data = Conn.createStatement();
		ResultSet reset;
		reset = data.executeQuery(querySerie);
		List Bundeslist = new ArrayList();
		while (reset.next()) {
			String Team =  reset.getString("TeamName");
			String GamesPlayed = reset.getString("GamesPlayed");
			String Pts = reset.getString("Pts");
			String GamesWon = reset.getString("GamesWon");
			String GamesDrawn = reset.getString("GamesDrawn");
			String GamesLost = reset.getString("GamesLost");

			
			Team TeamInstance = new Team(Team, GamesPlayed,Pts, GamesWon, GamesDrawn, GamesLost);
			
			Bundeslist.add(TeamInstance);
		}
		ObservableList observableTeam = FXCollections.observableArrayList(Bundeslist);
		PropertyValueFactory<Team,String> Team =  new PropertyValueFactory<Team,String>("TeamName");
		PropertyValueFactory<Team,String> GamesPlayed = new PropertyValueFactory<Team,String>("GamesPlayed");
		PropertyValueFactory<Team,String> Pts = new PropertyValueFactory<Team,String>("Pts");
		PropertyValueFactory<Team,String> GamesWon = new PropertyValueFactory<Team,String> ("GamesWon");
		PropertyValueFactory<Team,String> GamesDrawn = new PropertyValueFactory<Team,String> ("GamesDrawn");
		PropertyValueFactory<Team,String> GamesLost = new PropertyValueFactory<Team,String> ("GamesLost");

		
		TeamName.setCellValueFactory(Team);
		FXGamesPlayed.setCellValueFactory(GamesPlayed);
		FXPts.setCellValueFactory(Pts);
		FXGamesWon.setCellValueFactory(GamesWon);
		FXGamesDrawn.setCellValueFactory(GamesDrawn);
		FXGamesLost.setCellValueFactory(GamesLost);

		
		TableView.setItems(observableTeam);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	@FXML
	private Button MXBTN;
	@FXML
	private void LoadMX() {
		
		String queryMX = "Select * " + "from Teams where League = 'LigaMX'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException g) {
			// TODO Auto-generated catch block
			g.printStackTrace();
		}
		try {
		Connection Conn = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/finalproject2010","bper233","270313bp");
		System.out.println("Connected");
		Statement data = Conn.createStatement();
		ResultSet reset;
		reset = data.executeQuery(queryMX);
		List MXlist = new ArrayList();
		while (reset.next()) {
			String Team =  reset.getString("TeamName");
			String GamesPlayed = reset.getString("GamesPlayed");
			String Pts = reset.getString("Pts");
			String GamesWon = reset.getString("GamesWon");
			String GamesDrawn = reset.getString("GamesDrawn");
			String GamesLost = reset.getString("GamesLost");

			
			Team TeamInstance = new Team(Team, GamesPlayed,Pts, GamesWon, GamesDrawn, GamesLost);
			
			MXlist.add(TeamInstance);
		}
		ObservableList observableTeam = FXCollections.observableArrayList(MXlist);
		PropertyValueFactory<Team,String> Team =  new PropertyValueFactory<Team,String>("TeamName");
		PropertyValueFactory<Team,String> GamesPlayed = new PropertyValueFactory<Team,String>("GamesPlayed");
		PropertyValueFactory<Team,String> Pts = new PropertyValueFactory<Team,String>("Pts");
		PropertyValueFactory<Team,String> GamesWon = new PropertyValueFactory<Team,String> ("GamesWon");
		PropertyValueFactory<Team,String> GamesDrawn = new PropertyValueFactory<Team,String> ("GamesDrawn");
		PropertyValueFactory<Team,String> GamesLost = new PropertyValueFactory<Team,String> ("GamesLost");

		
		TeamName.setCellValueFactory(Team);
		FXGamesPlayed.setCellValueFactory(GamesPlayed);
		FXPts.setCellValueFactory(Pts);
		FXGamesWon.setCellValueFactory(GamesWon);
		FXGamesDrawn.setCellValueFactory(GamesDrawn);
		FXGamesLost.setCellValueFactory(GamesLost);

		
		TableView.setItems(observableTeam);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	@FXML
	private Button MLSBTN;
	@FXML
	private void LoadMLS() {
		
		String queryMLS = "Select * " + "from Teams where League = 'MLS'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException g) {
			// TODO Auto-generated catch block
			g.printStackTrace();
		}
		try {
		Connection Conn = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/finalproject2010","bper233","270313bp");
		System.out.println("Connected");
		Statement data = Conn.createStatement();
		ResultSet reset;
		reset = data.executeQuery(queryMLS);
		List MLSlist = new ArrayList();
		while (reset.next()) {
			String Team =  reset.getString("TeamName");
			String GamesPlayed = reset.getString("GamesPlayed");
			String Pts = reset.getString("Pts");
			String GamesWon = reset.getString("GamesWon");
			String GamesDrawn = reset.getString("GamesDrawn");
			String GamesLost = reset.getString("GamesLost");

			
			Team TeamInstance = new Team(Team, GamesPlayed,Pts, GamesWon, GamesDrawn, GamesLost);
			
			MLSlist.add(TeamInstance);
		}
		ObservableList observableTeam = FXCollections.observableArrayList(MLSlist);
		PropertyValueFactory<Team,String> Team =  new PropertyValueFactory<Team,String>("TeamName");
		PropertyValueFactory<Team,String> GamesPlayed = new PropertyValueFactory<Team,String>("GamesPlayed");
		PropertyValueFactory<Team,String> Pts = new PropertyValueFactory<Team,String>("Pts");
		PropertyValueFactory<Team,String> GamesWon = new PropertyValueFactory<Team,String> ("GamesWon");
		PropertyValueFactory<Team,String> GamesDrawn = new PropertyValueFactory<Team,String> ("GamesDrawn");
		PropertyValueFactory<Team,String> GamesLost = new PropertyValueFactory<Team,String> ("GamesLost");

		
		TeamName.setCellValueFactory(Team);
		FXGamesPlayed.setCellValueFactory(GamesPlayed);
		FXPts.setCellValueFactory(Pts);
		FXGamesWon.setCellValueFactory(GamesWon);
		FXGamesDrawn.setCellValueFactory(GamesDrawn);
		FXGamesLost.setCellValueFactory(GamesLost);

		
		TableView.setItems(observableTeam);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	@FXML
	private TableView<Team> TableView;
	@FXML
	private TableColumn<Team, String> TeamName;
	
	@FXML
	private TableColumn<Team,String> FXGamesPlayed;
	
	@FXML
	private TableColumn<Team,String> FXPts;
	
	@FXML
	private TableColumn<Team, String> FXGamesWon;
	
	@FXML
	private TableColumn<Team, String> FXGamesDrawn;
	
	@FXML
	private TableColumn<Team, String> FXGamesLost;
	

	
	
	
	


	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
		String query1 = "Select * " + "from Teams";
		
		
	try {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			Connection Conn = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/finalproject2010","bper233","270313bp");
			System.out.println("Connected");
			Statement data = Conn.createStatement();
			ResultSet reset;
			reset = data.executeQuery(query1);
			List initialList = new ArrayList();
			while (reset.next()) {
				String Team =  reset.getString("TeamName");
				String GamesPlayed = reset.getString("GamesPlayed");
				String Pts = reset.getString("Pts");
				String GamesWon = reset.getString("GamesWon");
				String GamesDrawn = reset.getString("GamesDrawn");
				String GamesLost = reset.getString("GamesLost");

				
				Team TeamInstance = new Team(Team, GamesPlayed,Pts, GamesWon, GamesDrawn, GamesLost);
				
				initialList.add(TeamInstance);
			}
			ObservableList observableTeam = FXCollections.observableArrayList(initialList);
			PropertyValueFactory<Team,String> Team =  new PropertyValueFactory<Team,String>("TeamName");
			PropertyValueFactory<Team,String> GamesPlayed = new PropertyValueFactory<Team,String>("GamesPlayed");
			PropertyValueFactory<Team,String> Pts = new PropertyValueFactory<Team,String>("Pts");
			PropertyValueFactory<Team,String> GamesWon = new PropertyValueFactory<Team,String> ("GamesWon");
			PropertyValueFactory<Team,String> GamesDrawn = new PropertyValueFactory<Team,String> ("GamesDrawn");
			PropertyValueFactory<Team,String> GamesLost = new PropertyValueFactory<Team,String> ("GamesLost");

			
			TeamName.setCellValueFactory(Team);
			FXGamesPlayed.setCellValueFactory(GamesPlayed);
			FXPts.setCellValueFactory(Pts);
			FXGamesWon.setCellValueFactory(GamesWon);
			FXGamesDrawn.setCellValueFactory(GamesDrawn);
			FXGamesLost.setCellValueFactory(GamesLost);

			
			TableView.setItems(observableTeam);
			
			
				Document doc = Jsoup.connect("https://www.foxsports.com/soccer/standings").timeout(8000).get();
				
				for(Element row : doc.select("tr.wisbb_fvStand")) {
					 String ScTeamNames = row.select("a.wisbb_fullTeam").text();
					 String ScGamesPlayed= row.select("td.wisbb_priorityColumn:eq(1)").text();
					 String ScPts = row.select("td.wisbb_priorityColumn:eq(2)").text();
					 String ScGamesWon = row.select("td.wisbb_priorityColumn:eq(3)").text();
					 String ScGamesDrawn = row.select("td.wisbb_priorityColumn:eq(4)").text();
					 String ScGamesLost = row.select("td.wisbb_priorityColumn:eq(5)").text();
					
					//System.out.println(ScTeamNames + " " + ScGamesPlayed + " " + ScPts + " " + ScGamesWon + " " + ScGamesDrawn + " " + ScGamesLost);
					/**Statement s=Conn.createStatement();
					String sql = "insert into finalproject2010.Teams" + "(TeamName,Pts,GamesPlayed,GamesWon,GamesDrawn,GamesLost)"+
							"values ('"+ScTeamNames+"','"+ScGamesPlayed+"','"+ScPts+"','"+ScGamesWon+"','"+ScGamesDrawn+"','"+ScGamesLost+"')";
					
					s.executeUpdate(sql);
					
					System.out.println("Insert Complete");**/
				
	}
				}

			 catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
		
	
	
	}
}

