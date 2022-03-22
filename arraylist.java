import java.util.*;  
class JavaExample{  
   public static void main(String args[]){  
    ArrayList<String> obj = new ArrayList<String>();

    /*This is how we add elements to an ArrayList*/
    obj.add("Ajeet");
    obj.add("Harry");
    obj.add("Chaitanya");
    obj.add("Steve");
    obj.add("Anuj");

    // Displaying elements
    System.out.println("Original ArrayList:");
    for(String str:obj)
       System.out.println(str);

    /* Add element at the given index
     * obj.add(0, "Rahul") - Adding element "Rahul" at first position
     * obj.add(1, "Justin") - Adding element "Justin" at second position
     */
    obj.add(0, "Rahul");
    obj.add(1, "Justin");

    // Displaying elements
    System.out.println("ArrayList after add operation:");
    for(String str:obj)
       System.out.println(str);

    //Remove elements from ArrayList like this
    obj.remove("Chaitanya"); //Removes "Chaitanya" from ArrayList
    obj.remove("Harry"); //Removes "Harry" from ArrayList

    // Displaying elements
    System.out.println("ArrayList after remove operation:");
    for(String str:obj)
       System.out.println(str);

    //Remove element from the specified index
    obj.remove(1); //Removes Second element from the List

    // Displaying elements
    System.out.println("Final ArrayList:");
    for(String str:obj)
       System.out.println(str);
    

    System.out.println("After Sorting:");   
    Collections.sort(obj);               //Sorting 
    for(String str:obj)
       System.out.println(str);

       // add two arraylist

       ArrayList<String> al = new ArrayList<String>();
       al.add("Hi");
       al.add("hello");
       al.add("String");
       al.add("Test");
       System.out.println("ArrayList1 before addAll:"+al);

       //ArrayList2 of String Type
       ArrayList<String> al2 = new ArrayList<String>();
       al2.add("Text1");
       al2.add("Text2");
       al2.add("Text3");
       al2.add("Text4");

       //Adding ArrayList2 into ArrayList1
       al.addAll(al2);
       System.out.println("ArrayList1 after addAll:"+al);

       ArrayList<String> name = new ArrayList<String>();

       //Addition of elements in ArrayList
       name.add("Steve");
       name.add("Justin");
       name.add("Ajeet");
       name.add("John");
       name.add("Arnold");
       name.add("Chaitanya");
  
       System.out.println("Original ArrayList Content: "+name);
  
       //Sublist to ArrayList
       ArrayList<String> n1 = new ArrayList<String>(name.subList(1, 4));
       System.out.println("SubList stored in ArrayList: "+n1);
  
       //Sublist to List
       List<String> list = name.subList(1, 4);
       System.out.println("SubList stored in List: "+list);
    

       // check element is present or not

       System.out.println("'Steve' is present in arraylist: "+name.contains("Steve"));


       


   }  
}