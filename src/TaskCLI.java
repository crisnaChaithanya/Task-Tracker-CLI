public class TaskCLI {
    public static void main(String[] args){

        if (args.length < 1) {
            System.out.println("Usage: java TaskTracker <command> [args]");
            return;
        }

        switch (args[0]){
            case "add" :
                if(args.length == 2){
                    System.out.println("adding task : "+args[1]);
                }
                else if(args.length == 1){
                    System.out.println("you didnt enter the task");
                }
                break;
            case "list" :
                System.out.println("listing all tasks");
                break;
            default:
                System.out.println("unknown command");
        }
    }
}