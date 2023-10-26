public class Main {
    public static void main(String[] args) {
        // task 1.1
        int length = 5;
        int[] myArray = new int[length];
        myArray[0] = 5;
        for (int counter = 4; counter >= 0; counter--) {
            System.out.println("Counter is " + counter);
            System.out.println("The element value is " + myArray[counter]);
        }
        //task 1.2
        String[] names = new String[5];
        names[2] = "Mike";
        for (int name = 0; name < myArray.length; name++) {
            System.out.println("Counter is " + name);
            System.out.println("The name is " + names[name]);
        }
        //task 2 (really difficult, so did it with the help of chatGPT)
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        char char1 = 'w';
        for (int checkChar = 0; checkChar < charArray.length; checkChar++) {
            if (charArray[checkChar] == char1) {
                System.out.println("The characters are equal.");
            } else {
                System.out.println("The characters are not equal.");
            }
        }
        boolean found = false;
        int i = 0;
        while (i < charArray.length) {
            if (charArray[i] == 'a') {
                found = true;
                break;
            }
            i++;
        }

        if (found) {
            System.out.println("The character '" + 'a' + "' is present in the string.");
        } else {
            System.out.println("The character '" + 'a' + "' is not present in the string.");
        }
    }
    }
