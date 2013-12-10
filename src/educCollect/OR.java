package educCollect;

public class OR {

	public static void main(String[] args) {
		
		String matrix [][] = new String [9][9];
		
		for(int i = 0; i < 0; i++){
			for(int j = 0; j < 0; j++){
				if(i < j){					
					matrix [i][j] = "0 ";					
				}else{					
					matrix [i][j] = "1 ";				
				}
				System.out.print(matrix);
			}
			System.out.println();
		}
	}

}
