package meili.eryi;

import java.util.Date;

public enum Enumtest {
    HUOJIAN(new Date(),"火箭",2),
    HUREN(new Date(),"湖人",6);

    private Date time;
    private String name;
    private int number;

    Enumtest(Date time, String name, int number) {
        this.time = time;
        this.name = name;
        this.number = number;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
