import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class danyuanceshi1Test {

    @Test
    void bubblesort() {
        danyuanceshi1 check_class1 = new danyuanceshi1();
        int[] arr = new int[10];
        check_class1.crea_num(arr);
        check_class1.bubblesort(arr);
        boolean f=true;
        int i;
        for(i=0;i<9;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                f=false;
                break;
            }
        }
        assertEquals(true,f);
    }

    @Test
    void crea_num() {
        danyuanceshi1 check_class2 = new danyuanceshi1();
        int[] arr = new int[10];
        check_class2.crea_num(arr);
        boolean f=true;
        int i;
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

    @Test
    void check() {
        danyuanceshi1 check_class3 = new danyuanceshi1();
        int[] arr = new int[10];
        check_class3.crea_num(arr);
        check_class3.bubblesort(arr);
        assertEquals(1,check_class3.check(arr));
    }

    @Test
    void main(){
        danyuanceshi1 check_class4 = new danyuanceshi1();
        String[] arr = new String[10];
        check_class4.main(arr);
    }
}