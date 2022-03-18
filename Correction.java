public class Correction {
    public static void main(String[] args){

        // checking if inputs are available
        if (args.length < 2){
            // displays an error code
            System.err.println("Error Usage is:");
            System.err.println("Activity1 Systolic Diastolic");
            System.err.println("No inputs for processing .....");
            // exits the program if nio output
            System.exit(-1);
        }

        // converting inputs to integer
        // using the pars keyword
        int systolic = Integer.parseInt(args[0]);
        int diastolic = Integer.parseInt(args[1]);

        // comparing the entry values
        System.out.println(systolic + "/" + diastolic + "is: ");

        if ((systolic <= 90) || (diastolic <= 60)){
            System.out.println("Low Blood Pressure");
        } else if ((systolic >= 140) || (diastolic >= 90)){
            System.out.println("High Blood pressure");
        } else if ((systolic >= 120) || (diastolic >=80)){
            System.out.println("Pre-High blood pressure");
        } else{
            System.out.println("Ideal blood pressure");
        }
    }
}
