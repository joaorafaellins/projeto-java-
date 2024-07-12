// Fig. 12.21: ComboBoxFrame.java
// JComboBox that displays a list of image names.
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame 
{
   private final JComboBox<String>JComboBox; // hold icon names
   private final JLabel label; // displays selected icon

   private static final String[] names = 
      {"gustavo", "gabriel",  "lucas", "mateus","daniel","julio","angelo","enrique","germano","farias","douglas","rafael","felipe"};

      
   // ComboBoxFrame constructor adds JComboBox to JFrame
   public ComboBoxFrame()
   {
      super("Testing JComboBox");
      setLayout(new FlowLayout()); // set frame layout     

      JComboBox = new JComboBox<String>(names); // set up JComboBox
      JComboBox.setMaximumRowCount(13); // display three rows

      add(JComboBox); // add combobox to JFrame
      label = new JLabel(names[0]); // display first icon
      add(label); // add label to JFrame
      JComboBox.addItemListener(event -> { 
           if (event.getStateChange() == ItemEvent.SELECTED)
              label.setText (names[JComboBox.getSelectedIndex()]);
           }); // end call to addItemListener
   } // end ComboBoxFrame constructor
} // end class ComboBoxFrame


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
