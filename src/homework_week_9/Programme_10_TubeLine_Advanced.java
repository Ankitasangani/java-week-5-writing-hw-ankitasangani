package homework_week_9;

import javax.swing.*;

public class Programme_10_TubeLine_Advanced {
    public static void main(String[] args) {
        // All stations in zone 1
        String station[] = ("Aldgate,Angle,Baker Street,Bank,Barbican,bayswater,blackfriars,bond street," +
                "Borough,cannon street,chancery lane,charing cross,covent garden,earl's court," +
                "Edgware road,elephant & castle,embankment,euston,euston square," +
                "Farringdon,gloucester road,Goodgs street,Great portland street,green park").split(",");
        // Multidimensional  array of TubeLines and station
        String[][] allLines = new String[12][30];

        allLines[0][0] = "Bakerloo Line";
        allLines[0][1] = "Baker Street";
        allLines[0][2] = "Charing Cross";
        allLines[0][3] = "Edgware Road";
        allLines[0][4] = "Elephant & Castle";
        allLines[0][5] = "Embankment";

        allLines[1][0] = "Circle Line";
        allLines[1][1] = "Aldgate";
        allLines[1][2] = "Baker Street";
        allLines[1][3] = "Barbican";
        allLines[1][4] = "Bayswater";
        allLines[1][5] = "Blackfriars";
        allLines[1][6] = "Cannon Street";
        allLines[1][7] = "Edgware Road";
        allLines[1][8] = "Embankment";
        allLines[1][9] = "Euston Square";
        allLines[1][10] = "Farringdon";
        allLines[1][11] = "Gloucester Road";

        allLines[2][0] = "District Line";
        allLines[2][1] = "Bayswater";
        allLines[2][2] = "Blackfriars";
        allLines[2][3] = "Cannon Street";
        allLines[2][4] = "Earl's Court";
        allLines[2][5] = "Edgware Road";
        allLines[2][6] = "Embankment";
        allLines[2][7] = "Gloucester Road";

        allLines[3][0] = "Hammersmith & City Line";
        allLines[3][1] = "Baker Street";
        allLines[3][2] = "Barbican";
        allLines[3][3] = "Edgware Road";
        allLines[3][4] = "Euston Square";
        allLines[3][5] = "Farringdon";
        allLines[3][6] = "Great Portland Street";

        allLines[4][0] = "Jubilee Line";
        allLines[4][1] = "Baker Street";
        allLines[4][2] = "Bond Street";
        allLines[4][3] = "Green Park";

        allLines[5][0] = "Metropolitan Line";
        allLines[5][1] = "Aldgate";
        allLines[5][2] = "Baker Street";
        allLines[5][3] = "Barbican";
        allLines[5][4] = "Euston Square";
        allLines[5][5] = "Farringdon";
        allLines[5][6] = "Great Portland Street";

        allLines[6][0] = "Northern Line";
        allLines[6][1] = "Angle";
        allLines[6][2] = "Bank";
        allLines[6][3] = "Borough";
        allLines[6][4] = "Charing Cross";
        allLines[6][5] = "Elephant & Castle";
        allLines[6][6] = "Embankment";
        allLines[6][7] = "Euston";
        allLines[6][8] = "Goodgs Street";

        allLines[7][0] = "Piccadilly Line";
        allLines[7][1] = "Covent Garden";
        allLines[7][2] = "Earl's Court";
        allLines[7][3] = "Gloucester Road";
        allLines[7][4] = "Green Park";

        allLines[8][0] = "Victoria Line";
        allLines[8][1] = "Euston";
        allLines[8][2] = "Green Park";

        allLines[9][0] = "Central Line";
        allLines[9][1] = "Bank";
        allLines[9][2] = "Bond Street";
        allLines[9][3] = "Chancery Lane";

        allLines[10][0] = "Waterloo & City Line";
        allLines[10][1] = "Bank";

        String b;
        // Using do while loop for another try from user to input correct station
        do {
            //JFrame and JOptionPane is used for display Dialog and take input from user
            JFrame frame = new JFrame("JavaPractice.InputDialog");
            String str = JOptionPane.showInputDialog(frame, "Enter station Name Between A to G ?", "Station Name", JOptionPane.WARNING_MESSAGE);
            String c = "";
            //for loop use for stations name in zone 1
            for (int i = 0; i < station.length; i++) {
                if (str.equalsIgnoreCase(station[i])) {
                    c = station[i];
                }
            }
            if (str.equalsIgnoreCase(c)) {
                System.out.println("  " + str + " station is in Zone 1 ");
                System.out.println("The lines passing through at " + str + " Station are :");
                System.out.println("-----------------------------------------------------");
                //Two for loop used for multidimensional array
                for (int k = 0; k < allLines.length; k++) {
                    for (int j = 1; j < allLines.length; j++) {
                        String a = allLines[k][j];
                        if (str.equalsIgnoreCase(a)) {
                            System.out.println(allLines[k][0]);
                        }
                    }
                }
            } else {
                System.out.println(str + " station is not in zone 1 or your station name is wrong");
            }
            b = JOptionPane.showInputDialog(frame, "Do you want to try again then please press Y", "Press Y Or N", JOptionPane.WARNING_MESSAGE).toLowerCase();
        } while (b.equals("y"));
        System.exit(0);
    }
}
