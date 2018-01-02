import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class VoltageDrop
{
    
       
	
        static double voltageDrop;
	static double current;
	static double length;
	static double AWG;
	static double amount;
       
	  
     
	
	public static void main(String[] args) 
	{
		
      // Calculating Voltage Drop after Device Selection
        	
		
			   DecimalFormat dec = new DecimalFormat("###.##");
			// JOptionPane window = new JOptionPane(System.in);
                        
                   
            
			// Asks User to select how much AWG they want.
			
		 Double[] AWG1 = { 12.0, 14.0, 16.0, 18.0, 22.0, 24.0 };
                 double input = (Double) JOptionPane.showInputDialog(null, "Please select the amount of AWG", "Voltage Drop Calculation", JOptionPane.INFORMATION_MESSAGE, null, AWG1, AWG1[0]);

        	// Go through based on what the user chooses on the AWG
        	
		 if (input == 12)
		{
			String currentInput = JOptionPane.showInputDialog("Please enter the amount of current needed (in Amps): ");
			double current  = Double.parseDouble(currentInput);
			
			String lengthInput = JOptionPane.showInputDialog("Please enter the estimated length needed (in feet): ");
			double length = Double.parseDouble(lengthInput);
			
			// Calculating Voltage Drop
			double voltageDrop = 2 * (length * current * 0.0020);
			
			// Calculating Allowable Length
			double allowableLength = 3.47 / (2 * current * 0.0020);
                       
			
			// Calculating Redesign Amount
			double redesign = 20.4 - voltageDrop;
			
			if(redesign < 16)
			{
				JOptionPane.showMessageDialog(null, "Warning! You have to redesign your circuit! ", "Warning!", JOptionPane.WARNING_MESSAGE);
			}
			else if(redesign >= 16)
			{
				JOptionPane.showMessageDialog(null, "Your circuit is okay!" + "\n" + "The voltage at last device is: " + dec.format(redesign) + "\n" + "The Allowable length is: " + dec.format(allowableLength) + " feet.");
			}
                        
                           
			
		} // end if for AWG equalling to 12
        	
		else if (input == 14)
			
			
		{
			String currentInput = JOptionPane.showInputDialog("Please enter the amount of current needed (in Amps): ");
			double current  = Double.parseDouble(currentInput);
			
			String lengthInput = JOptionPane.showInputDialog("Please enter the estimated length needed (in feet): ");
			double length = Double.parseDouble(lengthInput);
			
			// Calculating Voltage Drop
			double voltageDrop = 2 * (length * current * 0.0031);
			
			// Calculating Allowable Length
			double allowableLength = 3.47 / (2 * current * 0.0031);
			
			// Calculating Redesign Amount
			double redesign = 20.4 - voltageDrop;
			
			if(redesign < 16)
			{
				JOptionPane.showMessageDialog(null, "Warning! You have to redesign your circuit! ", "Warning!", JOptionPane.WARNING_MESSAGE);
			}
			else if(redesign >= 16)
			{
				JOptionPane.showMessageDialog(null,  "Your circuit is okay!" + "\n" + "The voltage at last device is: " + dec.format(redesign) + "\n" + "The Allowable length is: " + dec.format(allowableLength) + " feet.");
			}
		} // end if for AWG equalling to 14
        	
		else if (input == 16)
		{
			String currentInput = JOptionPane.showInputDialog("Please enter the amount of current needed (in Amps): ");
			double current  = Double.parseDouble(currentInput);
			
			String lengthInput = JOptionPane.showInputDialog("Please enter the estimated length needed (in feet): ");
			double length = Double.parseDouble(lengthInput);
			
			// Calculating Voltage Drop
			double voltageDrop = 2 * (length * current * 0.0050);
			
			// Calculating Allowable Length
			double allowableLength = 3.47 / (2 * current * 0.0050);
			
			// Calculating Redesign Amount
			double redesign = 20.4 - voltageDrop;
			
			if(redesign < 16)
			{
				JOptionPane.showMessageDialog(null, "Warning! You have to redesign your circuit! ", "Warning!", JOptionPane.WARNING_MESSAGE);
			}
			else if(redesign >= 16)
			{
				JOptionPane.showMessageDialog(null, "Your circuit is okay!" + "\n" + "The voltage at last device is: " + dec.format(redesign) + "\n" + "The Allowable length is: " + dec.format(allowableLength) + " feet.");
			}
		} // end if for AWG equalling to 16.
        	
		else if (input == 18)
		{
			String currentInput = JOptionPane.showInputDialog("Please enter the amount of current needed (in Amps): ");
			double current  = Double.parseDouble(currentInput);
			
			String lengthInput = JOptionPane.showInputDialog("Please enter the estimated length needed (in feet): ");
			double length = Double.parseDouble(lengthInput);
			
			// Calculating Voltage Drop
			double voltageDrop = 2 * (length * current * 0.0128);
			
			// Calculating Allowable Length
			double allowableLength = 3.47 / (2 * current * 0.0128);
			
			// Calculating Redesign Amount
			double redesign = 20.4 - voltageDrop;
			
			if(redesign < 16)
			{
				JOptionPane.showMessageDialog(null, "Warning! You have to redesign your circuit! ", "Warning!", JOptionPane.WARNING_MESSAGE);
			}
			else if(redesign >= 16)
			{
				JOptionPane.showMessageDialog(null,  "Your circuit is okay!" + "\n" + "The voltage at last device is: " + dec.format(redesign) + "\n" + "The Allowable length is: " + dec.format(allowableLength) + " feet.");
			}
		} // end if for AWG equalling to 18
		
		// If the user enters for the input > 18 or < 10 for the AWG it will prompt the user with an error of invalid input for AWG.
		
		else if (input == 22)
		{
			
			String currentInput = JOptionPane.showInputDialog("Please enter the amount of current needed (in Amps): ");
			double current  = Double.parseDouble(currentInput);
			
			String lengthInput = JOptionPane.showInputDialog("Please enter the estimated length needed (in feet): ");
			double length = Double.parseDouble(lengthInput);
			
			// Calculating Voltage Drop
			double voltageDrop = 2 * (length * current * 0.02036);
			
			// Calculating Allowable Length
			double allowableLength = 3.47 / (2 * current * 0.02036);
			
			// Calculating Redesign Amount
			double redesign = 20.4 - voltageDrop;
			
			if(redesign < 16)
			{
				JOptionPane.showMessageDialog(null, "Warning! You have to redesign your circuit!", "Warning!", JOptionPane.WARNING_MESSAGE);
			}
			else if(redesign >= 16)
			{
				JOptionPane.showMessageDialog(null,  "Your circuit is okay!" + "\n" + "The voltage at last device is: " + dec.format(redesign) + "\n" + "The Allowable length is: " + dec.format(allowableLength) + " feet.");
			}
			
			} // end if for AWG eqaulling to 22
        	
			else if (input == 24)
			{
				
				String currentInput = JOptionPane.showInputDialog("Please enter the amount of current needed (in Amps): ");
				double current  = Double.parseDouble(currentInput);
				
				String lengthInput = JOptionPane.showInputDialog("Please enter the estimated length needed (in feet): ");
				double length = Double.parseDouble(lengthInput);
				
				// Calculating Voltage Drop
				double voltageDrop = 2 * (length * current * 0.0080);
				
				// Calculating Allowable Length
				double allowableLength = 3.47 / (2 * current * 0.0080);
				
				// Calculating Redesign Amount
				double redesign = 20.4 - voltageDrop;
				
				if(redesign < 16)
				{
					JOptionPane.showMessageDialog(null, "Warning! You have to redesign your circuit! ", "Warning!", JOptionPane.WARNING_MESSAGE);
				}
				else if(redesign >= 16)
				{
					JOptionPane.showMessageDialog(null,  "Your circuit is okay!" + "\n" + "The voltage at last device is: " + dec.format(redesign) + "\n" + "The allowable length is: " + dec.format(allowableLength) + " feet.");
				}
			} // end if the AWG eqauls to 24
	
                    
                    // Ask if you want to do another calculation
                    if (JOptionPane.showConfirmDialog(null, "Would you like to do another calculation?", "Voltage Drop Calculation", 0) == 0) 
                    {
                    main(args);
                     } 
                   else 
                    {
      
                        System.exit(0); // close out of the program.
                    }
                    
                   
                     
                     
            } // end main method
        } // end public class VoltageDrop