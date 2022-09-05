class calderon_ana_lab4{  
  public static void main(String[] args){

    System.out.println(howManyDigits("nBdj^19hb1^3j"));
    System.out.println(howManyDigits("Elementary data structures"));
    System.out.println(howManyDigits("H1Lolow2World !"));
    System.out.println(howManyDigits("")); 
    
    System.out.println(containsCapital("uteP"));
    System.out.println(containsCapital("abcba")); 
    System.out.println(containsCapital("12#(1)b!nc!"));
    System.out.println(containsCapital("12#(1)b!nc!X"));

    /* Part 2. Added for the Thirsday lab.*/
    System.out.println("Checking for Palindromes:");
    System.out.println(checkPalindrome("zxcxz"));
    System.out.println(checkPalindrome("zxccxz"));
    System.out.println(checkPalindrome("1xccxx1"));
    
    System.out.println("Reversing a given string:");
    System.out.println(reverseOrder("POT"));
    System.out.println(reverseOrder("ZIGZAG"));
    System.out.println(reverseOrder("PETU"));
    
                 
  }
  
  /**
   * Write a recursive method to return number of digits a string
   * contains. 
  /* @param str
  /* @return 
   */
  static int howManyDigits(String str){
    // change the body of this method.
    //creates counter for recurssion
    int count = 0;
    //sets up base case
    if(str.length()<1){
      return 0;
    }
    //checks for digits
    if(Character.isDigit(str.charAt(0))){
      //updates counter
      count++;
    }
    //calls method
    return count+howManyDigits(str.substring(1));
  }
  
  /**
   * Write a recursive method to find if a string contains
   * any capital letter (any letter between A-Z).
  /* @param str
  /* @return 
   */
  
  static boolean containsCapital(String str){
    // change the body of this method.
    //sets up base case
    if(str.length()<1){
      return false;
    }
    //looks for upper case characters
    if (Character.isUpperCase(str.charAt(0))){
      return true;
    }
  
    return containsCapital(str.substring(1));

  }

    /** Part 2
   * Write a recursive method to check if a given string
   * is a Palindrome.
   /* @param str
   /* @return 
   */

  static boolean checkPalindrome(String str){
    // change the body of this method.
    //sets up base case
    if(str.length()<=1){
      return true;
    }
    //checks for palindrome
    if(str.charAt(0) == str.charAt(str.length()-1)){
      //calls for recurssion
      return checkPalindrome(str.substring(1, str.length()-1));
    } 
    //returns when there is no palindrome
    return false;
  }
  
  
  /** Part 2
   * Write a recursive method to reverse the order
   * of a given string.
  / * @param str
  / * @return 
   */
  
  static String reverseOrder(String str){
    // change the body of this method.
    //sets up base case
    if (str.length()<=1){
      return str;
    }
    //call for recurssion
    String reversed = str.charAt(str.length()-1)+reverseOrder(str.substring(0, str.length()-1));
      return reversed;
  }
  
}




