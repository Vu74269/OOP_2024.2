import javax.swing.JOptionPane;
public class DayNumber {
    public static void main(String[] args) {
    	boolean TrueMonth = true, TrueYear = true;
        String Month, Year;
        int NumYear;
        do {
        	TrueYear = true;
	        Year = JOptionPane.showInputDialog(null,
	                "Input year", "Enter a year (non-negative number and all the digits)",
	                JOptionPane.INFORMATION_MESSAGE);
	        NumYear = Integer.parseInt(Year);
	        if (NumYear < 0) {
                JOptionPane.showMessageDialog(null, "Invalid Year",
                "Warning!", JOptionPane.INFORMATION_MESSAGE);
                TrueYear = false;
	        }
        } while (!TrueYear);
        boolean LeapYear = (NumYear % 4 == 0 && NumYear % 100 != 0) || (NumYear % 400 == 0);
        do {
        	TrueMonth = true;
	        Month = JOptionPane.showInputDialog(null,
	                "Input month", "Enter a month (full name, abbreviation, 3 letters, or number)",
	                JOptionPane.INFORMATION_MESSAGE);
	        switch (Month) {
	            case "January":
	            case "Jan.":
	            case "Jan":
	            case "1":
	                JOptionPane.showMessageDialog(null, "31",
	                "Number of days: ", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            case "February":
	            case "Feb.":
	            case "Feb":
	            case "2":
	            	if (LeapYear) {
	                    JOptionPane.showMessageDialog(null, "29",
	                    "Number of days: ", JOptionPane.INFORMATION_MESSAGE);	
	            	} else {
	            		JOptionPane.showMessageDialog(null, "28",
	                    "Number of days: ", JOptionPane.INFORMATION_MESSAGE);	
	            	}
	            	break;
	            case "March":
	            case "Mar.":
	            case "Mar":
	            case "3":
	                JOptionPane.showMessageDialog(null, "31",
	                "Number of days: ", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            case "April":
	            case "Apr.":
	            case "Apr":
	            case "4":
	                JOptionPane.showMessageDialog(null, "30",
	                "Number of days: ", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            case "May":
	            case "5":
	                JOptionPane.showMessageDialog(null, "31",
	                "Number of days: ", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            case "June":
	            case "Jun":
	            case "6":
	                JOptionPane.showMessageDialog(null, "30",
	                "Number of days: ", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            case "July":
	            case "Jul":
	            case "7":
	                JOptionPane.showMessageDialog(null, "31",
	                "Number of days: ", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            case "August":
	            case "Aug.":
	            case "Aug":
	            case "8":
	                JOptionPane.showMessageDialog(null, "31",
	                "Number of days: ", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            case "September":
	            case "Sep.":
	            case "Sep":
	            case "9":
	                JOptionPane.showMessageDialog(null, "30",
	                "Number of days: ", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            case "October":
	            case "Oct.":
	            case "Oct":
	            case "10":
	                JOptionPane.showMessageDialog(null, "31",
	                "Number of days: ", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            case "November":
	            case "Nov.":
	            case "Nov":
	            case "11":
	                JOptionPane.showMessageDialog(null, "30",
	                "Number of days: ", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            case "December":
	            case "Dec.":
	            case "Dec":
	            case "12":
	                JOptionPane.showMessageDialog(null, "31",
	                "Number of days: ", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Invalid Month",
	                "Warning!", JOptionPane.INFORMATION_MESSAGE);
	                TrueMonth = false;
	        }
        } while (!TrueMonth);
        System.exit(0);
    }
}
