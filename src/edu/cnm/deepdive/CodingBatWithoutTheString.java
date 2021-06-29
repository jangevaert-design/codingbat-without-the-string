package edu.cnm.deepdive;

/*
Given two strings, base and remove, return a version of the base string where all instances of the
remove string have been removed (not case sensitive).
You may assume that the remove string is length 1 or more.
Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 */

public class CodingBatWithoutTheString {

  public static void main(String[] args) {
    System.out.printf("Given the base %s and the remove %s, the outcome is "
    + withoutString("Hello there", "llo") + ".\n", "Hello there", "llo");
    System.out.printf("Given the base %s and the remove %s, the outcome is "
        + withoutString("Hello there", "e") + ".\n", "Hello there", "e");
    System.out.printf("Given the base %s and the remove %s, the outcome is "
        + withoutString("Hello there", "x") + ".\n", "Hello there", "x");

  }

  public static String withoutString(String base, String remove) {
    int lenb = base.length();
    int lenr = remove.length();
    String result = "";
    String lowerBase = base.toLowerCase();
    String lowerRemove = remove.toLowerCase();

    for (int i = 0; i < lenb; i++) {
      if (i <= lenb - lenr) {
        String temp = lowerBase.substring(i, i + lenr);
        if (!temp.equals(lowerRemove)) {
          result += base.substring(i, i + 1);
        } else {
          i += lenr - 1;
        }
      } else {
        String temp2 = lowerBase.substring(i, i + 1);
        if (!temp2.equals(lowerRemove)) {
          result += base.substring(i, i + 1);
        }
      }
    }
    return result;
  }

}
