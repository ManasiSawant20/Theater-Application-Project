import java.util.Scanner;
public class Entry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no of rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter no of columns : ");
        int columns = scanner.nextInt();

//        TheaterSet theater = new TheaterSet(rows, columns);
//        theater.display();
//
//        System.out.println("Enter seat to book : ");
//        String seat = scanner.next();
//        System.out.println(theater.addSeat(seat));
//
//        theater.display();

//        System.out.println("Enter seat to cancel : ");
//        String seat1 = scanner.next();
//        theater.cancelSeat(seat1);

        /************************************/

        TheaterList list = new TheaterList("PVR", rows, columns);
        list.display();

        System.out.println("Enter seat to book : ");
        String seat = scanner.next();
        list.bookSeat(seat);
        list.display();

        System.out.println("Enter seat to cancel : ");
        String seat1 = scanner.next();
        list.cancelSeat(seat1);
        list.display();
    }
}
