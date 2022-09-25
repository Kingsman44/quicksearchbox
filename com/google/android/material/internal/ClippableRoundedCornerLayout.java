package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* renamed from: a */
    public Path f116514a;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f116514a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f116514a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
