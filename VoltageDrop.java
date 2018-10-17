
import java.text.*;
import javax.swing.*;

public class VoltageDrop {

    static double voltageDrop;
    static double current;
    static double length;
    static double AWG;
    static double amount;

    static DecimalFormat dec = new DecimalFormat("###.##");

    static final double lengthConst = 3.47;
    static final double const12 = 0.0020;
    static final double const14 = 0.0031;
    static final double const16 = 0.0050;
    static final double const18 = 0.0128;
    static final double const22 = 0.02036;
    static final double const24 = 0.0080;

    public static void main(String[] args) {

        // Calculating Voltage Drop after Device Selection
        // JOptionPane window = new JOptionPane(System.in);
        // Asks User to select how much AWG they want.
        Double[] AWG1 = {12.0, 14.0, 16.0, 18.0, 22.0, 24.0};
        double input = (Double) JOptionPane.showInputDialog(null, "Please select the amount of AWG", "Voltage Drop Calculation Test",
                JOptionPane.INFORMATION_MESSAGE, null, AWG1, AWG1[0]);

        // Go through based on what the user chooses on the AWG
        if (input == 12) {
            double[] results = userPrompt();
            double current = results[0];
            double length = results[0];
            // Calculating Voltage Drop
            double voltageDrop = 2 * (length * current * const12);

            // Calculating Redesign Amount
            double redesign = 20.4 - voltageDrop;

            // Calculating Allowable Length
            double allowableLength = lengthConst / (2 * current * const12);

            checker(dec, redesign, allowableLength);

        } // end if for AWG equalling to 12

        else if (input == 14) {
            double[] results = userPrompt();
            double current = results[0];
            double length = results[0];

            // Calculating Voltage Drop
            double voltageDrop = 2 * (length * current * const14);

            // Calculating Redesign Amount
            double redesign = 20.4 - voltageDrop;

            // Calculating Allowable Length
            double allowableLength = lengthConst / (2 * current * const14);

            checker(dec, redesign, allowableLength);
        } // end if for AWG equalling to 14

        else if (input == 16) {
            double[] results = userPrompt();
            double current = results[0];
            double length = results[0];

            // Calculating Voltage Drop
            double voltageDrop = 2 * (length * current * const16);

            // Calculating Redesign Amount
            double redesign = 20.4 - voltageDrop;

            // Calculating Allowable Length
            double allowableLength = lengthConst / (2 * current * const16);

            checker(dec, redesign, allowableLength);
        } // end if for AWG equalling to 16.

        else if (input == 18) {
            double[] results = userPrompt();
            double current = results[0];
            double length = results[0];

            // Calculating Voltage Drop
            double voltageDrop = 2 * (length * current * const18);

            // Calculating Redesign Amount
            double redesign = 20.4 - voltageDrop;

            // Calculating Allowable Length
            double allowableLength = lengthConst / (2 * current * const18);

            checker(dec, redesign, allowableLength);
        } // end if for AWG equalling to 18

        // If the user enters for the input > 18 or < 10 for the AWG it will prompt the user with an error of invalid input for AWG.
        else if (input == 22) {
            double[] results = userPrompt();
            double current = results[0];
            double length = results[0];

            // Calculating Voltage Drop
            double voltageDrop = 2 * (length * current * const22);

            // Calculating Redesign Amount
            double redesign = 20.4 - voltageDrop;

            // Calculating Allowable Length
            double allowableLength = lengthConst / (2 * current * const22);

            checker(dec, redesign, allowableLength);
        } // end if for AWG eqaulling to 22

        else if (input == 24) {
            double[] results = userPrompt();
            double current = results[0];
            double length = results[0];

            // Calculating Voltage Drop
            double voltageDrop = 2 * (length * current * const24);

            // Calculating Redesign Amount
            double redesign = 20.4 - voltageDrop;

            // Calculating Allowable Length
            double allowableLength = lengthConst / (2 * current * const24);

            checker(dec, redesign, allowableLength);
        } // end if the AWG eqauls to 24

        // Ask if you want to do another calculation
        if (JOptionPane.showConfirmDialog(null, "Would you like to do another calculation?", "Voltage Drop Calculation", 0) == 0) {
            main(args);
        }
        else {

            System.exit(0); // close out of the program.
        }

    } // end main method

    public static double[] userPrompt() {
        String currentInput = JOptionPane.showInputDialog("Please enter the amount of current needed (in Amps): ");
        double current = Double.parseDouble(currentInput);

        String lengthInput = JOptionPane.showInputDialog("Please enter the estimated length needed (in feet): ");
        double length = Double.parseDouble(lengthInput);

        double[] result = {current, length};
        return result;
    }

    public static void checker(DecimalFormat dec, double redesign, double allowableLength) {
        if (redesign < 16) {
            JOptionPane.showMessageDialog(null, "Warning! You have to redesign your circuit! ", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if (redesign >= 16) {
            JOptionPane.showMessageDialog(null, "Your circuit is okay!" + "\n" + "The voltage at last device is: " + dec.format(redesign) + "\n" + "The allowable length is: " + dec.format(allowableLength) + " feet.");
        }
    }
} // end public class VoltageDrop
