package maximization;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;

public class FXMLController implements Initializable {

    @FXML
    Button solve;

    @FXML
    TextArea ta;

    @FXML
    TextField z1;
    @FXML
    TextField z2;
    @FXML
    TextField z3;
    @FXML
    TextField x1;
    @FXML
    TextField x2;
    @FXML
    TextField x3;
    @FXML
    TextField y1;
    @FXML
    TextField y2;
    @FXML
    TextField y3;
    @FXML
    TextField u1;
    @FXML
    TextField u2;
    @FXML
    TextField u3;
    @FXML
    TextField sol1;
    @FXML
    TextField sol2;
    @FXML
    TextField sol3;

    @FXML
    Label zz;

    @FXML
    Label xx1;

    @FXML
    Label xx2;

    @FXML
    Label xx3;

    public static void gap(int a, int b) {

        for (int k = b; k <= a; k++) {
            System.out.print(" ");
        }

    }

    public static void gapt(int a, int b, TextArea ta) {

        for (int k = b; k <= a; k++) {

            ta.appendText(" ");

        }
    }

    @FXML
    public void pressz1(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            z2.requestFocus();

        }

    }

    @FXML
    public void pressz2(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            z3.requestFocus();

        }

    }

    @FXML
    public void pressz3(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            x1.requestFocus();

        }

    }

    @FXML
    public void pressx11(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            x2.requestFocus();

        }

    }

    @FXML
    public void pressx21(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            x3.requestFocus();

        }

    }

    @FXML
    public void pressx31(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            sol1.requestFocus();

        }

    }

    @FXML
    public void pressx12(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            y2.requestFocus();

        }

    }

    @FXML
    public void pressx22(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            y3.requestFocus();

        }

    }

    @FXML
    public void pressx32(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            sol2.requestFocus();

        }

    }

    @FXML
    public void pressx13(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            u2.requestFocus();

        }

    }

    @FXML
    public void pressx23(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            u3.requestFocus();

        }

    }

    @FXML
    public void pressx33(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            sol3.requestFocus();

        }

    }

    @FXML
    public void sol3(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            solve.fire();

        }

    }

    @FXML
    public void sol2(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            u1.requestFocus();

        }

    }

    @FXML
    public void sol1(KeyEvent e) {

        if (e.getCode().equals(KeyCode.ENTER)) {

            y1.requestFocus();

        }

    }

    @FXML
    public void solveIt() {

        ta.setText("");
        String[][] t = new String[5][8];

        t[0][0] = "  ";
        t[0][1] = "X1";
        t[0][2] = "X2";
        t[0][3] = "X3";
        t[0][4] = "S1";
        t[0][5] = "S2";
        t[0][6] = "S3";
        t[0][7] = "SOL";
        t[1][0] = "Z";
        t[2][0] = "S1";
        t[3][0] = "S2";
        t[4][0] = "S3";
        t[1][1] = "-" + z1.getText();
        t[1][2] = "-" + z2.getText();
        t[1][3] = "-" + z3.getText();
        t[1][4] = "0";
        t[1][5] = "0";
        t[1][6] = "0";
        t[1][7] = "0";
        t[2][1] = x1.getText();
        t[2][2] = x2.getText();
        t[2][3] = x3.getText();
        t[2][4] = "1";
        t[2][5] = "0";
        t[2][6] = "0";
        t[2][7] = sol1.getText();
        t[3][1] = y1.getText();
        t[3][2] = y2.getText();
        t[3][3] = y3.getText();
        t[3][4] = "0";
        t[3][5] = "1";
        t[3][6] = "0";
        t[3][7] = sol2.getText();
        t[4][1] = u1.getText();
        t[4][2] = u2.getText();
        t[4][3] = u3.getText();
        t[4][4] = "0";
        t[4][5] = "0";
        t[4][6] = "1";
        t[4][7] = sol3.getText();

        ta.appendText("\n Note : Ignore 'S3' and 'X3'  if you deals just with \btwo \bvaribles\n");

        for (String[] t1 : t) {

            System.out.println();
            System.out.println("___________________________________________________________");
            ta.appendText("\n");
            ta.appendText("______________________________________________________________________________________\n");

            for (String t11 : t1) {

                System.out.print(t11);

                int a = t11.length();
                gap(7, a);
                ta.appendText(t11 + "\t");
                gapt(8, a, ta);
            }

        }

        ta.appendText("\n");
        System.out.println();
        System.out.println("____________________________________________________________");
        ta.appendText("\n______________________________________________________________________________________\n");

        while (true) {

            try {

                double biggestMins = 0.0;
                int col = 0;

                for (int i = 1; i < 7; i++) {

                    if (Double.parseDouble(t[1][i]) < biggestMins) {
                        biggestMins = Double.parseDouble(t[1][i]);
                        col = i;
                    }
                }

                if (biggestMins >= 0.0) {
                    break;
                }

                System.out.println();
                System.out.println("biggestMins : " + biggestMins);
                ta.appendText("\n");
                ta.appendText("biggestMins : " + biggestMins);

                double r1 = Double.MAX_VALUE, r2 = Double.MAX_VALUE, r3 = Double.MAX_VALUE;

                if (Double.parseDouble(t[2][col]) != 0.0 && Double.parseDouble(t[2][col]) != 0) {

                    r1 = Double.parseDouble(t[2][7]) / Double.parseDouble(t[2][col]);
                }

                if (Double.parseDouble(t[3][col]) != 0.0 && Double.parseDouble(t[3][col]) != 0) {
                    r2 = Double.parseDouble(t[3][7]) / Double.parseDouble(t[3][col]);
                }

                if (Double.parseDouble(t[4][col]) != 0.0 && Double.parseDouble(t[4][col]) != 0) {
                    r3 = Double.parseDouble(t[4][7]) / Double.parseDouble(t[4][col]);
                }

                int row;
                double res;

                double r = Math.min(r1, Math.min(r2, r3));

                if (r == r1) {
                    System.out.println("Key element : " + Double.parseDouble(t[2][col]) + " : in postion[" + (3) + " , " + (col + 1) + "]");
                    ta.appendText("\nKey element : " + Double.parseDouble(t[2][col]) + " : in postion[" + (3) + " , " + (col + 1) + "]");
                    row = 2;
                    res = Double.parseDouble(t[2][col]);
                    t[2][0] = t[0][col];
                } else if (r == r2) {
                    System.out.println("Key element : " + Double.parseDouble(t[3][col]) + " : in postion[" + (4) + " , " + (col + 1) + "]");
                    ta.appendText("\nKey element : " + Double.parseDouble(t[3][col]) + " : in postion[" + (4) + " , " + (col + 1) + "]");
                    row = 3;
                    res = Double.parseDouble(t[3][col]);
                    t[3][0] = t[0][col];

                } else {
                    System.out.println("Key element : " + Double.parseDouble(t[4][col]) + " : in postion[" + (5) + " , " + (col + 1) + "]");
                    ta.appendText("\nKey element : " + Double.parseDouble(t[4][col]) + " : in postion[" + (5) + " , " + (col + 1) + "]");
                    row = 4;
                    res = Double.parseDouble(t[4][col]);
                    t[4][0] = t[0][col];

                }

                for (int i = 1; i < 8; i++) {

                    t[row][i] = String.valueOf(Double.parseDouble(t[row][i]) / res);

                }
                for (String[] t1 : t) {

                    System.out.println();
                    System.out.println("___________________________________________________________");
                    ta.appendText("\n___________________________________________________________________________________________\n");

                    for (String t11 : t1) {

                        int a = t11.length();
                        System.out.print(t11);
                        gap(7, a);
                        ta.appendText(t11 + "\t");
                        gapt(8, a, ta);

                    }

                }

                System.out.println();
                System.out.println("___________________________________________________________");
                ta.appendText("\n___________________________________________________________________________________________\n");

                double oper = 0.0;

                double key = 0.0;

                for (int i = 1; i <= 4; i++) {

                    key = Double.parseDouble(t[row][col]);
                    double pos = Double.parseDouble(t[i][col]);

                    if (i == row || pos == 0) {
                        continue;
                    } else {

                        //  pos - oper*key = 0  pos = oper*key  oper = pos/key
                        oper = pos / key;

                        for (int j = 1; j < 8; j++) {

                            key = Double.parseDouble(t[row][j]);

                            t[i][j] = String.valueOf(Double.parseDouble(t[i][j]) - oper * key);

                        }

                        System.out.println("row" + (i + 1) + " - " + oper + " row" + (row + 1));
                        ta.appendText("\nrow" + (i + 1) + " - " + oper + " row" + (row + 1));

                    }
                }

                for (String[] t1 : t) {

                    System.out.println();
                    System.out.println("\n___________________________________________________________");
                    ta.appendText("\n___________________________________________________________________________________________\n");

                    for (String t11 : t1) {

                        int a = t11.length();
                        System.out.print(t11);
                        gap(7, a);
                        ta.appendText(t11 + "\t");
                        gapt(8, a, ta);

                    }

                }

                System.out.println();
                System.out.println("___________________________________________________________");
                ta.appendText("\n___________________________________________________________________________________________\n");
                System.out.println();

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }

        System.out.println("Maximize 'Z' = " + t[1][7]);
        System.out.println("Maximize " + t[2][0] + " = " + t[2][7]);
        System.out.println("Maximize " + t[3][0] + " = " + t[3][7]);

        if (!z3.getText().equals("0")) {
            System.out.println("Maximize " + t[4][0] + " = " + t[4][7]);
        }

        zz.setText("Maximize 'Z' = " + t[1][7]);
        xx1.setText("Maximize " + t[2][0] + " = " + t[2][7]);
        xx2.setText("Maximize " + t[3][0] + " = " + t[3][7]);

        if (!z3.getText().equals("0")) {
            xx3.setText("Maximize " + t[4][0] + " = " + t[4][7]);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
