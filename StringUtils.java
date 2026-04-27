class StringUtils{
  public static boolean containsChar(String word, char letter){
    for (int i = 0; i<word.length(); i++){
      if(word.charAt(i) == letter){
        return true;
      }
    }
    return false;
  }

  public static String reverse(String word){
    int len = word.length();
    char[] reverseChar = new char[len];
    for(int i = 0; i<len; i++){
      reverseChar[len - 1 - i] = word.charAt(i);
    }

    return new String(reverseChar);
  }

  public static String replaceAll(String word, char targetLetter, char replaceLetter){
    int len = word.length();
    char[] newChar = new char[len];
    for(int i = 0; i<len; i++){
      newChar[i] = word.charAt(i);
      if(word.charAt(i) == targetLetter){
        newChar[i] = replaceLetter;
      }
    }
    return new String(newChar);
  }
}
