package exam01;

public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Smart TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is turned OFF");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Smart TV volume set to: " + this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println("Searching for: " + url);
    }
}
