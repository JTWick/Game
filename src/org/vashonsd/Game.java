package org.vashonsd;
import java.time.LocalDate;

public class Game {
    String name;
    LocalDate release;
    platform type;
    boolean retro;


    enum platform {
        PC,
        PLAYSTATION,
        SWITCH,
        XBOX
    }

    public Game(String name, LocalDate release, Game.platform type) {
        this.name = name;
        this.release = release;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public Game.platform getType() {
        return type;
    }

    public void setType(Game.platform type) {
        this.type = type;
    }

    public boolean isRetro() {
        return retro;
    }

    public void setRetro(boolean retro) {
        this.retro = retro;
    }

    public int getYearsSinceRelease() {
        LocalDate now = LocalDate.now();
        now.getYear();
        now.getMonthValue();
        if(now.getMonthValue() >= release.getMonthValue()) {
            return now.getYear() - release.getYear();
        }
        return now.getYear() - release.getYear() -1;
    }

    public boolean retro() {
        if(getYearsSinceRelease() >= 15) {
            return true;
        }
        return false;
    }

}
