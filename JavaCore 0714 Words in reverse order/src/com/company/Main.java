package com.company;

import sun.awt.windows.WPrinterJob;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

0714 Words in reverse order

Enter 5 words from the keyboard into the list of lines.
Remove the 3rd element of the list,
and output the remaining elements in reverse order.

Requirements:
1. Declare a variable of type ArrayList (list of strings) and immediately initialize ee.
2. Read 5 lines from the keyboard and add them to the list.
3. Remove the third element of the array.
4. Display items on the screen, each with a new line.
5. The withdrawal order must be reversed.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<5;i++) {
            list.add(reader.readLine());
        }
        list.remove(2);
        for (int i=list.size(); i>0; i--) {
            System.out.println(list.get(i-1));
        }
    }
}









