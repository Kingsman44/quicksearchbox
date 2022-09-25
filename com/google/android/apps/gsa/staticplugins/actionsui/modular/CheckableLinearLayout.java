package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

/* compiled from: PG */
public class CheckableLinearLayout extends LinearLayout implements Checkable {

    /* renamed from: a */
    private static final int[] f261012a = {16842912};

    /* renamed from: b */
    private boolean f261013b = false;

    public CheckableLinearLayout(Context context) {
        super(context);
    }

    public final boolean isChecked() {
        return this.f261013b;
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f261013b) {
            mergeDrawableStates(onCreateDrawableState, f261012a);
        }
        return onCreateDrawableState;
    }

    public final void setChecked(boolean z) {
        this.f261013b = z;
        refreshDrawableState();
    }

    public final void toggle() {
        this.f261013b = !this.f261013b;
        refreshDrawableState();
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
