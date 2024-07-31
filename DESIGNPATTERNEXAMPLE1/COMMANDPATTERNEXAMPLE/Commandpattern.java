public class Commandpattern {
    public static void main(String[] args) {
        Room livingRoom = new Room();
        livingRoom.setCommand(new SwitchLightsCommand(new Light()));
        livingRoom.executeCommand();
    }
}