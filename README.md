# Voltage Drop Calculation

Voltage Drop Calculation by Henley Garcia

# What is Voltage Drop?

Voltage drop is the energy supplied by a voltage source is reduced as electric current moves through the passive elements (elements that do not supply voltage) of an electrical circuit. Note: this for direct current circuits that are used for Fire Alarm systems. Just a little fun side project I did for my father.

Basically this program calculates it this through wire types in order to calculate Voltage Drop.


Change log for Voltage Drop Calculation Program


2015

0.1 Initial version of the program where you had to type in the AWG manually yourself.

The AWG list that supported were 10, 12, 14, 16, and 18 at the time.
Introduced a loop based system that can restart the program if you need to do another calculation.

0.1.1

Fixed infinite loop bug where even the compiler wasn't reading the program.
Removed loop to restart the program if necessary.

0.2

Changed program to a 64 bit system in case there are large numbers being shown to the user.
Adjusted the list of AWG supported to now 12, 14, 16, 18, 22, and 24.

0.2.1

Some grammar fixes and adjustments in wording.

New version: Enter the amount of current needed (in Amps)
Old version: Enter the amount of current needed

0.2.2

Added some branding labels like on the top it says Voltage Drop Calculation

0.3

Added calculation if you need to redesign your circuit with appropiate dialog box.

0.4

Add new improved restart system where the program will ask "Would you like to do another calculation?"
This way prevents an infinite loop and is much more friendly than the previous system with the option of exiting out of the program.

2016

0.5
Created a function to reduce the decimal count so it looks more professonal

Old: 2.526621321
New: 2.52

0.6
Changed up some the GUI designs to more friendly based system with a drop down menu instead of manually typing in the AWG.

2018

Made some object oriented programming adjustments so the program is cleaner now.
