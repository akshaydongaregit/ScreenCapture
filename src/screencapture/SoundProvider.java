/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screencapture;

import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JApplet;

/**
 *
 * @author DONGRE
 */
public class SoundProvider {
    
    public void play(String audionm)
	{
                new Thread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        AudioClip audio;
                        ClassLoader cl = SoundProvider.class.getClassLoader();
                        URL resource = cl.getResource(audionm+".wav");
                        if(resource!=null)
                        { 
                            // System.out.println("called successfully");
                            audio = JApplet.newAudioClip(resource);
                            audio.play();
		     
                        }else
                            System.out.println("error  while playing.");
                    }
                }).start();
		
	}
    
}
