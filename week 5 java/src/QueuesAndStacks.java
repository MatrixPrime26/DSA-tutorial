//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.LinkedList;
import java.util.Queue;
public class QueuesAndStacks {
    public static void main(String[] args) {
        System.out.println("First a Queue...");
        Queue<String> q = new LinkedList<>();

        String[] data = new String[] { "tom", "jerry", "sylvestor" };

        for (String e : data) {
            q.add(e);
        }

        System.out.println(q);
        String item = q.remove();
        System.out.println("Removed " + item);
        System.out.println(q);

        q.add("goofy");
        q.add("pluto");

        System.out.println(q);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
        System.out.println("Now a stack...");

        Deque<String> s = new LinkedList<>();
        for (String e : data) {
            s.push(e);
        }
        System.out.println(s);

    }
    }
