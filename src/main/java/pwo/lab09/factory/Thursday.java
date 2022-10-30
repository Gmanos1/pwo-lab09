package pwo.lab09.factory;

public class Thursday implements MessageFactory {

    @Override

    public String createIntroMessage() {

        return "Czwartek, coraz bliżej łikend.";

    }

    @Override

    public String createMainMessage() {

        return "Czwartek mija w porządku.";

    }

    @Override

    public String createClosingMessage() {

        return "Jeszcze tylko jutro i koniec.";

    }
}
