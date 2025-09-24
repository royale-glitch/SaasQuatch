import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name = "impact-cli",
    mixinStandardHelpOptions = true,
    version = "impact-cli 1.0",
    description = "Prints the company name."
)
public class ImpactCLI implements Runnable {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ImpactCLI()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        System.out.println("impact.com - SaaSquatch");
    }
}
