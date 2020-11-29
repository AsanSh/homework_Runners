package com.company;

public class Main {

    public static void main(String[] args) {
        Runners runner1 = new Runners("Runner 1",
                new Runners("Runner 2",
                        new Runners("Runner 3",
                                new Runners("Runner 4",
                                        new Runners("Runner 5",
                                                new Runners("Runner 4",
                                                        new Runners("Runner 3",
                                                                new Runners("Runner 2",
                                                                        new Runners("Runner 1")))))))));
        runner1.start();
    }
}

