package com.example.android.AnnisaAninditya_1202152334_studycase5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DataKegiatan{
    String todo;
    String desc;
    String prior;

    public DataKegiatan(String todo, String desc, String prior){
        this.todo=todo;
        this.desc=desc;
        this.prior=prior;
    }

    //setter dan getter digunakan untuk to do deskripsi dan priotiritas
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }
}
