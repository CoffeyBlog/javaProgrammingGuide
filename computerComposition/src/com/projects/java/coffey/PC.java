package com.projects.java.coffey;

public class PC {

    // What composition has allowed us to do us create data types that are essentially "classes" which makes our program
    // much more powerful and also allows us to be a lot more direct in telling our program what to do.

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;



    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy Graphics
        monitor.drawPixelAt(1200, 50, "Yellow");
    }




}



