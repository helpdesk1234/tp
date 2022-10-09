package seedu.duke.user;

import seedu.duke.module.Module;

public class UserModule extends Module {
    private String nusCode;
    private String puCode;
    private String nusTitle;
    private String nusCredit;
    private String puTitle;

    private String comment;

    public UserModule(String puCode, String puTitle, String nusCode, String nusTitle, String nusCredit) {
        super(nusCode, nusTitle, nusCredit);
        this.nusCode = nusCode;
        this.puCode = puCode;
        this.nusTitle = nusTitle;
        this.nusCredit = nusCredit;
        this.puTitle = puTitle;
    }

    public String getNusCode() {
        return nusCode;
    }

    public String getPuCode() {
        return puCode;
    }

    public String getNusTitle() {
        return nusTitle;
    }

    public String getNusCredit() {
        return nusCredit;
    }

    public String getPuTitle() {
        return puTitle;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setNusCode(String nusCode) {
        this.nusCode = nusCode;
    }

    public void setPuCode(String puCode) {
        this.puCode = puCode;
    }

    public void setNusTitle(String nusTitle) {
        this.nusTitle = nusTitle;
    }

    public void setNusCredit(String nusCredit) {
        this.nusCredit = nusCredit;
    }

    public void setPuTitle(String puTitle) {
        this.puTitle = puTitle;
    }

    public String toString() {
        return getNusCode() + " " + getNusTitle() + " "
                + getPuCode() + " " + getPuTitle() + " " + getNusCredit() + " MCs";
    }

    public void printModule() {
        System.out.print("NUS: ");
        System.out.print(getNusCode() + " " + getNusTitle());
        System.out.print(" | Partner University: ");
        System.out.print(getPuCode() + " " + getPuTitle());
        System.out.println(" | Equivalent NUS Credits: " + getNusCredit());
    }
}
