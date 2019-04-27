package me.gvillalta99;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class Application {

    public static void main (String[] args) {
        System.out.println("Hello from Java");
    }

    public int test () {
        return 10;
    }

    public String[] useUtil () {
        IFn someUsefulFn = Clojure.var("util", "some-useful-fn");
        return someUsefulFn.invoke("test-str");
    }
}
