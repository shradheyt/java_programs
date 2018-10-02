package com.shradhey.Composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        getTheCase().pressPOwerButton();
        drawLogo();
    }
    private void drawLogo() {
        getMonitor().drawPixelAt(1200,50,"yellow");
        getMotherboard().loadProgram("WIndows 1.0");
    }
    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
