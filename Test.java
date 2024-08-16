// import java.util.ArrayList;

import Main.Castle.*;
import Main.Monster.*;
import Main.Player.*;
import Main.ScoreBoard.ScoreBoard;
import Main.Tower.*;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        // NormalMonster gilbert = new NormalMonster();
        RapidMonster michel = new RapidMonster();
        JumperMonster bunny = new JumperMonster();
        Castle myCastle = new Castle("Mycastle");
        BossMonster bigboss = new BossMonster();
        ScoreBoard myscore = new ScoreBoard();
        // MapUI mapui = new MapUI();
        // NormalTower tower = new NormalTower();
        Player myplayer = null;
        myplayer = new Player("Michel", myCastle);

        System.out.println(myplayer.getCastle().getHp());

        // Map2 map = new
        // Map2._map[michel.getCoordY()][michel.getCoordX()] = 5;
        // michel.autoMove();
        // Map2._map[michel.getCoordY()][michel.getCoordX()] = 5;
        // map.printMap();Map2();
        // michel.LearnMap(Map2._map);
        // bunny.LearnMap(Map2._map);
        // bigboss.LearnMap(Map2._map);

        // myplayer.setScore(490);

        // myscore.writeAndOrder(myplayer.getName(), myplayer.getScore());
        // Création de la fenêtre
        JFrame fenetre = new JFrame("Fenêtre Basique");

        // Définition de la taille de la fenêtre
        fenetre.setSize(400, 300);

        // Opération par défaut lorsque la fenêtre est fermée
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        // myscore.ShowRecords("./scoreboard", fenetre);

        fenetre.setVisible(true);
    }

    // AMonster[] mylist = new AMonster[3];

    // michel.setCoordX(0);
    // michel.setCoordY(3);
    // bunny.setCoordX(3);
    // bunny.setCoordY(4);
    // bigboss.setCoordX(5);
    // bigboss.setCoordY(3);
    // mylist[0] = michel;
    // mylist[1] = bunny;
    // mylist[2] = bigboss;

    // System.out.println(tower.getTowerPosition().getY());
    // System.out.println(tower.getTowerPosition().getX());
    // Map2._map[tower.getTowerPosition().getY()][tower.getTowerPosition().getX()] =
    // 5;
    // Map2._map[michel.getCoordY()][michel.getCoordX()] = 5;
    // Map2._map[bunny.getCoordY()][bunny.getCoordX()] = 5;
    // Map2._map[bigboss.getCoordY()][bigboss.getCoordX()] = 5;

    // try {
    // tower.attack(mylist);
    // } catch (NoTargetFoundException e) {
    // System.out.println("Exeception caught:" + e.getMessage());
    // }

    // Wave myWave = new Wave();
    // for (int i = 0; i <= 10; i++) {
    // System.out.println(myWave.getNbwave());
    // myWave.createwave();
    // myWave.printarray();

    // }
    // ArrayList<AMonster> truc = myWave.getMywave();
    // AMonster gilbert = truc.get(0);

    // System.out.println(gilbert.getClass());

    // michel.LearnMap(Map2._map);
    // michel.setCoordY(4);
    // michel.setCoordX(8);
    // Map2._map[michel.getCoordY()][michel.getCoordX()] = "x";
    // if(michel.attack(myCastle)){
    // System.out.println("ok");
    // }
    // System.out.println("les hp du chateau " + myCastle.getHp());
    // map.printMap();

    // bunny.LearnMap(Map2._map);
    // Map2._map[bunny.getCoordY()][bunny.getCoordX()] = "x";

    // while (itsok == true) {
    // if (bunny.move() == true) {
    // itsok = true;
    // Map2._map[bunny.getCoordY()][bunny.getCoordX()] = "x";
    // i++;
    // } else {
    // itsok = false;
    // i++;
    // }
    // }

    // map.printMap();

    // didier.setCoordX(0);

    // MapUI._map[michel.getCoordY()][michel.getCoordX()] = "x";
    // mapui.printMap();

    // for (int i = 0; i < 13; i++) {
    // michel.move();

    // mapui.insert_and_updateMap(michel);
    // }
    // MapUI._map[michel.getCoordY()][michel.getCoordX()] = "x";
    // mapui.printMap();

    // for (int[] value : MapUI._posMonsters.values()) {

    // for (int i = 0; i < value.length; i++) {
    // System.out.println(value[i]);
    // }
    // }

    // for (String name : MapUI._posMonsters.keySet()) {
    // System.out.println(name);
    // }
}
