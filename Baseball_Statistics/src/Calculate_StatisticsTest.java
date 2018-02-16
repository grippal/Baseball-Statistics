import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculate_StatisticsTest {

	@Test
	void test() {
		
		String name = "Test";
		int AB = 8399;
	    int Hits = 2873;
		int dbls = 506;
		int trpls = 136;
		int HR = 714;
		int Runs = 2174;
		int BB = 2062;
	    int HBP = 43;
		int SF = 0;
		
		Calculate_Statistics st = new Calculate_Statistics(name, AB, Hits, dbls, trpls, HR, Runs, BB, HBP, SF);
	
		double dExpectedBA = 0.342;
		double dExpectedOBP = 0.474;
		double dExpectedSLG = 0.690;
		double dExpectedOBS = 1.164;
		double dExpectedTB = 5793;
		
		assertEquals(dExpectedBA, st.BA(), 0.01);
		assertEquals(dExpectedOBP, st.OBP(), 0.01);
		assertEquals(dExpectedSLG, st.SLG(), 0.01);
		assertEquals(dExpectedOBS, st.OBS(), 0.01);
		assertEquals(dExpectedTB, st.TB(), 0.01);
	}

}
