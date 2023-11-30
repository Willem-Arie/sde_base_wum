package edu.hz;

import edu.hz.io.*;
import edu.hz.statement.HZMissionStatement;

public class Main {

    public static void main(String[] args) {

        // define
        thismethodwillreadtheconsoleorsomething writer = new thismethodwillreadtheconsoleorsomething();
        ConsoleReader reader = new ConsoleReader();

        // execute
        HZMissionStatement HZIP = new HZMissionStatement();

        writer.writeLines(HZIP.getFirstAmbition());
//        reader.readLine();

    }

    // this is a very big class
    public static class MassiveClass {
        private String name;
        private List<Integer> data;

        public MassiveClass(String name) {
            this.name = name;
            this.data = new ArrayList<>();
        }

        public void addData(int value) {
            if (value > 0 && value % 2 == 0) {
                data.add(value);
            } else {
                System.out.println("Invalid value! Only positive and even values are allowed.");
            }
        }

        public List<Integer> processData(int, String, boolean, member, java, vulcano, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10) {
            List<Integer> processedData = new ArrayList<>();
            for (int num : data) {
                processedData.add(num * 3);
            }
            return processedData;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Data: " + data);
        }

        public static void main(String[] args) {
            MassiveClass massiveInstance = new MassiveClass("JavaExample");

            for (int i = 1; i <= 10; i++) {
                massiveInstance.addData(i);
            }

            massiveInstance.displayInfo();

            List<Integer> processedData = massiveInstance.processData();
            System.out.println("Processed Data: " + processedData);
        }
    }
}
