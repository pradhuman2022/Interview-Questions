import java.util.* ;

public class Insertion_LOT {
    int data ; 
    Insertion_LOT left ; 
    Insertion_LOT right ;
    public Insertion_LOT(int data)
    {
        this.data = data  ;
    }
    static Insertion_LOT doInsert(Insertion_LOT root, int data)
    {
       Queue <Insertion_LOT>q = new ArrayDeque<Insertion_LOT>() ;
       q.offer(root) ;
       while(!q.isEmpty())
       {
           Insertion_LOT node = q.poll( );
           if(node.left != null)
           {
              q.offer(node.left) ; 
           }
           else
           {
               node.left = new Insertion_LOT(data) ;
           }
           
           if(node.right != null)
           {
              q.offer(node.right); 
           }
           else
           {
               node.right = new Insertion_LOT(data) ;
           }
       }
      return root ; 
    }
}
