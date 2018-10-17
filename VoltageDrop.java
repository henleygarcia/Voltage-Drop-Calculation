
import java.text.*;
import javax.swing.*;

public class voltageDropTest {

    static double voltageDrop;
    static double current;
    static double length;
    static double AWG;
    static double amount;

    static DecimalFormat dec = new DecimalFormat("###.##");

    static final double LENGTH = 3.47;
    static final double REDESIGN = 20.4;
    static final double VD_12 = 0.0020;
    static final double VD_14 = 0.0031;
    static final double VD_16 = 0.0050;
    static final double VD_18 = 0.0128;
    static final double VD_22 = 0.02036;
    static final double VD_24 = 0.0080;

    public static void main(String[] args) {

        // Calculating Voltage Drop after Device Selection
        // JOptionPane window = new JOptionPane(System.in);
        // Asks User to select how much AWG they want.
        Double[] AWG1 = {12.0, 14.0, 16.0, 18.0, 22.0, 24.0};
        double input = (Double) JOptionPane.showInputDialog(null, "Please select the amount of AWG", "Voltage Drop Calculation Test",
                JOptionPane.INFORMATION_MESSAGE, null, AWG1, AWG1[0]);

        // Go through based on what the user chooses on the AWG
        switch ((int) input) {
            case 12: {
                double[] results = userPrompt();
                double current = results[0];
                double length = results[1];
                // Calculating Voltage Drop
                double voltageDrop = 2 * (length * current * VD_12);
                // Calculating Redesign Amount
                double redesign = REDESIGN - voltageDrop;
                // Calculating Allowable Length
                double allowableLength = LENGTH / (2 * current * VD_12);
                checker(dec, redesign, allowableLength, current, length);
                break;
            } // end if for AWG equalling to 12
            case 14: {
                double[] results = userPrompt();
                double current = results[0];
                double length = results[1];
                // Calculating Voltage Drop
                double voltageDrop = 2 * (length * current * VD_14);
                // Calculating Redesign Amount
                double redesign = REDESIGN - voltageDrop;
                // Calculating Allowable Length
                double allowableLength = LENGTH / (2 * current * VD_14);
                checker(dec, redesign, allowableLength, current, length);
                break;
            } // end if for AWG equalling to 14
            case 16: {
                double[] results = userPrompt();
                double current = results[0];
                double length = results[1];
                // Calculating Voltage Drop
                double voltageDrop = 2 * (length * current * VD_16);
                // Calculating Redesign Amount
                double redesign = REDESIGN - voltageDrop;
                // Calculating Allowable Length
                double allowableLength = LENGTH / (2 * current * VD_16);
                checker(dec, redesign, allowableLength, current, length);
                break;
            } // end if for AWG equalling to 16.
            case 18: {
                double[] results = userPrompt();
                double current = results[0];
                double length = results[1];
                // Calculating Voltage Drop
                double voltageDrop = 2 * (length * current * VD_18);
                // Calculating Redesign Amount
                double redesign = REDESIGN - voltageDrop;
                // Calculating Allowable Length
                double allowableLength = LENGTH / (2 * current * VD_18);
                checker(dec, redesign, allowableLength, current, length);
                break;
            } // end if for AWG equalling to 18
            case 22: {
                double[] results = userPrompt();
                double current = results[0];
                double length = results[1];
                // Calculating Voltage Drop
                double voltageDrop = 2 * (length * current * VD_22);
                // Calculating Redesign Amount
                double redesign = REDESIGN - voltageDrop;
                // Calculating Allowable Length
                double allowableLength = LENGTH / (2 * current * VD_22);
                checker(dec, redesign, allowableLength, current, length);
                break;
            } // end if for AWG eqaulling to 22
            case 24: {
                double[] results = userPrompt();
                double current = results[0]; 
                double length = results[1];
                // Calculating Voltage Drop
                double voltageDrop = 2 * (length * current * VD_24);
                // Calculating Redesign Amount
                double redesign = REDESIGN - voltageDrop;
                // Calculating Allowable Length
                double allowableLength = LENGTH / (2 * current * VD_24);
                checker(dec, redesign, allowableLength, current, length);
                break;
            } // end if the AWG eqauls to 24
        }

        // Ask if you want to do another calculation
        if (JOptionPane.showConfirmDialog(null, "Would you like to do another calculation?", "Voltage Drop Calculation", 0) == 0) {
            main(args);
        }
        else {
            System.exit(0); // close out of the program.
        }
    } // end main method

    public static double[] userPrompt() {
        boolean curNegative;
        boolean lenNegative;
        double currentIn = 0;
        double lengthIn = 0;
        do {
            String currentInput = JOptionPane.showInputDialog("Please enter the amount of current needed in Amps (must be positive): ");
            currentIn = Double.parseDouble(currentInput);
            curNegative = currentIn < 0;
        } while (curNegative);

        do {
            String lengthInput = JOptionPane.showInputDialog("Please enter the estimated length needed in feet (must be positive): ");
            lengthIn = Double.parseDouble(lengthInput);
            lenNegative = lengthIn < 0;
        } while (lenNegative);

        double[] result = {currentIn, lengthIn};
        return result;
    }

    public static void checker(DecimalFormat dec, double redesign, double allowableLength, double current, double length) {
        String currentNeeded = "Amount of current needed (Amps): " + current;
        String lengthNeeded = "\nEstimated length needed (feet): " + length;
        if (redesign < 16) {
            JOptionPane.showMessageDialog(null, currentNeeded + lengthNeeded
                    + "\nWarning! You have to redesign your circuit! ", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else if (redesign >= 16) {
            JOptionPane.showMessageDialog(null, currentNeeded + lengthNeeded + "\nYour circuit is okay!\n" + "The voltage at last device is: "
                    + dec.format(redesign) + "\nThe allowable length is: " + dec.format(allowableLength) + " feet.");
        }
    }
} // end public class VoltageDrop
