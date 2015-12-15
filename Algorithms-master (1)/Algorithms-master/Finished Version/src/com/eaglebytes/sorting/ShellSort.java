package com.eaglebytes.sorting;

import java.awt.Color;

public class ShellSort implements Sort {

    //variables
    public int nElems;
    private int index = 0;
    private Color[] colors;

    //sort function
    @Override
    public int[] sort(int[] data) {
        int outer;
        int temp;

        nElems = data.length;

        int h = 1;                     // find initial value of h
        while (h <= nElems / 3)
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        while (h > 0) // decreasing h, until h=1
        {
            // h-sort the file
            for (outer = h; outer < nElems; outer++) {
                temp = data[outer];
                int inner = outer;
                // one subpass (eg 0, 4, 8)
                while (inner > h - 1 && data[inner - h] >= temp) {
                    data[inner] = data[inner - h];
                    inner -= h;
                }
                data[inner] = temp;
            }  // end for
            h = (h - 1) / 3;

        }
        return data;
    }
    
    //initialize
    @Override
    public void init(int[] data) {
        index = 0;
        nElems = data.length;
        h = 1;
        while (h <= nElems / 3)
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        outer = h;
    }

    private int h = 1;
    private int temp;
    private int outer;
    private int tempIndex;
    private int tempIndex2;
    
    //sortStep make it animate
    @Override
    public int[] sortStep(int[] data) {
        if(h > 0){
            if(outer < nElems){
                temp = data[outer];
                tempIndex = outer;
                int inner = outer;
                // one subpass (eg 0, 4, 8)
                while (inner > h - 1 && data[inner - h] >= temp) {
                    data[inner] = data[inner - h];
                    inner -= h;
                }
                tempIndex2 = inner;
                data[inner] = temp;
                outer++;
            }else{
                h = (h - 1) / 3;
                outer = h;
            }
        }
        return data;
    }

    //swapdata
    public void swapData(int[] data, int index, int destination) {
        int temp = data[index];
        data[index] = data[destination];
        data[destination] = temp;
        //TODO: Not necessary if color based on length.
        // Color tempColor = colors[index];
        //colors[index] = colors[destination];
        // colors[destination] = tempColor;
    }

    @Override
    public int getTemp() {
        return 0;
    }

    @Override
    public int getTempIndex() {
        return tempIndex;
    }

    @Override
    public int getTempIndex2(){
        return tempIndex2;
    }
    
}
