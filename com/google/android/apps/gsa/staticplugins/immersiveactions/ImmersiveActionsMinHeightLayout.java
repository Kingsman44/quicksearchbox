package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ImmersiveActionsMinHeightLayout extends LinearLayout {

    /* renamed from: a */
    private int f285751a;

    public ImmersiveActionsMinHeightLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo93199a() {
        int y;
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && i < (y = ((int) childAt.getY()) + childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin)) {
                i = y;
            }
        }
        return i;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.gsa_immersive_actions_header_height);
        this.f285751a = mo93199a() + dimensionPixelSize + dimensionPixelSize;
        if (getMeasuredHeight() < this.f285751a) {
            setMeasuredDimension(getMeasuredWidth(), this.f285751a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.gsa_immersive_actions_header_height);
        this.f285751a = getRootView().getHeight() + dimensionPixelSize + dimensionPixelSize;
    }

    public ImmersiveActionsMinHeightLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImmersiveActionsMinHeightLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
