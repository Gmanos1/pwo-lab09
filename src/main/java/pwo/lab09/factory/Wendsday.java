package pwo.lab09.factory;

public class Wendsday implements MessageFactory {

    @Override

    public String createIntroMessage() {

        return "Środa. Środek tygodnia, znowu do roboty";

    }

    @Override

    public String createMainMessage() {

        return "Eeeh";

    }

    @Override

    public String createClosingMessage() {

        return "Jeszcze tylko 2 dni.";

    }
}
