package exodecorateur_angryballs.controleur;
import java.io.*;
import javax.sound.sampled.*;

public class Soundplayer extends Thread{
	
	public Soundplayer(){
	}
	
	public void run(){
	    this.Play();
	  }       
	
	public static void Play(){
	     try {
	          // Open an audio input stream.
	    	  File soundFile = new File("foo.wav");
	    	  AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
	          // Get a sound clip resource.
	          Clip clip = AudioSystem.getClip();
	          // Open audio clip and load samples from the audio input stream.
	          clip.open(audioIn);
	          clip.start();
	       } catch (UnsupportedAudioFileException e) {
	          e.printStackTrace();
	       } catch (IOException e) {
	          e.printStackTrace();
	       } catch (LineUnavailableException e) {
	          e.printStackTrace();
	       }
		
	}

}
