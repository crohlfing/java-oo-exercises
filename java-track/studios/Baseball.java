
public class Baseball {

	private String name;
	private int number;
	private String handed;
	private int games;
	private int runs;
	private int hits;
	
	public Baseball(String name, int number, String handed, int games,int runs, int hits)
	{
		this.name = name;
		this.number = number;
		this.handed = handed;
		this.games = games;
		this.runs = runs;
		this.hits = hits;
	}
	
	public Baseball(String name, int number, String handed)
	{
		this.name = name;
		this.number = number;
		this.handed = handed;
		this.games = 0;
		this.runs = 0;
		this.hits = 0;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getHanded() {
		return handed;
	}

	public int getGames() {
		return games;
	}

	public int getRuns() {
		return runs;
	}

	public int getHits() {
		return hits;
	}
	public void newGamePlayed(int gameHits, int gameRuns)
	{
		this.games= this.games + 1;
		this.hits= this.hits + gameHits;
		this.runs= this.runs + gameRuns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
