public class DuplicateChars {

  public static void main(String[] args) {   
    findDuplicateCharsWithCount("My name is Guarav Kukade");
    System.out.println("------------");
    
  }
    
  private static void findDuplicateCharsWithCount(String str) {
    System.out.println("Duplicates in- "+ str);
    int count;
    for(int i = 0; i < str.length(); i++) {
      count = 1;
      
      char c = str.charAt(i);
      
      if(c == ' ') 
        continue;
      for(int j = i + 1; j < str.length(); j++) {
        if(c == str.charAt(j)) {
          count++;
          
          str = str.substring(0, j) + str.substring(j+ 1);
        }
      }
      if(count > 1) {
        System.out.println(c + " found " + count + " times");
      }
    }
  }
}
