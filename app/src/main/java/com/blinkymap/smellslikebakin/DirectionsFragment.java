package com.blinkymap.smellslikebakin;

/**
 * Created by markw on 1/19/2018.
 */

public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}
