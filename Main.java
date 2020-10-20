package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Collections.sort;


public class Main {

    public static void main(String[] args) {

        //MyListGeneral

        MyListGeneral<Integer> list = new MyListGeneral<>((a, b) -> {
            if((int)a.getValue() - (int)b.getValue() > 0)
                return 1;
            else if ((int)a.getValue() - (int)b.getValue() < 0)
                return -1;
            else
                return 0;
        });

    }
}

