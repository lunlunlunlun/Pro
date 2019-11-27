import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.simple.RandomSource;

public class danyuanceshi1 {
    UniformRandomProvider rng = RandomSource.create(RandomSource.MT);
    /*
    *   generate ten random nunmbers,do an ascending sort.
    */
      int[]  bubblesort(int[] arr)
        {
            int i,j;
            int temp;
            for(i=0;i<10;i++)
            {
                for(j=0;j<9-i;j++)
                {
                    if(arr[j]<arr[j+1])
                    {
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            return arr;
        }

    int[] crea_num(int[] arr)
    {
        int i;
        for(i=0;i<10;i++)
        {
            arr[i]=rng.nextInt(100);
        }
        return arr;
    }

    int check(int[] arr)
    {
        int flag=1;
        if(arr[0]>=arr[9])
            flag=0;
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        danyuanceshi1 ceshi = new danyuanceshi1();
        ceshi.crea_num(arr);
        ceshi.bubblesort(arr);
        ceshi.check(arr);
        int i;
        for (i = 0; i < 10; i++)
        {
            System.out.println(arr[i]);
        }
    }
}