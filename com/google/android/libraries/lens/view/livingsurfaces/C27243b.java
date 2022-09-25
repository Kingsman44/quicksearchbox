package com.google.android.libraries.lens.view.livingsurfaces;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.p033v7.widget.AppCompatImageView;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.b */
/* compiled from: PG */
public final class C27243b extends AppCompatImageView {
    public C27243b(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        C2043bi.m5548ab(this, f * 4.0f);
        C2043bi.m5530X(this, shapeDrawable);
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
