package Package1;
import java.util.Scanner;

public class RunQuad {

	public static void main(String[] args) {
		do {
			Scanner scn = new Scanner(System.in);
			System.out.print("Press R for Rectangle or S for Square. ");
			char ans = scn.next().toUpperCase().charAt(0);
			
			switch(ans) {
			case 'R':
				Rectangle r = new Rectangle();
				System.out.println("A rectangle:");
				r.showDescription();
				
				break;
			case 'S':
				Square s = new Square();
				System.out.println("A square:");
				s.showDescription();
				break;
			}
			System.out.print("\ncontinue? [Y/N] ");
			char con = scn.next().toUpperCase().charAt(0);
			if (con == 'Y') {
				continue;
			}
			else if (con == 'N') {
				System.out.println("Thank you!");
				break;
			}
		}while(true);
	}

}
