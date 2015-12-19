package Kappa.kappa123;

public class Position {
	
	private int number;
	private String name;
	private int attack;
	private int defence;
	
	public Position(int number, String name, int attack, int defence){
		this.number = number;
		this.name = name;
		this.attack = attack;
		this.defence = defence;
	}
	
	public void setNumber(int n){
		number = n;
	}
	
	public void setName(String s){
		name = s;
	}
	
	public void setAttack (int a){
		attack = a;
	}
	
	public void setDefence(int d){
		defence = d;
	}
	
	public int getNumber(){
		return number;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAttack(){
		return attack;
	}
	
	public int getDefence(){
		return defence;
	}
	
	public void setStats(String n, int a, int d){
		setName(n); setAttack(a); setDefence(d);
	}
	
	public String toString(){
		return "{" + "\"" + name + "\"" + "(ATTACK: " + attack + ")"+ "(DEFENCE: "+ defence + ")"+"}";
	}

}
