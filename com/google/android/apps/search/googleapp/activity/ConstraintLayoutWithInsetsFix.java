package com.google.android.apps.search.googleapp.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
public final class ConstraintLayoutWithInsetsFix extends ConstraintLayout {

    /* renamed from: a */
    private View.OnApplyWindowInsetsListener f363409a;

    public ConstraintLayoutWithInsetsFix(Context context) {
        super(context);
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f363409a;
        if (onApplyWindowInsetsListener != null) {
            windowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f363409a = onApplyWindowInsetsListener;
    }

    public ConstraintLayoutWithInsetsFix(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConstraintLayoutWithInsetsFix(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
