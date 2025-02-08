package sweetopia.raft;

public class LogEntry {
    private String command;
    private int term;
    private int index;

    public LogEntry(String command, int term, int index) {
        this.command = command;
        this.term = term;
        this.index = index;
    }

    // Getters
    public String getCommand() {
        return command;
    }

    public int getTerm() {
        return term;
    }

    public int getIndex() {
        return index;
    }
}
