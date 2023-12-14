package workshop;

public class Worker {
    public static void main(String[] args) {
        Tool[] tools = {new Tool("Wkrętarka"), new Tool("Piła"), new Tool("Młotek")};

        for (Tool tool : tools) {
            tool.useTool();
        }
    }
}