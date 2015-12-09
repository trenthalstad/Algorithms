/* Randal's original
package com.eaglebytes.sorting;

public class BubbleSort implements Sort
    {

                  
    private int nElems;  
    
    public BubbleSort() 
    {
     
    }
    
    public void swap(int[]a, int one, int two)
      {
      int temp = a[one];
      a[one] = a[two];
      a[two] = temp;       
      }

    @Override
    public int[] sort(int[] data)
    {
     nElems = data.length;
        
     int mLeft = 0, mRight = data.length - 1;
       
       while (mLeft < mRight)
       {
          for (int pos = mLeft; pos < mRight; pos++)
          {
             if (data[pos] > data[pos+1])
                swap(data, pos, pos+1);                                   
          }
          mRight--;               

          for (int pos = mRight; pos > mLeft; pos--)
          {
             if (data[pos] < data[pos-1])
               swap(data, pos, pos-1);  
          }
          mLeft++;                     
        
        
    }
        return data;
    }
    
    @Override
    public int[] sortStep(int[] data)
    {
        return data;
    }

}
*/

package com.eaglebytes.sorting;

public class BubbleSort implements Sort {

    private int nElems;
    private int mLeft, mRight;
    
    public int temp;
    private int tempIndex;

    public BubbleSort() {
        mLeft = 0;
    }
    
    @Override
    public void init(int[] data){
        mLeft = 0;
        mRight = data.length-1;
    }

    public void swap(int[] a, int one, int two) {
        temp = a[one];
        a[one] = a[tempIndex = two];
        a[two] = temp;
    }

    @Override
    public int[] sort(int[] data) {
        mLeft = 0;
        mRight = data.length-1;
        while (mLeft < mRight) {
            data = sortStep(data);
        }
        return data;
    }

    @Override
    public int[] sortStep(int[] data) {
        nElems = data.length;
        for (int pos = mLeft; pos < mRight; pos++)
            if (data[pos] > data[pos + 1])
                swap(data, pos, pos + 1);
        mRight--;

        for (int pos = mRight; pos > mLeft; pos--)
            if (data[pos] < data[pos - 1])
                swap(data, pos, pos - 1);
        mLeft++;

        return data;
    }
    
    @Override
    public int getTemp(){
        return temp;
    }

    @Override
    public int getTempIndex(){
        return tempIndex;
    }
    
}
