import javax.swing.JOptionPane;
    public class CalTwoNumbers {
        public static void main(String[] args) {
            String strNum1, strNum2;
           // String strNotification = "You've just entered: ";
            strNum1 = JOptionPane.showInputDialog(null,
                    "Please input the first number: ", "Input the first number",
                    JOptionPane.INFORMATION_MESSAGE);
         //   strNotification += strNum1 + " and ";
            double num1 = Double.parseDouble(strNum1);
            strNum2 = JOptionPane.showInputDialog(null,
                    "Please input the second number: ", "Input the second number",
                    JOptionPane.INFORMATION_MESSAGE);
          //  strNotification += strNum2;
            double num2 = Double.parseDouble(strNum2);
            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            JOptionPane.showMessageDialog(null, sum,
                    "Sum of 2 numbers", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, difference,
                    "Difference of 2 numbers", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, product,
                    "Product of 2 numbers", JOptionPane.INFORMATION_MESSAGE);
            if (num2 == 0) {
                String strNotification = "Invalid divisor. Divisor can not be 0!";
                JOptionPane.showMessageDialog(null, strNotification,
                    "Warning", JOptionPane.INFORMATION_MESSAGE);
            } else {
                double quotient = num1 / num2;
                JOptionPane.showMessageDialog(null, quotient,
                    "Quotient of 2 numbers", JOptionPane.INFORMATION_MESSAGE);
            }
            System.exit(0);
        }
}
