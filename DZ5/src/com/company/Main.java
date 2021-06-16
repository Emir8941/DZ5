package com.company;


public class Main {


    public static void main(String[] args) {
        System.out.println("_______________________");

        for (Hero hero : createHeroes()) {
            System.out.println("Health:"+hero.getHealth()+" "+"Damage:"+ hero.getDamage()+" "+"Super" + hero.getSuperApply());


        }


        System.out.println("_______________________");
        Boss boss = new Boss();
        boss.setSupersS("SuperAttack");
        boss.setDamage(125);
        boss.setHealth(765);
        System.out.println("Health:" + boss.getHealth() + " " + "Damage:" + boss.getDamage() + " " + "Super:" + boss.getSupersS());


    }


    public static Hero[] createHeroes() {


        Hero thor = new Hero(300, 30);
        Hero magic = new Hero(250, 15);
        Hero medic = new Hero(190,5,"heal");


        return new Hero[]{thor, magic, medic};


    }

}









