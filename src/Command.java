import java.io.Serializable;

public class Command<T, P> implements Serializable {
    private String commandname;
    private T argument;
    private P additional;

    public Command(String name, T argument) {
        this.commandname = name;
        this.argument = argument;
    }

    public Command() {
        this.commandname = null;
        this.argument = null;
        this.additional = null;
    }


    public String getCommandname() {
        return commandname;
    }

    public void setCommandname(String commandname) {
        this.commandname = commandname;
    }

    public T getArgument() {
        return argument;
    }

    public void setArgument(T argument) {
        this.argument = argument;
    }

    public P getAdditional() {
        return additional;
    }

    public void setAdditional(P additional) {
        this.additional = additional;
    }

    public void setEverything(String commandname, T argument) {
        setCommandname(commandname);
        setArgument(argument);
    }
}
