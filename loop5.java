//)Print all consonant(Alphabets that are not vowels) in uppercase
public class loop5 {

        public static void main(String[] args) {
            System.out.println("Uppercase Consonants:");

            // Loop through all uppercase alphabets
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                // Check if the letter is NOT a vowel
                if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                    System.out.print(ch + " ");
                }
            }
        }
    }

