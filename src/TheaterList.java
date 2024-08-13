import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TheaterList
{
    private String name;
    private List<Seat> list;

    public TheaterList(String name, int row, int column)
    {
        this.name = name;
        this.list = new ArrayList<>();
        generateSeat(row, column);

    }

    private void generateSeat(int row, int column)
    {
        char ch = 'A';
        for (int i=0; i<row; i++)
        {
            for (int j=1; j<=column; j++)
            {
                String seatNo = ""+ch + j;
                Seat seat = new Seat(seatNo);
                list.add(seat);
            }
            ch++;
        }
    }

    public void display()
    {
//        ListIterator<Seat> listIterator = list.listIterator();
//        while (listIterator.hasNext())
//        {
//            System.out.println(listIterator.next());
//        }

        System.out.println("********** Theater Seats **********");
        for (Seat seat : list)
        {
            System.out.println("Seat No. : "+seat.getSeatNo()+"\t\tReserved : "+seat.isReserved());
        }
    }

    public void bookSeat (String seatNo)
    {
        Seat seat = new Seat(seatNo);
        int index = list.indexOf(seat);
        if (index > -1)
        {
            list.get(index).setReserved(true);
            System.out.println("Booked");
        }
        else
        {
            System.out.println("Not book");
        }
    }

    public void cancelSeat (String seatNo)
    {
        Seat seat = new Seat(seatNo);
        int index = list.indexOf(seat);
        if (index > -1)
        {
            list.get(index).setReserved(false);
            System.out.println("Cancelled");
        }
    }

}
