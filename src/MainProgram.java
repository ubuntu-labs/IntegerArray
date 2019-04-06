public class MainProgram {

    protected static int middleNumber;

    private static Boolean isArrayCentered(int[] userArray) {

        // INFO: Check if the array has a single identifiable middle number. If not, return false
        //          If there's a middle number, return true otherwise false

        //          We get the middle number by taking the entire length of the array and checking if it's divisible by 2
        //          If it's divisible by 2 then there are two middle numbers, so we return false
        //          If it's not divisible by 2 then there's a single identifiable middle number, we then return true

        if(userArray.length % 2 == 0) {
            return false;
        } else {
            return true;
        }

    }

    private static Boolean isMiddleNumberGreaterthanAllElements(int[] userArray) {
        int middleIndex = (userArray.length / 2); // Get the index of the middle number using the isArrayCentered technique above
        middleNumber = userArray[middleIndex]; // Get the middle number by using the index obtained from the line above

        for (int i = 0; i < userArray.length; i++) {

            /*

            INFO: WE RUN A FOR LOOP FOR ALL THE ITEMS IN THE ARRAY

                WE RETURN FALSE IF THE MIDDLE NUMBER IS NOT GREATER THAN ALL THE NUMBERS IN THE ARRAY
             */

            int currentLoopNumber = userArray[i]; // Get current loop number

            if(i != middleIndex) { // Make sure the current loop number is not the same as the middle number ( In terms of index, not the number itself )

                if(middleNumber < currentLoopNumber) { // Check if the middle number is less than the current loop number
                    return false; // Return false if the current loop number is greater than the middle number
                }
            }
        }

        // If the code execution reaches this statement then all the items in the array are less than the middle number so we return true
        return true;
    }

    public static void main(String[] args) {

        int[] userArray = {1,2,2,5,3}; // User supplied Integer Array List

        Boolean isArrayCentered = isArrayCentered(userArray); // Check if the array has a centered number

        if(isArrayCentered) { // Array has an identifiable center number ( Proceed to one last check )

            Boolean isMiddleNumberTheGreatest = isMiddleNumberGreaterthanAllElements(userArray); // Call the function to check if the middle number is the greatest

            if(isMiddleNumberTheGreatest) { // If middle number is the greatest then print out: 1
                System.out.println("Middle number ( "+ middleNumber + " ) is greatest. Returning 1"); // print out : 1
            } else { // If middle number is not greatest number in the array then print out: 0
                System.out.println("Middle number ( "+ middleNumber + " ) is not greatest. Returning 0"); // print out : 0
            }
        } else { // Array does not have an identifiable center number ( Return 0 )
            System.out.println("Array does not have a center number: Returning 0");
        }
    }
}
