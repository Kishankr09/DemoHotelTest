import java.util.Scanner;
class Hotel{
	String name;
	int days,price = 3500;
	
}
class HotelFood{
	String food;
	int fPrice;
}
class calculate{
	void cal(Hotel h, HotelFood hf) {
		float total;
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome To our Hotel Sir/Madam !!");
		System.out.println("Our Hotel Price is 3500.");
		System.out.println("Its non-negotiable\n");
		System.out.println("Enter The Name: ");
		h.name = s.nextLine();
		System.out.println("How Many Days You Will Stay : ");
		h.days = s.nextInt();
		total = 3500 * h.days;
		System.out.println("You want To oder food(Y/N)  :");
		char ch = s.next().charAt(0);
		if(ch=='Y' || ch =='y') {
			System.out.println("1.BreakFast\n2.Lunch\n3.Dinner\n");
			int ch1 = s.nextInt();
			switch(ch1) {
			case 1:
			{
				System.out.println("\n1.Idali With Sambhar : Rs.30");
				System.out.println("\n2.Dosa With Sambhar & Chatni : Rs.40");
				System.out.println("\n3.Puri And Cury : Rs.40");
				System.out.println("\n1.Bonda with Chatni : Rs.30");
				while(true) {
				int ch2 = s.nextInt();
				System.out.println("Enter The Quantity  :");
				int qty = s.nextInt();
				switch(ch2) {
				case 1: case 4: 
					total = total + qty * 30;
					break;
				case 2:case 3:
					total = total + qty * 40;
					break;
				default:
					System.out.println("You have Input wrong Number ");
				}
						System.out.println("What else would you like to eat (Y/N) :");
						char ch3 = s.next().charAt(0);	
						if(ch3=='Y' || ch3 =='y') 
							continue;
						else
							break;	
			}
			}
				break;
			case 2:
			{
				System.out.println("\n1.Chicken Cury with Chawal  : Rs.110");
				System.out.println("\n2.Chicken Fry with Chawal  : Rs.120\"");
				System.out.println("\n3.Egg Cury with Chawal  : Rs.90\"");
				System.out.println("\n4.Egg bhurgi with Roti : Rs.90");
				System.out.println("\n5.cury with Chawal  : Rs.70");
				System.out.println("\n6.Mutton cury with Chawal  : Rs.150");
				while(true) {
				int ch2 = s.nextInt();
				System.out.println("Enter The Quantity  :");
				int qty = s.nextInt();
				switch(ch2) {
				case 3: case 4: 
					total = total + qty * 90;
					break;
				case 1:
					total = total + qty * 110;
					break;
				case 2:
					total = total + qty * 120;
					break;
				case 5:
					total = total + qty * 70;
					break;
				case 6:
					total = total + qty * 150;
					break;
				default:
					System.out.println("You have Input wrong Number ");
				}
						System.out.println("What else would you like to eat (Y/N) :");
						char ch3 = s.next().charAt(0);	
						if(ch3=='Y' || ch3 =='y') 
							continue;
						else
							break;	
			}
			}
				break;
			case 3: 
			{
				System.out.println("\n1.Chicken Cury with Roti  : Rs.110");
				System.out.println("\n2.Chicken Fry with Roti  : Rs.120\"");
				System.out.println("\n3.Egg Cury with Roti  : Rs.90\"");
				System.out.println("\n4.Egg bhurgi with Roti : Rs.90");
				System.out.println("\n5.Cury with Roti  : Rs.70");
				System.out.println("\n6.Mutton cury with Roti  : Rs.150");
				while(true) {
				int ch2 = s.nextInt();
				System.out.println("Enter The Quantity  :");
				int qty = s.nextInt();
				switch(ch2) {
				case 3: case 4: 
					total = total + qty * 90;
					break;
				case 1:
					total = total + qty * 110;
					break;
				case 2:
					total = total + qty * 120;
					break;
				case 5:
					total = total + qty * 70;
					break;
				case 6:
					total = total + qty * 150;
					break;
				default:
					System.out.println("You have Input wrong Number ");
				}
						System.out.println("What else would you like to eat (Y/N) :");
						char ch3 = s.next().charAt(0);	
						if(ch3=='Y' || ch3 =='y') 
							continue;
						else
							break;	
			}
			}
				break;	
			default:
				System.out.println("You have input wrong Option !!");
			}
			System.out.println("Your Total Amount is " + total);
			System.out.println("Please Wait In Your Room\nOrder will be delevered in your Room !!");
		}else {
		System.out.println("Our Room Service has Cleaned Your Room\nPlease Rest in Your Room");
		System.out.println("Your Total Amount is " + total);
		}
	
	}
}
public class DemoHotelTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Hotel htl = new Hotel();
		HotelFood Hfd = new HotelFood();
		calculate c = new calculate();
		c.cal(htl, Hfd);

	}

}
