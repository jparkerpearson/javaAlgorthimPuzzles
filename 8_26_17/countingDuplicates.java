public class CountingDuplicates {
  public static int duplicateCount(String text) {
    // Write your code here
    int dups = 0;
    List<Character> seenChars = new ArrayList<Character>();
    List<Character> duplicatedChars = new ArrayList<Character>();
    
    for (int i = 0; i < text.length(); i ++) {
      if (seenChars.contains(Character(text.charAt(i)))) {
        if (!duplicatedChars.contains(Character(text.charAt(i)))) {
        
        }
        else {
          duplicatedChars.add(Character(text.charAt(i)));
          dups ++;
        }
      }
      else {
        seenChars.add(Character(text.charAt(i)));
      }
    }
    
    return dups;
}