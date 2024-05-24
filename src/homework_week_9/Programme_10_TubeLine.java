package homework_week_9;

import java.util.Scanner;

/**
 * Write the programme that tell you which line pass through particular stations. Just use Zone 1 stations name
 */

public class Programme_10_TubeLine {
    public static void main(String[] args) {

        //List of all station in Zone 1 of London
        String[] tubeStationZone1 = new String[]{"Aldgate", "Aldgate East", "Angel", "Baker Street", "Bank", "Barbican", "Bayswater", "Blackfriars",
                "Bond Street", "Borough", "Cannon Street", "Chancery Lane", "Charing Cross", "Covent Garden", "Earl's Court",
                "Edgware Road", "Elephant & Castle", "Embankment", "Euston", "Euston Square", "Farringdon", "Gloucester Road",
                "Goodge Street", "Great Portland Street", "Green Park", "High Street Kensington", "Holborn", "Hyde Park Corner", "King's Cross",
                "Knightsbridge", "Lambeth North", "Lancaster Gate", "Leicester Square", "Liverpool Street", "London Bridge", "Mansion House",
                "Marble Arch", "Marylebone", "Monument", "Moorgate", "Notting Hill Gate", "Old Street", "Oxford Circus", "Paddington",
                "Piccadilly Circus", "Pimlico", "Queensway", "Regent's Park", "Russell Square", "Sloane Square",
                "South Kensington", "St Pancras", "St. Paul's", "Temple", "Tottenham Court Road", "Tower Gateway",
                "Tower Hill", "Vauxhall", "Victoria", "Warren Street", "Waterloo East", "Waterloo", "Westminster"};

        //System.out.println(tubeStationZone1.length); //for debug purpose
        int length = tubeStationZone1.length;

        String[][] londonUGLines = new String[12][length];
        londonUGLines[0][0] = "Bakerloo Line"; //Line name
        londonUGLines[0][1] = "Baker Street"; // Station Name
        londonUGLines[0][2] = "Charing Cross";
        londonUGLines[0][3] = "Edgware Road";
        londonUGLines[0][4] = "Elephant & Castle";
        londonUGLines[0][5] = "Embankment";
        londonUGLines[0][6] = "Lambeth North";
        londonUGLines[0][7] = "Marylebone";
        londonUGLines[0][8] = "Oxford Circus";
        londonUGLines[0][9] = "Regent's Park";
        londonUGLines[0][10] = "Waterloo";

        londonUGLines[1][0] = "Central Line";
        londonUGLines[1][1] = "Aldgate";
        londonUGLines[1][2] = "Baker Street";
        londonUGLines[1][3] = "Barbican";
        londonUGLines[1][4] = "Bayswater";
        londonUGLines[1][5] = "Bank";
        londonUGLines[1][6] = "Bond Street";
        londonUGLines[1][7] = "Chancery Lane";
        londonUGLines[1][8] = "Holborn";
        londonUGLines[1][9] = "Lancaster Gate";
        londonUGLines[1][10] = "Liverpool Street";
        londonUGLines[1][11] = "Marble Arch";
        londonUGLines[1][12] = "Notting Hill Gate";
        londonUGLines[1][13] = "Oxford Circus";
        londonUGLines[1][14] = "Queensway";
        londonUGLines[1][15] = "St. Paul's";
        londonUGLines[1][16] = "Tottenham Court Road";

        londonUGLines[2][0] = "Circle Line";
        londonUGLines[2][1] = "Edgware Road";
        londonUGLines[2][2] = "Baker Street";
        londonUGLines[2][3] = "Farringdon";
        londonUGLines[2][4] = "Barbican";
        londonUGLines[2][5] = "Aldgata";
        londonUGLines[2][6] = "Blackfriars";
        londonUGLines[2][7] = "Bayswater";
        londonUGLines[2][8] = "Cannon Street";
        londonUGLines[2][9] = "Embankment";
        londonUGLines[2][10] = "Euston Square";
        londonUGLines[2][11] = "Gloucester Road";
        londonUGLines[2][12] = "Great Portland Street";
        londonUGLines[2][13] = "High Street Kensington";
        londonUGLines[2][14] = "King's Cross";
        londonUGLines[2][15] = "Liverpool Street";
        londonUGLines[2][16] = "Mansion House";
        londonUGLines[2][17] = "Monument";
        londonUGLines[2][18] = "Notting Hill Gate";
        londonUGLines[2][19] = "Sloane Square";
        londonUGLines[2][20] = "South Kensington";
        londonUGLines[2][21] = "St Pancras";
        londonUGLines[2][22] = "Temple";
        londonUGLines[2][23] = "Tower Hill";
        londonUGLines[2][24] = "Victoria";
        londonUGLines[2][25] = "Westminster";

        londonUGLines[3][0] = "District Line";
        londonUGLines[3][1] = "Edgware Road";
        londonUGLines[3][2] = "Paddington";
        londonUGLines[3][3] = "Bayswater";
        londonUGLines[3][4] = "Aldgate East";
        londonUGLines[3][5] = "Blackfriars";
        londonUGLines[3][6] = "Cannon Street";
        londonUGLines[3][7] = "Earl's Court";
        londonUGLines[3][8] = "Embankment";
        londonUGLines[3][9] = "Gloucester Road";
        londonUGLines[3][10] = "High Street Kensington";
        londonUGLines[3][11] = "Mansion House";
        londonUGLines[3][12] = "Monument";
        londonUGLines[3][13] = "Notting Hill Gate";
        londonUGLines[3][14] = "Sloane Square";
        londonUGLines[3][15] = "South Kensington";
        londonUGLines[3][16] = "Temple";
        londonUGLines[3][17] = "Tower Hill";
        londonUGLines[3][18] = "Victoria";
        londonUGLines[3][19] = "Westminster";

        londonUGLines[4][0] = "Hammersmith Line";
        londonUGLines[4][1] = "Aldgate East";
        londonUGLines[4][2] = "Liverpool Street";
        londonUGLines[4][3] = "King's Cross";
        londonUGLines[4][4] = "Barbican";
        londonUGLines[4][5] = "Edgware Road";
        londonUGLines[4][6] = "Euston Square";
        londonUGLines[4][7] = "Farringdon";
        londonUGLines[4][8] = "Great Portland Street";
        londonUGLines[4][9] = "St Pancras";

        londonUGLines[5][0] = "Jubilee Line";
        londonUGLines[5][1] = "Baker Street";
        londonUGLines[5][2] = "Bond Street";
        londonUGLines[5][3] = "Westminster";
        londonUGLines[5][4] = "Waterloo";
        londonUGLines[5][5] = "Green Park";
        londonUGLines[5][6] = "London Bridge";

        londonUGLines[6][0] = "Metropolitan Line";
        londonUGLines[6][1] = "Aldgate";
        londonUGLines[6][2] = "Liverpool Street";
        londonUGLines[6][3] = "Moorgate";
        londonUGLines[6][4] = "Barbican";
        londonUGLines[6][5] = "Baker Street";
        londonUGLines[6][6] = "Euston Square";
        londonUGLines[6][7] = "Farringdon";
        londonUGLines[6][8] = "Great Portland Street";
        londonUGLines[6][9] = "King's Cross";
        londonUGLines[6][10] = "St Pancras";

        londonUGLines[7][0] = "Northern Line";
        londonUGLines[7][1] = "Borough";
        londonUGLines[7][2] = "London Bridge";
        londonUGLines[7][3] = "Moorgate";
        londonUGLines[7][4] = "Old Street";
        londonUGLines[7][5] = "Angel";
        londonUGLines[7][6] = "Bank";
        londonUGLines[7][7] = "Elephant & Castle";
        londonUGLines[7][8] = "Embankment";
        londonUGLines[7][9] = "Euston";
        londonUGLines[7][10] = "Goodge Street";
        londonUGLines[7][11] = "King's Cross";
        londonUGLines[7][12] = "Leicester Square";
        londonUGLines[7][13] = "St Pancras";
        londonUGLines[7][14] = "Warren Street";
        londonUGLines[7][15] = "Waterloo";

        londonUGLines[8][0] = "Piccadilly Line";
        londonUGLines[8][1] = "Green Park";
        londonUGLines[8][2] = "Picaadilly Circus";
        londonUGLines[8][3] = "Leicester Square";
        londonUGLines[8][4] = "Covent Garden";
        londonUGLines[8][5] = "Earl's Court";
        londonUGLines[8][6] = "Gloucester Road";
        londonUGLines[8][7] = "Hyde Park Corner";
        londonUGLines[8][8] = "King's Cross";
        londonUGLines[8][9] = "Knightsbridge";
        londonUGLines[8][10] = "Russell Square";
        londonUGLines[8][11] = "South Kensington";
        londonUGLines[8][12] = "St Pancras";

        londonUGLines[9][0] = "Victoria Line";
        londonUGLines[9][1] = "Euston";
        londonUGLines[9][2] = "Warren Street";
        londonUGLines[9][3] = "Oxford Circus";
        londonUGLines[9][4] = "Green Park";
        londonUGLines[9][5] = "King's Cross";
        londonUGLines[9][6] = "Pimlico";
        londonUGLines[9][7] = "St Pancras";
        londonUGLines[9][8] = "Vauxhall";
        londonUGLines[9][9] = "Victoria";

        londonUGLines[10][0] = "Waterloo & City Line";
        londonUGLines[10][1] = "Bank";
        londonUGLines[10][2] = "Waterloo";
        londonUGLines[10][3] = "Barbican";
        londonUGLines[10][4] = "Bayswater";

        londonUGLines[11][0] = "DLR Line";
        londonUGLines[11][1] = "Bank";
        londonUGLines[11][2] = "Tower Gateway";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the tube station's name of Zone 1 :");
        // Input wizard for the user, and store his/her input as a variable
        String userTubeStation = scan.nextLine();
        String catchStationName = "";

        //Checking, if user input is present in the list of Zone 1 stations
        for (int i = 0; i < tubeStationZone1.length; i++) {
            if (userTubeStation.equalsIgnoreCase(tubeStationZone1[i])) {
                catchStationName = tubeStationZone1[i];
            }
        }

        // Logic to find the Line names from the given input from the user
        if (userTubeStation.equalsIgnoreCase(catchStationName)) {
            System.out.println(userTubeStation + " Station is in the Zone 1.");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Following Line(s) passing through the Given Tube Station : " + userTubeStation);
            System.out.println("--------------------------------------------------------------------------");

            //System.out.println(londonUGLines.length); //for debug purpose
            for (int x = 0; x < londonUGLines.length; x++) {
                for (int y = 1; y < tubeStationZone1.length; y++) {
                    String match = londonUGLines[x][y];
                    //System.out.println("I am here Line : 176" + match); //for debug purpose
                    if (userTubeStation.equalsIgnoreCase(match)) {
                        System.out.println(londonUGLines[x][0]); // first elements of multi dimension array is the line name
                    }
                }
            }
        } else {
            System.out.println("Station is not in the Zone 1.");
        }

    }
}
