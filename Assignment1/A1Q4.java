class A1Q4{
    // Write a program to search an element using binary search and calculate its time complexity
    public static void main(String[] args){
        public static int binarySearch(int[] arr, int target) {
            int size = arr.length;
            int start = 0;
            int end = size - 1;
            while(start < end) {
                int mid = (start+end)/2;
                if(arr[mid] == target) {
                    return mid;
                } else if(arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid -1 ;
                }
            }
            // Returns -1 if the target eleemnt is not found 
            return -1;
        }

        public static void main(String[] args) {
            int[] a = {1,2,4,5,7,8,10,44,55,77,99};
            int result = binarySearch(a, 77);
            
            if(result != -1) {
                System.out.println("element found at index : " + result);
            } else {
                System.out.println("Element not found!! ");
            }
        }
    }
}