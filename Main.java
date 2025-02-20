import java.util.*;

public class Main {

    //credentials, who knows you.
    public static String[] Credentials(){
         String admU = "melekh";
         String admP = "ylla";

         return new String[]{admU, admP};
    }

    //Main face, which greets you.
    public static String mainFace(String input){
        String mainFace = "Welcome to the living room!\nChoose a path to take\n";
       
        String[] paths = paths();
        for(int i = 0; i < paths.length; i++){
            mainFace += "\n" + (i+1) + ". " + paths[i];
        }
        return mainFace;
    }

    //paths, where you walk to.
    public static String[] paths(){
        String[] paths = new String[11];
        //what is inside
        paths[0] = "Hall of memories";
        paths[1] = "Room of history";
        paths[2] = "Room of artistry";
        paths[3] = "Room of dreams";
        paths[4] = "Room of nightmares";
        paths[5] = "Room of the unknown";
        paths[6] = "Room of the known\n";

        //what is outside
        paths[7] = "Garden of spirits";
        paths[8] = "Pavillion of wonders";
        paths[9] = "Grove of the lost";
        paths[10] = "Grave of devices";
                
        return paths;
    }

    //main, who thinks of all.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("U: ");
        String username = sc.nextLine();

        System.out.print("P: ");
        String password = sc.nextLine();

        String[] credentials = Credentials();
        String admU = credentials[0];
        String admP = credentials[1];

        if(username.equals(admU) && password.equals(admP)){
            System.out.println("Welcome, " + username + "!\n");
            String welc = mainFace(username);

            System.out.println(welc);
        } else {
            System.out.println("Invalid username or password!");
        }

        System.out.print("\nPath: ");
        int path = sc.nextInt();
        String[] paths = paths();

        if(path > 0 && path <= paths.length){
            System.out.println("You have chosen the path of " + paths[path-1]);
        } else {
            System.out.println("Be careful! lest you fall into the void!");
        }
    }
}
