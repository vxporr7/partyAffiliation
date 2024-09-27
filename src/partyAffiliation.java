import java.util.Scanner;
public class partyAffiliation {
    public static void main(String[] args) {
    int num=0;
    Scanner in= new Scanner(System.in);
        System.out.println("Enter a number between [1-4} to determine your party Affiliation:");
    if (in.hasNextInt()){
        num = in.nextInt();
        in.nextLine();
    }
    if (num==1){
        System.out.println("You are a Democrat!");
    }
    else if (num==2){
        System.out.println("You are a republican");
    }
    else if (num==3){
        System.out.println("You are Independent");
    }
    else if (num==4){
        System.out.println("You are Other!");
    }
    else {
        System.out.println("You have entered an Invalid Number, please Try again");
    }
    }
}

