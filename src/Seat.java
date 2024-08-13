public class Seat
{
    private String seatNo;
    private boolean isReserved;

    public Seat(String seatNo, boolean isReserved) {
        this.seatNo = seatNo;
        this.isReserved = isReserved;
    }

    public Seat (String seatNo)
    {
        this(seatNo, false);
    }

    public String getSeatNo()
    {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

//    public boolean bookSeat()
//    {
//        if (! isReserved)
//        {
//            isReserved = true;
//            return isReserved;
//        }
//        return false;
//    }

    @Override
    public String toString()
    {
        return "Seat{" +
                "seatNo=" + seatNo +
                ", isReserved=" + isReserved +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        else
        {
            if (obj instanceof Seat seat)
                return this.seatNo.equals(seat.getSeatNo()) ;
        }
        return false;
    }

//    @Override
//    public int hashCode()
//    {
//        int result = seatNo != null ? seatNo.hashCode() : 0;
//        result = 31 * result + (isReserved ? 1 : 0);
//        return result;
//    }
}
