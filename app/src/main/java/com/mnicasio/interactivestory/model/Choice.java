package com.mnicasio.interactivestory.model;

/**
 * Created by mnicasio on 1/12/18.
 */

public class Choice {
    private int textId;
    private int nextPage;

    public int getTextId(){
        return textId;
    }

    public void setTextId(int textId){
        this.textId = textId;
    }

    public Choice(int textId, int nextPage) {
        this.textId = textId;
        this.nextPage = nextPage;
    }

    public int getNextPage() {

        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
