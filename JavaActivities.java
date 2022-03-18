import java.util.Scanner;

public class JavaActivities {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // taking input into the system

        // taking the Systolic BP
        System.out.print("Enter Systolic blood pressure: ");
        double SBP = input.nextDouble();
        // converting to ints values
        int SysBP = (int) Math.round(SBP);


        // taking the Diastolic BP
        System.out.print("Enter Diastolic blood pressure: ");
        double DBP = input.nextDouble();
        // converting to ints
        int DiaBP = (int) Math.round(DBP);

        // comparing the inputs for Systolic
        if ((SysBP >= 90) && (SysBP <=120.90)){
            System.out.println("Ideal Systolic Pressure");
        } else if (SysBP < 90){
            System.out.println("Low Blood Pressure");
        } else if ((SysBP > 120) && (SysBP <= 140)){
            System.out.println("High Blood pressure");
        } else {
            System.err.println("Over High");
        }

        // comparing the inputs for Diastolic
        if ((DiaBP >= 60) && (DiaBP <= 80.60)){
            System.out.println("Ideal Diastolic Blood Pressure");
        } else if (DiaBP < 60){
            System.out.println("Low Blood Pressure");
        } else if ((DiaBP >= 80) && (DiaBP <90)){
            System.out.println("Pre-High Blood pressure");
        } else {
            System.err.println("High Blood Pressure");
        }
    }
}
