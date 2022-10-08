public class ConsoleLogger extends  BaseLogger {

    public void log(String msg){
        System.out.println("Logged the console: " + msg);
    }

}
