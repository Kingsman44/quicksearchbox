package com.android.launcher3;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.FrameLayout;

/* compiled from: PG */
public class CheckableFrameLayout extends FrameLayout implements Checkable {
    private static final int[] CHECKED_STATE_SET = {16842912};
    boolean mChecked;

    public CheckableFrameLayout(Context context) {
        super(context);
    }

    public final boolean isChecked() {
        return this.mChecked;
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.mChecked) {
            mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    public final void setChecked(boolean z) {
        if (z != this.mChecked) {
            this.mChecked = z;
            refreshDrawableState();
        }
    }

    public final void toggle() {
        setChecked(!this.mChecked);
    }

    public CheckableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
