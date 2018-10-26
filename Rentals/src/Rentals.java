import java.util.Scanner; //imports Scanner
public class Rentals {
    public static void main (String[]args){
        Scanner reader = new Scanner(System.in);
        Scanner ir = new Scanner (System.in);
        //Set variables in order to calculate total amount
        //of the rentals from the user

        String equipment = getEquipment(reader); // equipment user wants
        String startdate = getDate(reader); // the date the user will start renting
        int  numitems = getnumItems(ir); // number of items user will be renting
        String address = getAddress(reader);// the place the user will be sending the items



        //This is where I get the customer contact info
        String name = getName(reader);// gets users name
        String phonenumber = getPhone(reader);// gets users phone #
        String email= getEmail(reader);// gets users email

        // prints out the user information in a nice format
        System.out.println("CONTACT INFORMATION");
        System.out.println("Name:" + name);
        System.out.println("Phone Number:" + phonenumber);
        System.out.println("Email:" + email);
        System.out.println("ITEMS RENTED");
        System.out.println("Equipment rented:" + equipment);
        System.out.println("Start Date:" + startdate);
        System.out.println("Shiping address:" + address);




        reader.close(); // this will close the reader before the program closes
    }//Where main ends

    /*************************************************************************/
    /*                                                                       */
    /* Function name: getEquipment ()                                        */
    /* Description: Provides the equipment that the user wants to rent       */
    /* Parameters: Scanner reader                                            */
    /* Return Value: string equipment;                                        */
    /*                                                                       */
    /*************************************************************************/



    public static String getEquipment(Scanner reader){
        System.out.println("Please enter the eqipment you would like out of the following");
        System.out.println("Boats, Chairs, Umbrella's");
        String equipment = reader.nextLine();
        return equipment;

    }//Where getEqipment ends

    /*************************************************************************/
    /*                                                                       */
    /* Function name: numItems()                                             */
    /* Description: Provides the number of items the customer wants          */
    /* Parameters: Scanner reader                                            */
    /* Return Value: int numItems                                            */
    /*                                                                       */
    /*************************************************************************/

    public static int getnumItems (Scanner ir) {
        System.out.println("please Enter the number of items you you like between 1-20.");
        int numItems = ir.nextInt();
        return numItems;

    }//Where numItems ends


    /*************************************************************************/
    /*                                                                       */
    /* Function name: getSDate()                                             */
    /* Description: Provides the date the user wants to start renting        */
    /* Parameters: Scanner reader                                            */
    /* Return Value: string startDate                                        */
    /*                                                                       */
    /*************************************************************************/
    public static String   getDate(Scanner reader){
        System.out.println("please enter the date you would like to start ex(mm/dd/yyyy)");
        String startdate = reader.nextLine();
        return startdate;
    }//Where getDate ends


    /*************************************************************************/
    /*                                                                       */
    /* Function name: getAddress()                                           */
    /* Description: Provides the address where the customer wants items      */
    /*              shipped.                                                 */
    /* Parameters: Scanner reader                                            */
    /* Return Value: String address                                         */
    /*************************************************************************/
    public static  String getAddress(Scanner reader){
        System.out.println("Please enter thewhere the itmes should be delivered.");
        System.out.println("Pick one of the 3 places Griffin's grove, Bella's Beach, or other adress:");
        String address = reader.nextLine();
        return address;

    }//Where getAddress ends

    /*************************************************************************/
    /*                                                                       */
    /* Function name: getName()                                              */
    /* Description: Gets the users name for the system                       */
    /* Parameters: Scanner reader                                            */
    /* Return Value: string name                                             */
    /*************************************************************************/

    public static String  getName(Scanner reader){
        System.out.println("Please enter your name.");
        String name = reader.nextLine();
        return name;
    }//Where getName ends


    /*************************************************************************/
    /*                                                                       */
    /* Function name: getPhone()                                             */
    /* Description: Gets the users phone number for the system               */
    /* Parameters: Scanner reader                                            */
    /* Return Value: string phonenumber                                      */
    /*************************************************************************/
    public static String  getPhone (Scanner reader){
        System.out.println("Please enter your phone number.");
        String phonenumber = reader.nextLine();
        return phonenumber;
    }//Where getPhone ends


    /*************************************************************************/
    /*                                                                       */
    /* Function name: getEmail()                                             */
    /* Description: Gets the users email for the system                      */
    /* Parameters: Scanner reader                                            */
    /* Return Value: string email                                            */
    /*************************************************************************/
    public static String getEmail(Scanner reader){
        System.out.println("Please enter your email.");
        String email = reader.nextLine();
        return email;
    }//Where getEmail ends

}//Where Program ends
