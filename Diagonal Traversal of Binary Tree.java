class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           ArrayList<Integer> list = new ArrayList<>();
           
           Queue<Node> q = new LinkedList<>();
           
           q.add(root);
           
           while(!q.isEmpty())
           {
               Node temp = q.poll();
               
               while(temp!=null)
               {
                   if(temp.left!=null)
                   {
                       q.add(temp.left);
                   }
                   list.add(temp.data);
                   temp = temp.right;
               }
           }
           
           return list;
      }
}

