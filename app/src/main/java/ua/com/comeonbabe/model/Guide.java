package ua.com.comeonbabe.model;

import ua.com.comeonbabe.R;

/**
 * Created by Lisa on 2/16/2017.
 */

public class Guide {
    private String name;
    private int cartoonId;

    public Guide(String name, int cartoonId) {
        this.name = name;
        this.cartoonId = cartoonId;
    }

    public static final Guide[] guide = {
            new Guide("When to have sex if you want to get pregnant",R.drawable.blue),
                    new Guide("Sex positions for getting pregnant", R.drawable.babe),
                    new Guide("Get Pregnant Faster: Your 7-Step Plan", R.drawable.image),
                    new Guide("Trying to Conceive: 12 Tips for Women", R.drawable.inmom),
                    new Guide("How to Get Pregnant Quickly", R.drawable.commingsoon)
    };

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Guide{");
        sb.append("cartoonId=").append(cartoonId);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getCartoonId() {
        return cartoonId;
    }

    public static Guide[] getGuide() {
        return guide;
    }

    public String getName() {
        return name;
    }
}