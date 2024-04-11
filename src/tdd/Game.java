package tdd;


public class Game {
	
	
	
	static int Nb_Max_Tours = 21;
	private int Rollrecent = 0;
	private int[] rolls = new int[Nb_Max_Tours];

	
	
	
    void roll(int nbQuilles) {
        rolls[Rollrecent++] = nbQuilles;
    }
	
    
    
    int score() {
        int scoretotal = 0;
        int i= 0;

        for (int frame = 0; frame < 10; frame++) {
                scoretotal += ( rolls[i] + rolls[i + 1] );
                i += 2;
            }
        
    
        return scoretotal;
    }

}
	

 


