import java.util.Scanner;


public class Calculate_Statistics {

	private String name;
	private int AB;
	private int Hits;
	private int dbls;
	private int trpls;
	private int HR;
	private int Runs;
	private int BB;
	private int HBP;
	private int SF;
	
	public Calculate_Statistics(String name, int aB, int hits, int dbls, int trpls, int hR, int runs, int bB, int hBP,int sF) {
		super();
		this.name = name;
		AB = aB;
		Hits = hits;
		this.dbls = dbls;
		this.trpls = trpls;
		HR = hR;
		Runs = runs;
		BB = bB;
		HBP = hBP;
		SF = sF;
	}
	
	public int singles() {
		return this.Hits - this. dbls - this.trpls - this.HR;
	}
	
	public double BA() {
		return (double) this.Hits / this.AB;
	}
	
	public static double BA(int Hits, int AB) { 
		return (double) Hits/AB;
	}
	
	public int TB() {
		return ((this.singles()) + (this.dbls * 2) + (this.trpls * 3) + (this.HR * 4));
	}
	
	public double SLG() {
		return (double) this.TB() / this.AB;
	}
	
	public double OBP() {
		return (double) (this.Hits + this.BB + this.HBP) / (this.AB + this.BB + this.HBP);
	}

	public double OBS() {
		return this.OBP() + this.SLG();
	}
}
