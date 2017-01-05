package module5.homeOrk3;


import module5.homeOrk1and2.Room;

public interface API {
    Room[] findRooms (int price, int persons, String city, String hotel);
    Room[] getRooms();
}
