package com.company;

public class Runners extends Thread {
    Runners runner;

    public Runners(String name, Runners runner) {
        super(name);
        this.runner = runner;
    }

    public Runners(String name) {
        super(name);
    }


    public void run() {
        if (runner != null) {
            try {
            sleep(1000);
                runner.start();
            } catch (NullPointerException | InterruptedException e) {
                e.printStackTrace();
            }
            if (this.getName().equals("Runner 5")) {
                System.out.println("\n" + this.getName() + " берет палочку");
                System.out.println(this.getName() + " бежит к финишу");
                System.out.println(this.getName() + " бежит к  " + runner.getName());
            } else {
                System.out.println("\n" + this.getName() + " берет палочку");
                System.out.println(this.getName() + " бежит к  " + runner.getName());
            }

            if (runner.getName().equals("Runner 1")) {
                System.out.println("\n" + runner.getName() + " берет палочку");
                System.out.println(runner.getName() + " бежит к финишу");
            }
        }
    }
}


