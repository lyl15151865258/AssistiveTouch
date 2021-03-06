package com.slc.assistivetouch.model.payment;

import java.io.Serializable;

public class FastPaymentPo implements Serializable{
    private int icon;
    private int name;

    public FastPaymentPo(int icon, int name) {
        this.icon = icon;
        this.name = name;
    }

    public int getIcon() {
        return this.icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getName() {
        return this.name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
