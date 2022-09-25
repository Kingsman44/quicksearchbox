package com.google.android.setupdesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

/* compiled from: PG */
public class CheckableLinearLayout extends LinearLayout implements Checkable {

    /* renamed from: a */
    private boolean f118406a = false;

    public CheckableLinearLayout(Context context) {
        super(context);
        setFocusable(true);
    }

    public final boolean isChecked() {
        return this.f118406a;
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        if (!this.f118406a) {
            return super.onCreateDrawableState(i);
        }
        return mergeDrawableStates(super.onCreateDrawableState(i + 1), new int[]{16842912});
    }

    public final void setChecked(boolean z) {
        this.f118406a = z;
        refreshDrawableState();
    }

    public final void toggle() {
        this.f118406a = !this.f118406a;
        refreshDrawableState();
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFocusable(true);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFocusable(true);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setFocusable(true);
    }
}
