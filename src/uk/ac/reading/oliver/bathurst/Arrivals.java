package uk.ac.reading.oliver.bathurst;
import jcsp.lang.CSProcess;
import jcsp.lang.ints.One2OneChannelInt;

class Arrivals implements CSProcess {
    private One2OneChannelInt arrive;

    Arrivals(One2OneChannelInt arrive){
        this.arrive = arrive;
    }

    public void run() {
        while(true){
            arrive.write(2);
        }
    }
}