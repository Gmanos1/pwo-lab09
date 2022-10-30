package pwo.lab09.factory;

public class Sunday implements MessageFactory {

    @Override

    public String createIntroMessage() {

        return "Będzie rosół z kury i schaboszczaki.";

    }

    @Override

    public String createMainMessage() {

        return "Jeszcze chwila odpoczynku.";

    }

    @Override

    public String createClosingMessage() {

        return "Eh, jutro znowu do roboty.";

    }
}
