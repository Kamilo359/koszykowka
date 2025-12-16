package com.example.z;
import androidx.lifecycle.ViewModel;
public class PunktyViewModel extends ViewModel {
    int punkty=0;
    public int getPunkty(){
        return punkty;
    }
    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }
    public void addPunkty(int x){
        punkty+=x;
    }
}
