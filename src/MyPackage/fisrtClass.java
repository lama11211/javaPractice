package MyPackage;

public class fisrtClass {
    public void myPrint() {
        System.out.println("Hi :)");
    }

    public double absoluteValue(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }

    }

    public String nametagText(String name) {
        return ("Hello, my name is " + name);
    }

    public double fahrenheitToCelsius(double Fahre) {
        double Celsius = (Fahre - 32) * 5 / 9;
        return Celsius;
    }

    public double Temperature(double Fahre) {
        return fahrenheitToCelsius(Fahre);
    }


    public int countBlocks(int levels) {
        int block;
        int total = 0;
        for (int i = 1; i <= levels; i++) {
            block = i * i;
            total += block;
        }

        return total;
    }

    public int factorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i; // 1.5      2.20    3.60      4.120
        }
        return factorial;
    }

    public int indexOfFirstOccurrence(String[] stringArray, String target) {
        int size = stringArray.length;
        for (int i = 0; i < size; i++) {
            if (stringArray[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public int yearsTilOneMillion(double initialBalance) {
        double balance = initialBalance;
        int years = 0;
        while (balance <= 1000000) {
            years++;
            balance += 1.05 * initialBalance;
        }
        return years;
    }

    public void printInVerverse(String[] stringArray) {
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }
    }

    public int findRange(int[] intArray) {
        int size = intArray.length;
        if (size == 0) return -1;
        int min = intArray[0];
        int max = intArray[0];

        for (int i = 1; i < size; i++) {
            if (intArray[i] < min) min = intArray[i];
            if (intArray[i] > max) max = intArray[i];
        }

        return max - min;
    }


    public int diceRoll(int sides) {
        double doubleRandom = Math.random();
        doubleRandom *= sides;
        doubleRandom += 1;
        int intRandom = (int) doubleRandom;
        return intRandom;
    }

    public int monopolyRoll() {
        int firstRandom = diceRoll(6);
        int secondRandom = diceRoll(6);
        int sum = firstRandom + secondRandom;

        if (firstRandom != secondRandom) {
            return sum;
        } else if (firstRandom == secondRandom) {
            int thirdRandom = diceRoll(6);
            int fourthRandom = diceRoll(6);
            return sum + thirdRandom + fourthRandom;
        } else {
            return 0;
        }
    }

    public int monopolyRollImproved() {
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        int sum = roll1 + roll2;
        int turns = 0;
        while (roll1 == roll2) {
            turns += 1;

            if (turns >= 3) return -1;
            int roll3 = diceRoll(6);
            int roll4 = diceRoll(6);
            return sum + roll3 + roll4;
        }

        return sum;
    }


    public int monopolyRollRecursive() {
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        int sum = roll1 + roll2 , turns = 0;

        if (roll1 != roll2) {
          return sum;
        } else if (roll1 == roll2) {
            turns += 1;
            if (turns >= 3) return -1;
            else return sum += monopolyRollRecursive();
        }

        return sum;
    }

}

