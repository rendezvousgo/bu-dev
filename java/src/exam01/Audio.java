package exam01;

public class Audio implements RemoteControl {
    private int volume;
    
    @Override
    public void turnOn() {
        System.out.println("Audio is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio is turned OFF");
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
        System.out.println("Audio volume set to: " + this.volume);
    }
}
