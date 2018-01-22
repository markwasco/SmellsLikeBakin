package com.blinkymap.smellslikebakin;

/**
 * Created by markw on 1/21/2018.
 */

class GridAdapter extends RecyclerAdapter {

    private final GridFragment.OnRecipeSelectedInterface mListener;

    public GridAdapter(GridFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }

    @Override
    protected int GetLayoutId() {
        return R.layout.grid_item;
    }
    @Override
    protected void onRecipeSelected(int index) {
        mListener.onGridRecipeSelected(index);
    }
}

