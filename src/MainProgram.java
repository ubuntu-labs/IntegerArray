public class MainProgram {

    private static Boolean isArrayCentered(int[] userArray) {

        if(userArray.length % 2 == 0) {
            return false;
        } else {
            return true;
        }

    }

    private static boolean isMiddleNumberGreaterthanAllElements(int[] userArray) {
        int middleIndex = (userArray.length / 2);
        int middleNumber = userArray[middleIndex];

        for (int i = 0; i < userArray.length; i++) {
            int currentLoopNumber = userArray[i];

            if(i != middleIndex) {
                if(middleNumber < currentLoopNumber) {
                    return false; // Just looking for false operations
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] userArray = {1,2,4,5,3};

        Boolean isArrayCentered = isArrayCentered(userArray);

        if(isArrayCentered) {

            Boolean isMiddleNumberTheGreatest = isMiddleNumberGreaterthanAllElements(userArray);

            if(isMiddleNumberTheGreatest) {
                System.out.println("Middle number is greatest");
            } else {
                System.out.println("Middle number is not greatest");
            }
        } else {
            System.out.println("Array is not centered");
        }
    }
}
