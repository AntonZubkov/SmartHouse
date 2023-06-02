package ru.netology.stats;

public class Radio {

    private int currentVolume;
    private int radioStationNumber;

    public void next() {
        if (radioStationNumber != 9) {
            radioStationNumber++;
        } else {
            radioStationNumber = 0;
        }
    }

    public void prev() {
        if (radioStationNumber != 0) {
            radioStationNumber--;
        } else {
            radioStationNumber = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > 9) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }
}
