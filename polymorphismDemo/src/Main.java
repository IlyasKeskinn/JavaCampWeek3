public class Main {

    public static void main(String[] args) {

        BaseLogger[] baseLoggers = new BaseLogger[]{new ConsoleLogger(),new DatabaseLogger(),new FileLogger(),new MailLogger()};

        for (BaseLogger baseLogger: baseLoggers){
            baseLogger.log("Log msg");
        }


        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
        customerManager.add();

    }
}
