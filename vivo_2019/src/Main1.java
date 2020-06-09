public class Main1 {
    /**
     * 输入数组A和数组B，删除数组A中在B中存在的元素
     * 输入描述A：{1，2，3，4，5，6，7，8}   B:{2,3,4}
     * 输出描述:{1,5,6,7,8}
     * */
    public void DelAwhiechinB(int [] array1, int array1_length, int [] array2, int array2_length){
        int count = 0, k = 0;
        boolean flag;
        for(int i = 0; i < array1_length; i++){
            flag = false;
            for(int j = 0; j < array2_length; j++){
                if(array2[j] == array1[i]){
                    count++;
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                array1[k++] = array1[i];
            }
        }
        for(int i = 0; i < k; i++)
            System.out.println(array1[i]);
    }
}
