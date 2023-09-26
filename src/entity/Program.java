package entity;

public class Program {
    private long code;
    private String name;
    private int credit;

    public Program() {
    }

    public Program(long code, String name, int credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
