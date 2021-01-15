package com.shengde.e3mall.common.pojo;

import java.io.Serializable;

public class EasyUITreeNode implements Serializable {

    private long id;
    private String text;

    private boolean state;

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
