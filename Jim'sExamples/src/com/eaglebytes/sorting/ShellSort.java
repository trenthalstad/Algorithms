
package com.eaglebytes.sorting;

public class ShellSort implements Sort{

         
    public int nElems;
        private int index = 0;
    int[] SortData;
    private Color[] colors;
    
    @Override
    public int[] sort(int[] data){
          int inner, outer;
        int temp;
        SortData = data;

        nElems = data.length;
        
        int h = 1;                     // find initial value of h
        while (h <= nElems / 3) {
            h = h * 3 + 1;                // (1, 4, 13, 40, 121, ...)
        }
        while (h > 0) // decreasing h, until h=1
        {
            // h-sort the file
            for (outer = h; outer < nElems; outer++) {
                temp = data[outer];
                inner = outer;
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
    
    @Override
    public int[] sortStep(int[] data){
                              for (int i = index; i < SortData.length - 1; i++)
                if (SortData[i] < SortData[i + 1])
                    if (SortData[i + 1] > SortData[index])
                        swapData(index, i + 1);
            index++;
        return SortData;

       

}
            public void swapData(int index, int destination) {
            int temp = SortData[index];
            SortData[index] = SortData[destination];
            SortData[destination] = temp;
            //TODO: Not necessary if color based on length.
            Color tempColor = colors[index];
            colors[index] = colors[destination];
            colors[destination] = tempColor;
        }
    
    @Override
    public int getTemp(){
        return temp;
    }
    
    @Override
    public int getTempIndex(){
        return 0;
    }

}
