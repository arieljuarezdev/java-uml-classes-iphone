package usuario.iphone;

import usuario.iphone.music.MusicPlayer;
import usuario.iphone.smartphone.Phone;
import usuario.iphone.webBrowser.WebBrowser;

public class Iphone implements MusicPlayer, Phone, WebBrowser {
    
    //Music methods
    public void play(){
        System.out.println("Music is played");
    }

    public void pause(){
        System.out.println("Music is Paused");
    }

    public void selectMusic(){
        System.out.println("Music Selected");
    }

    //Phone methods
    public void call (){
        System.out.println("Calling");
    }
    public void awswer(){
        System.out.println("Answering a call");
    }
    public void voiceMenssage(){
        System.out.println("Sending a voice message...");
    }

    //Web Browser methods
    public  boolean webConnection(){
        
        boolean connectionStatus = true; //This method test the connection a use a mock value for this example;
        
        System.out.println("Connection Status: " + connectionStatus);
        return connectionStatus; 
    }

    public void loadHomePage(){
        boolean status = webConnection();

        if(status){
            System.out.println("Loading home page");
        }else{
            throw new RuntimeException ("Connection is not founded");
        }
    }

    public void addNewBlank(){
        System.out.println("Adding new blank");
    }

    public void refreshPage(){
        boolean status = webConnection();

        if(status){
            System.out.println("Refreshing page");
        }else{
            throw new RuntimeException ("Connection is not founded");
        }
    }

}
