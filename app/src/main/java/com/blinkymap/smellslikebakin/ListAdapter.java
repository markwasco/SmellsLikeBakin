package com.blinkymap.smellslikebakin;

/**
 * Created by markw on 1/5/2018.
 */

public class ListAdapter extends RecyclerAdapter {

    private final ListFragment.OnRecipeSelectedInterface mListener;

    public ListAdapter(ListFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }

    @Override
    protected int GetLayoutId() {
        return R.layout.list_item;
    }
    @Override
    protected void onRecipeSelected(int index) {
        mListener.OnListRecipeSelected(index);
    }
}
