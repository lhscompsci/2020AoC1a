package com.wtxcompsci;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    Scanner infile = new Scanner(new File("input.dat"));

        ArrayList<Integer> list = new ArrayList<>();

        int answer = 0;

        while (infile.hasNext()){
            list.add(infile.nextInt());
        }
        for(int i = 0; i < list.size(); i++)
            for(int j = i+1; j<list.size(); j++)
                if(list.get(i)+list.get(j)==2020) {
                    answer = list.get(i) * list.get(j);
                    break;
                }

        System.out.println(answer);

    }
}
