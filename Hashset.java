import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
public class Hashset{
   public static void main(String args[]) {
      // HashSet declaration
      HashSet<String> hset = 
               new HashSet<String>();

      // Adding elements to the HashSet
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Fig");
      //Addition of duplicate elements
      hset.add("Apple");
      hset.add("Mango");
      //Addition of null values
      hset.add(null);
      hset.add(null);

      //Displaying HashSet elements
      System.out.println(hset);

      //iterate hashset
      for (String temp : hset) {
        System.out.println(temp);}

      //delete ll elements from hashset

           /* public void clear(): It removes all the elements
      * from HashSet. The set becomes empty after this
      * method gets called.
      */
     hset.clear();
 
     // Display HashSet content again
     System.out.println("After: HashSet contains: "+ hset);
      
     //convert Hashset to treeset

     hset.add("Element1");
     hset.add("Element2");
     hset.add("Element3");
     hset.add("Element4");
 
     // Displaying HashSet elements
     System.out.println("HashSet contains: "+ hset);
 
     // Creating a TreeSet of HashSet elements
     Set<String> tset = new TreeSet<String>(hset);
 
     // Displaying TreeSet elements
     System.out.println("TreeSet contains: ");
     for(String temp : tset){
        System.out.println(temp);}
   
   
    }
}