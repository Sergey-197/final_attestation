
import java.util.List;

public class Cat extends Animal {
    private List<String> commands;

    public Cat(String name, java.util.Date birthDate, List<String> commands) {
        super(name, birthDate);
        this.commands = commands;
    }

    // Геттеры и сеттеры
    public List<String> getCommands() { return commands; }
    public void addCommand(String command) { commands.add(command); }
}