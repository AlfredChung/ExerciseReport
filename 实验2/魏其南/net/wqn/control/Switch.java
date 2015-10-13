package net.wqn.control;

import java.util.ArrayList;

import net.wqn.control.service.ReadWrite;
import net.wqn.domian.Employee;
import net.wqn.tools.Comparable;
import net.wqn.tools.In;
import net.wqn.tools.Out;

public class Switch {
	public static void chooseMenu(ArrayList<Employee> e){ //粕等
		String input=null;
		while(true){
			Out.printLn("Adfaith Consulting - Employee Information - Main Menu\n=====================================================\n\n1 - Print All Current Records\n2 每 Print All Current Records (formatted)\n3 每 Print Names and Phone Numbers\n4 每 Print Names and Phone Numbers (formatted)\n5 - Search for specific Record(s)\n6 - Add New Records\n7 每 Delete Records\nQ - Quit\n\nYour Selection:");
			input=In.scan();
			if(input.length()>0){
			switch (input.charAt(0)) {
			case '1':
				Show.printAll(e);
				break;
			case '2' :
				Show.printAll_Formatted(e);
				break;
			case '3':
				Show.printNameAndPhoneNum(e);
				break;
			case '4':
				Show.printNameAndPhoneNum_formatted(e);
				break;
			case '5':
				Search.search(e);
				break;
			case '6':
				AddAndDelect.add(e);
				break;
			case '7':
				AddAndDelect.delect(e);
				break;
			case 'q':
			case 'Q':
				ReadWrite.Write(e);
				System.exit(0);
				break;
			default:
				Out.printLn("Invalid code! Press Enter to continue＃");
				In.waitEnterkey();
				break;
			}
			}else{
				Out.printLn("No selection entered. Press Enter to continue＃");
				In.waitEnterkey();
			}
		}
	}
	
	

}
