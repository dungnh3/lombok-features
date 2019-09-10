package springboot.lombok.features.val;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @apiNote
 * val was introduced in lombok 0.10
 * You can use val as the type of a local variable declaration instead of actually writing the type. (Like Scala syntax)
 * When you do this, the type will be inferred from the initializer expression.
 * The local variable will also be made final.
 * This feature works on local variables and on foreach loops only, not on fields.
 * The initializer expression is required.
 */
public class ValSample {

    public static String sample() {
        val sample = new ArrayList<String>();
        sample.add("Hello, Worlds");
        val foo = sample.get(0);
        return foo.toLowerCase();
    }

    public static void sample2() {
        val map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        for (val item : map.entrySet()) {
            System.out.println(String.format("%d: %s", item.getKey(), item.getValue()));
        }
    }

    public static void main(String[] args) {
        System.out.println(sample());
        sample2();
    }
}
