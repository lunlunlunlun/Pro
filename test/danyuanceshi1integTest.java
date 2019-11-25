import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.simple.RandomSource;
class danyuanceshi1integTest {
    UniformRandomProvider rng = RandomSource.create(RandomSource.MT);
    @Test
    void check() {
        danyuanceshi1 check_class1 = new danyuanceshi1();
        int[] arr = new int[10];
        int i,j,temp;
        for(i=0;i<10;i++)
        {
            arr[i]=rng.nextInt(100);
        }
        for(i=0;i<10;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        boolean f=true;
        for(i=0;i<10;i++)
        {
            if(arr[i]>100)
            {
                f=false;
                break;
            }
        }
        assertEquals(true,f);
    }
}