package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static List <String> groceryList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public void startGrocery(){
        int sayi = scanner.nextInt();
        scanner.nextLine();

        while(true){
            if(sayi == 0){
                break;
            }
            else if(sayi == 1){
                String malzemeler = scanner.nextLine();
                addItems(malzemeler);
                
            }else if(sayi == 2){
                String cikarilmasiGerekenMalzeme = scanner.nextLine();
                removeItems(cikarilmasiGerekenMalzeme);
            }
        }
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            if(!groceryList.contains(item)){
                groceryList.add(item);
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            groceryList.remove(item);
        }
        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        List<String> updatedList = new ArrayList<>();
        for (String elm : groceryList) {
            if (!updatedList.contains(elm)) {
                updatedList.add(elm);
            }
        }
        for (String elm : updatedList) {
            System.out.println(elm);
        }
    }
    

}
