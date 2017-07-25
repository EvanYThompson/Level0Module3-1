package variables_and_conditionals;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.xml.bind.ParseConversionEvent;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
				 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
String dizzy=JOptionPane.showInputDialog("How dizy do you want the tortoise to be from 1-10?");
 // 1. Use the dance method to make the Tortoise spin.
	int number = Integer.parseInt(dizzy);
	dance(number);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
