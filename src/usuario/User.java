package usuario;

import usuario.iphone.Iphone;

public class User {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //music
        iphone.play();
        iphone.pause();
        iphone.selectMusic();

        //phone
        iphone.call();
        iphone.awswer();
        iphone.voiceMenssage();

        //browser
        iphone.loadHomePage();
        iphone.addNewBlank();
        iphone.refreshPage();

    }
}
