package com.smartisanos.sidebar.view;

import com.smartisanos.sidebar.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SwitchAppView extends LinearLayout {

    private View mDivider;
    private View mIconView;

    public SwitchAppView(Context context) {
        this(context, null);
    }

    public SwitchAppView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SwitchAppView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public SwitchAppView(Context context, AttributeSet attrs, int defStyleAttr,
            int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mDivider = findViewById(R.id.divider);
        mIconView = findViewById(R.id.view_icon);
    }

    public View getIconView() {
        return mIconView;
    }

    public View getDivider() {
        return mDivider;
    }

    public void setDividerVisibility(int visibility) {
        mDivider.setVisibility(visibility);
    }
}
