import java.io.Serializable;
import java.util.Arrays;

public class Account implements Serializable {
    private String id;
    private String password;
    private Step[] steps;
    private String serverIp;
    private String serverPort;
    private int delay;
    public Account(String id, String password, String serverIp, String serverPort, int delay, Step[] steps) {
        this.id = id;
        this.password = password;
        this.steps = steps;
        this.serverIp = serverIp;
        this.serverPort = serverPort;
        this.delay = delay;
    }

    public String toString() {
        return id + " " + password + " " + serverIp + " " + serverPort + " " + Arrays.toString(steps);
    }
    public Step[] getSteps(){
        return this.steps;
    }

    public int getDelay() {
        return delay;
    }
}
