package game;

import interfaces.BoardInterFace;

import java.util.ArrayList;
import java.util.List;

public class Board implements BoardInterFace {
    public List<String> spots;

    @Override
    public void initialiseBoard() {
        this.spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }

    }

    @Override
    public List<String> firstRow() {
        initialiseBoard();
        List<String> firstRow = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            firstRow.add(this.spots.get(i));
        }
        return firstRow;
    }


    @Override
    public List<String> secondRow() {
        List<String> secondRow = new ArrayList<>();
        for (int i = 3; i < 6; i++) {
            secondRow.add(this.spots.get(i));
        }
        return secondRow;
    }

    @Override
    public List<String> thirdRow() {
        List<String> thirdRow = new ArrayList<>();
        for (int i = 6; i < 9; i++) {
            thirdRow.add(this.spots.get(i));
        }
        return thirdRow;
    }

    @Override
    public void display() {
        StringBuilder formattedRow = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            formattedRow.append(this.spots.get(i));
            if ((i + 1) % 3 != 0 && i != 8) {
                formattedRow.append(" | ");
            } else if (i != 8) {
                formattedRow.append(" ");
            }

            if ((i + 1) % 3 == 0 && i !=8) {
                formattedRow.append("\n");
            }
        }

        System.out.print(formattedRow.toString());
    }
}