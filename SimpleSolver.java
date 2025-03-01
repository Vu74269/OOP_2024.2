import javax.swing.JOptionPane;
public class SimpleSolver {
    public static void main(String[] args) {
        String mode;
        do {
            mode = JOptionPane.showInputDialog(null,
                    "1: First-degree equation (linear equation) with one variable \n2: System of first-degree equations (linear system) with two variables \n3: Second-degree equation with one variable", "Choose mode for the solver",
                    JOptionPane.INFORMATION_MESSAGE);
            if (mode.equals("1")) {
                String a, b;
                a = JOptionPane.showInputDialog(null,
                        "Input a: ", "Format ax + b = 0",
                        JOptionPane.INFORMATION_MESSAGE);
                double numa = Double.parseDouble(a);
                b = JOptionPane.showInputDialog(null,
                        "Input b: ", "Format ax + b = 0",
                        JOptionPane.INFORMATION_MESSAGE);
                double numb = Double.parseDouble(b);
                if (numa == 0) {
                    if (numb == 0) {
                        JOptionPane.showMessageDialog(null, "Infinitely many solutions",
                        "Solution: ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No solution",
                        "Solution: ", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    double x = -numb / numa;
                    JOptionPane.showMessageDialog(null, x,
                    "Solution: ", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (mode.equals("2")) {
                String a11, a12, a21, a22, b1, b2;
                a11 = JOptionPane.showInputDialog(null,
                        "Input a11: ", "Format a11x1 + a12x2 = b1a21x1 + a22x2 = b2",
                        JOptionPane.INFORMATION_MESSAGE);
                double numa11 = Double.parseDouble(a11);
                a12 = JOptionPane.showInputDialog(null,
                        "Input a12: ", "Format a11x1 + a12x2 = b1a21x1 + a22x2 = b2",
                        JOptionPane.INFORMATION_MESSAGE);
                double numa12 = Double.parseDouble(a12);
                a21 = JOptionPane.showInputDialog(null,
                        "Input a21: ", "Format a11x1 + a12x2 = b1a21x1 + a22x2 = b2",
                        JOptionPane.INFORMATION_MESSAGE);
                double numa21 = Double.parseDouble(a21);
                a22 = JOptionPane.showInputDialog(null,
                        "Input a22: ", "Format a11x1 + a12x2 = b1a21x1 + a22x2 = b2",
                        JOptionPane.INFORMATION_MESSAGE);
                double numa22 = Double.parseDouble(a22);
                b1 = JOptionPane.showInputDialog(null,
                        "Input b1: ", "Format a11x1 + a12x2 = b1a21x1 + a22x2 = b2",
                        JOptionPane.INFORMATION_MESSAGE);
                double numb1 = Double.parseDouble(b1);
                b2 = JOptionPane.showInputDialog(null,
                        "Input b2: ", "Format a11x1 + a12x2 = b1a21x1 + a22x2 = b2",
                        JOptionPane.INFORMATION_MESSAGE);
                double numb2 = Double.parseDouble(b2);
                double D = numa11 * numa22 - numa21 * numa12;
                double D1 = numb1 * numa22 - numb2 * numa12;
                double D2 = numa11 * numb2 - numa21 * numb1;
                if (D == 0) {
                    if (D1 == 0 && D2 == 0) {
                        JOptionPane.showMessageDialog(null, "Infinitely many solutions",
                        "Solution: ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No solution",
                        "Solution: ", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    double x1 = D1 / D;
                    double x2 = D2 / D;
                    String out = "x1 = " + String.valueOf(x1) + "\nx2 = " + String.valueOf(x2);
                    JOptionPane.showMessageDialog(null, out,
                    "Solution: ", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (mode.equals("3")) {
                String a,b,c;
                a = JOptionPane.showInputDialog(null,
                        "Input a: ", "Format ax^2 + bx + c = 0",
                        JOptionPane.INFORMATION_MESSAGE);
                double numa = Double.parseDouble(a);
                b = JOptionPane.showInputDialog(null,
                        "Input b: ", "Format ax^2 + bx + c = 0",
                        JOptionPane.INFORMATION_MESSAGE);
                double numb = Double.parseDouble(b);
                c = JOptionPane.showInputDialog(null,
                        "Input c: ", "Format ax^2 + bx + c = 0",
                        JOptionPane.INFORMATION_MESSAGE);
                double numc = Double.parseDouble(c);
                if (numa == 0) {
                    if (numb == 0) {
                        if (numc == 0) {
                            JOptionPane.showMessageDialog(null, "Infinitely many solutions",
                            "Solution: ", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No solution",
                            "Solution: ", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        double x = -numc / numb;
                        JOptionPane.showMessageDialog(null, x,
                        "Solution: ", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    double delta = numb * numb - 4 * numa * numc;
                    if (delta > 0) {
                        double x1 = (-numb + Math.sqrt(delta)) / (2 * numa);
                        double x2 = (-numb - Math.sqrt(delta)) / (2 * numa);
                        String out = "x1 = " + String.valueOf(x1) + "\nx2 = " + String.valueOf(x2);
                        JOptionPane.showMessageDialog(null, out,
                        "2 solution: ", JOptionPane.INFORMATION_MESSAGE);
                    } else if (delta == 0) {
                        double x = -numb / (2 * numa);
                        JOptionPane.showMessageDialog(null, x,
                        "1 solution: ", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No solution",
                        "Solution: ", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid mode",
                "Warning!", JOptionPane.INFORMATION_MESSAGE);
            }
        } while (!mode.equals("1") && !mode.equals("2") && !mode.equals("3"));
        System.exit(0);
    }
}
