package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Team {

		private final SimpleStringProperty TeamName;
		private final SimpleStringProperty GamesPlayed;
		private final SimpleStringProperty Pts;
		private final SimpleStringProperty GamesWon;
		private final SimpleStringProperty GamesDrawn;
		private final SimpleStringProperty GamesLost;

		
		public Team(String Team, String GP,String Pts, String GW, String GD, String GL) {
			this.TeamName = new SimpleStringProperty(Team);
			this.GamesPlayed = new SimpleStringProperty(GP);
			this.Pts = new SimpleStringProperty(Pts);
			this.GamesWon = new SimpleStringProperty(GW);
			this.GamesDrawn = new SimpleStringProperty(GD);
			this.GamesLost = new SimpleStringProperty(GL);

		}



		public String getTeamName() {
			return TeamName.get();
		}

		public String getGamesPlayed() {
			return GamesPlayed.get();
		}
		
		public String getPts() {
			return Pts.get();
		}

		public String getGamesWon() {
			return GamesWon.get();
		}

		public String getGamesDrawn() {
			return GamesDrawn.get();
		}

		public String getGamesLost() {
			return GamesLost.get();
		}


		



}
