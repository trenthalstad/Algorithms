/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Modification Author = Randall the getting into DB&A Guy. Digging it!

package bubblesort;

import java.util.Random;

class ArrayBub
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public ArrayBub(int max)          // constructor
      {
      a = new long[max];                 // create the array
      nElems = 0;                        // no items yet
      }
//--------------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
//--------------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
        
         System.out.print(a[j] + " ");  // display it
         
         System.out.println("");
         
      }
  
  
//--------------------------------------------------------------
   public void bubbleSort() //After time tests. Modification ended up in 
                            //complete re-working of the method bubbleSort();
           
                            //Bi-directional sort mod to BubbleSort
   {
       int mLeft = 0, mRight = a.length - 1;
       
       while (mLeft < mRight)
       {
          for (int pos = mLeft; pos < mRight; pos++)
          {
             if (a[pos] > a[pos+1])
                swap(pos, pos+1); // calls swap() method if a[pos] greater than
                                  //pos +1.
          }
          mRight--;               //Right to left

          for (int pos = mRight; pos > mLeft; pos--)
          {
             if (a[pos] < a[pos-1])
               swap(pos, pos-1);  //calls swap() method if c[pos]
          }
          mLeft++;                //Left to right
       }
    }  // end bubbleSort()
//--------------------------------------------------------------
   private void swap(int one, int two)
      {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
      }
//--------------------------------------------------------------
   }  // end class ArrayBub
////////////////////////////////////////////////////////////////


public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              {
      int maxSize = 150000;            // array size
      ArrayBub arr;                 // reference to array
      arr = new ArrayBub(maxSize);  // create the array

        for(int j = 0;j < 100000; j++)
        {
            
            Random r = new Random();
            int Low = 1;
            int High = 99;
            int R = r.nextInt(High-Low) + Low;
            arr.insert(R);
            
        }
      
//      arr.insert(77);               // insert 10 items
//      arr.insert(99);
//      arr.insert(44);
//      arr.insert(55);
//      arr.insert(22);
//      arr.insert(88);
//      arr.insert(11);
//      arr.insert(00);
//      arr.insert(66);
//      arr.insert(33);

      arr.display();                // display items

      arr.bubbleSort();// bubble sort them
      //arr.OddEvenSort();
      
      

      arr.display();                // display them again
      
      //TEST 1. Inserted 100,000 random numbers into array. 
      //Sort took 19.74 seconds
      
      //Future tests of up to 100mil
      
      // 
      
      
      
      
      
      }  // end main()
    }
    
}
