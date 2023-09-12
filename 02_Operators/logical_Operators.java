public class logical_Operators {
    public static void main(String args[]){
        System.out.println("this is for AND logical ");
        System.out.println( (3>2) && (5>0) );//-->output is true
        System.out.println( (3<2) && (5>0) );//-->output is false
        System.out.println( (3>2) && (5<0) );//-->output is false
        System.out.println( (3<2) && (5<0) );//-->output is false
        
        System.out.println("this is for OR logical ");
        System.out.println( (3>2) || (5>0) );//-->output is true
        System.out.println( (3>2) || (5<0) );//-->output is true
        System.out.println( (3<2) || (5>0) );//-->output is true
        System.out.println( (3<2) || (5<0) );//-->output is false

        System.out.println("this is for NOT logical");
        System.out.println(!(3>2));//--->output is false
        System.out.println(!(0>5));//--->output is true
    }
      
}