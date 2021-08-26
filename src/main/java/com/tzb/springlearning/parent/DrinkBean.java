package com.tzb.springlearning.parent;

/**
 * Create by zhatang on 2021/6/16.
 */
public class DrinkBean {
    private String thing;
    private DrinkContainBean drinkContainBean;


    public String getThing() {
        return thing;
    }

    public void setThing(String name) {
        this.thing = name;
    }

    public DrinkContainBean getDrinkContainBean() {
        return drinkContainBean;
    }

    public void setDrinkContainBean(DrinkContainBean drinkContainBean) {
        this.drinkContainBean = drinkContainBean;
    }

    public void drink() {
        drinkContainBean.drink(thing);
    }
}
