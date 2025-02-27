package com.datastructure;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=6;
		towerOfHanoi(i,'a','b','c');

	}

	private static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
		// TODO Auto-generated method stub
		
		if(n==1)
		{
			System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
			return;
		}
		
		towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
		
	}

}
