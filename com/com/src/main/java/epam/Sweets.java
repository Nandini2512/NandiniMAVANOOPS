package epam;

class Sweet1 implements Comparable{
	int weight=2;
	String name="";
	String color="brown";
	float calories=150;
	public int compareTo(Object o) {
	return 0;
	}
	}
	class Chocolate extends Sweet1{
		Chocolate(){
			this.name="Chocolate";
		}
	}
	class FiveStar extends Chocolate
	{
	FiveStar ()
	{
	this.name="FiveStar";
	}
	}
	class DairyMilk extends Chocolate{
		DairyMilk(){
			this.name="DairyMilk";
		}
	}
	class Cadberry extends Chocolate{
		Cadberry(){
			this.name="Cadberry";
		}
	}
	class Ecliers extends Chocolate{
		Ecliers(){
			this.name="Ecliers";
		}
	}
	class KitKat extends Chocolate{
	KitKat()
	{
	this.name="KitKat";
	}
	}
public class Sweets {
	public static void main(String[] args) {
	Sweet1  sweets[] = new Sweet1[7];
	sweets [0]= new FiveStar();
	sweets [1]= new FiveStar();
	sweets [2]= new KitKat();
	sweets [3]=new Chocolate();
	sweets [4]=new Cadberry();
	sweets [5]=new Ecliers();
	sweets [6]=new DairyMilk();
	float tw =0;
	String sorti="";
	for (int i = 0; i < sweets.length; i++) {
	Sweet1 s = sweets[i];
	tw += s.weight;
	}
	System.out.println("The total weight is  = "+tw);
	System.out.println(" Printing the sweets ");
	for (int i = 0; i < sweets.length; i++) {
	Sweet1 s = sweets[i];
	System.out.println(s.name);
	}
	
	
	}
	
}





	




