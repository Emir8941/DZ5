package com.company;

public class Hero {


    private int health;
    private int damage;
    private String superApply;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperApply() {
        return superApply;
    }

    public void setSuperApply(String superApply) {
        this.superApply = superApply;
    }

    public Hero(int health, int damage) {


        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage, String superApply) {
        this.health = health;
        this.damage = damage;
        this.superApply = superApply;

    }


}
