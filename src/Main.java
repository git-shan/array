public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] scores = new int[]{100,99,66};
        for (int score : scores)
            System.out.println(score);
        Array<Integer> arr = new Array<>();
        for (int i=0;i<10;i++)
            arr.addLast(i);
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);
    }
}
