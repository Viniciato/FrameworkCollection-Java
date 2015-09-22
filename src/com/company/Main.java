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
            if (name.startsWith("I"))
                it.remove();
            else
                System.out.println(name);
        }
        System.out.println(mc.contains("Insano"));
        //Teste para ver se contem dentro da collection a string
        //pasada por parametro




//        it = mc.iterator();
//
//        System.out.println("------------");
//
//        while (it.hasNext()) {
//
//            System.out.println(it.next());
//
//        }


//        it.remove();
//        it.remove();


    }
}
