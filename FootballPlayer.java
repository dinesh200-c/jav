abstract class Player {
	
	String firstName;
	String lastName;
	
	
	public Player(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName(String firstName, String lastName) {
		
		return("full name is :" +firstName+ " "+lastName);
	}

	protected abstract int getRating();

}

class Cricketplayer extends Player {


	double averageRuns;
	
	public Cricketplayer(String firstName, String lastName, double averageRuns) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
		
		System.out.println(firstName+ " " +lastName+ " " +averageRuns);
	}
	
	@Override
	protected int getRating() {
		// TODO Auto-generated method stub
		if(averageRuns > 55) {
			return (7);
		}
		else if (averageRuns > 50 && averageRuns <= 55) {
			return (6);
		}
		else if (averageRuns > 40 && averageRuns <= 50) {
			return (5);
		}
		else if (averageRuns > 30 && averageRuns <= 40) {
			return (3);
		}
		else if (averageRuns > 20 && averageRuns <= 30) {
			return (2);
		}
		else if (averageRuns < 20 ) {
			return (1);
		}
		return 0;
		
	}
		
}

public class FootballPlayer extends Player {
	
	int goals;

	public FootballPlayer(String firstName, String lastName, int goals) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
		
		System.out.println(firstName+ " " +lastName+ " " +goals);
	}

	@Override
	protected int getRating() {
		// TODO Auto-generated method stub
		
		if(goals > 20) {
			return 5;
		}
		else if (goals > 15 && goals <= 20) {
			return 4;
		}
		else if (goals > 10 && goals <= 15) {
			return 3;
		}
		else if (goals > 5 && goals <= 10) {
			return 2;
		}
		else if (goals <= 5) {
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		Player k = new FootballPlayer("dinesh", "naidu", 12);
		
		System.out.println(k.getRating());
		
        Player p = new Cricketplayer("dinesh", "naidu", 25);
		
		System.out.println(p.getRating());	
	}

}


