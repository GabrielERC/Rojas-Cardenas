
import java.util.Vector;
public class QuickSort {
	public static int[] quickSort(int[] num)
    {
          
        return null;   
        }
    public static Vector<Integer> quickSort(Vector<Integer> num)
    {
        if(num.size()==1)
        {
            return num;
        }
        else
        {
            int pivot = num.get(0);
            Vector<Integer> less=new Vector<Integer>();
            Vector<Integer> greater=new Vector<Integer>();
            Vector<Integer>result = new Vector<Integer>();

            
            for (int i = 1; i < num.size(); i++) 
            { 
                if(num.get(i)>pivot){
                greater.add(num.get(i));
                }
                else
                {
                 less.add(num.get(i));
                }
            }
            result.addAll(quickSort(less));
            result.add(pivot);
            result.addAll(quickSort(greater));
            return result;
        }
    }
}
