//ques 23

import java.io.*;

import java.net.*;

import java.util.ArrayList;

import java.util.Date;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

class GFG {

    public static void main(String[] args) {

        try {

            

            URL url = new URL(

                    "https://www.google.com");

            URLConnection urlcon = url.openConnection();

            Map<String, List<String>> header = urlcon.getHeaderFields();

            // Printing all the fields along with their

            // value

            for (Map.Entry<String, List<String>> mp : header.entrySet()) {

                System.out.print(mp.getKey() + " : ");

                System.out.println(

                        mp.getValue().toString());

            }

            System.out.println();

            System.out.println(

                    "Complete source code of the URL is-");

            System.out.println(

                    "---------------------------------");

            // Getting the inputstream of the open

            // connection

            BufferedReader br = new BufferedReader(new InputStreamReader(

                    urlcon.getInputStream()));

            String i;

            // Printing the source code line by line

            while ((i = br.readLine()) != null) {

                System.out.println(i);

            }

        }

        // Catch block to handle exceptions

        catch (Exception e) {

            // Displaying exceptions

            System.out.println(e);

        }

    }

}
