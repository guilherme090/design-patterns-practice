package adapter;

public class ExampleAdapter {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "Evidencias.mp3");
		audioPlayer.play("vlc", "hugo.vlc");
		audioPlayer.play("mp4", "video.mp4");
		audioPlayer.play("avi", "video.avi");
	}
}
