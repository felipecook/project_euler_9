package edu.cnm.deepdive;

public class ProjectEuler9 {

  public static int[] findTriplet(int sum) {
    for (int a = 1; a < sum / 3; a++) {
      for (int b = a +1; b < sum / 2; b++) {
        int cSquared = a * a + b * b;
        double c = Math.sqrt(cSquared);
        int cTruncated = (int) c;
        if (cTruncated * cTruncated == cSquared) {
          if (a + b + cTruncated == sum) {
            return new int[] {a, b, cTruncated};
          }
        }
      }
    }
    return null;
  }

}
