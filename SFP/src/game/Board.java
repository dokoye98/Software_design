package game;

import interfaces.BoardInterFace;

import java.util.ArrayList;
import java.util.List;

public class Board implements BoardInterFace {
    List<String> spots;

    @Override
    public void initialiseBoard() {
        this.spots = new ArrayList<>();
        for(int i = 0; i <9;i++){
            this.spots.add(String.valueOf(i));
        }

    }
    @Override
    public List<String> firstRow() {
        List<String> firstRow = new ArrayList<>();
        for(int i = 0;i<3;i++ ){
            firstRow.add(this.spots.get(i));
        }
        return firstRow;
    }



    @Override
    public List<String> secondRow() {
        return null;
    }

    @Override
    public List<String> thirdRow() {
        return null;
    }
    @Override
    public void display() {

    }
}
