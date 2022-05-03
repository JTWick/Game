package org.vashonsd;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
	    Game g = new Game("Craftmine", LocalDate.of(1965, 5, 5), Game.platform.XBOX);
        System.out.println(g.getName());
        System.out.println(g.getRelease());
        System.out.println(g.getType());
        System.out.println(g.getYearsSinceRelease());
    }
}
