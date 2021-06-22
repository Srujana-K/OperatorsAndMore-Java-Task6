public class Assignment3 {
    Assignment3(String msg){
        System.out.println(msg);
    }
    public static void main(String args[]){
        Assignment3 arr[] = new Assignment3[3];
        arr[0]=new Assignment3("Hii");
        arr[1]=new Assignment3("Hello");
        arr[2]=new Assignment3("Good Luck");
    }
}
