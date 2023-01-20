import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String pin = "2241";
	    String puk = "123521347";
	    String pin_entry = "";
	    String puk_entry = "";
	    int count = 0;
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter pin: ");
		
		while(!pin.equals(pin_entry) && count < 3){
		    count++;
		    pin_entry = scanner.nextLine();
		    if(!pin.equals(pin_entry) && count <= 3){
		        System.out.println("Incorrect pin! Try again");
		    }
		}
		if (pin.equals(pin_entry)){
		    System.out.println("Welcome User!!");
		}
		else{
		    System.out.println("Attempts failed..Enter puk:");
		    count=0;
		    while(!puk.equals(puk_entry) && count < 7){
		        count++;
		        puk_entry = scanner.nextLine();
		       if(!puk.equals(puk_entry) && count <= 7){
		           System.out.println("Wrong PUK..try again");
		       }
		       }
		       if(puk.equals(puk_entry) && count <= 7){
		           System.out.println("Welcome");
		       }
		    else {
		        System.out.println("Simcard Blocked!!");
		    }
		}
		}
}



