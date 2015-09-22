package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        MyCollection mc = new MyCollection();

        mc.add("Bandido");
        mc.add("Bodacious");
        mc.add("Mascherano");
        mc.add("Destruidor");
        mc.add("Insano");
        mc.add("Juízo Final");
        mc.add("Tsunami");

        Iterator<String> it = mc.iterator();

        while (it.hasNext()) {
            String name = it.next();
            if (name.startsWith("B"))
                it.remove();
            System.out.println(name);
        }

        it = mc.iterator();

        System.out.println("------------");

        while (it.hasNext()) {

            System.out.println(it.next());

        }
//        it.remove();
//        it.remove();
//        System.out.println(mc.contains("Destruidor"));


    }
}
