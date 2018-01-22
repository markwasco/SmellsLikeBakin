package com.blinkymap.smellslikebakin;

/**
 * Created by markw on 1/19/2018.
 */

public class IngredientsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
