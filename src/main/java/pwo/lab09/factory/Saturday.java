package pwo.lab09.factory;

public class Saturday implements MessageFactory {

    @Override

    public String createIntroMessage() {

        return "ŁIKKKKKKKKKEND";

    }

    @Override

    public String createMainMessage() {

        return "Pół domu już wysprzątane.";

    }

    @Override

    public String createClosingMessage() {

        return "Można odpocząć.";

    }
}
