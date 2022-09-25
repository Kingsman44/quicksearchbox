package com.google.android.libraries.componentview.components.p1693e.p1695b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.libraries.componentview.components.e.b.b */
/* compiled from: PG */
public final class C20356b extends ImageView {

    /* renamed from: a */
    public int f57237a;

    /* renamed from: b */
    public int f57238b;

    /* renamed from: c */
    private int f57239c;

    public C20356b(Context context) {
        super(context);
    }

    /* renamed from: c */
    private static GradientDrawable m38272c(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: a */
    public final void mo25378a(int i, int i2) {
        Drawable drawable;
        if (this.f57237a != i || this.f57238b != i2) {
            this.f57237a = i;
            this.f57238b = i2;
            GradientDrawable c = m38272c(i);
            try {
                drawable = (Drawable) Class.forName("android.graphics.drawable.RippleDrawable").getConstructor(new Class[]{ColorStateList.class, Drawable.class, Drawable.class}).newInstance(new Object[]{ColorStateList.valueOf(i2), c, null});
            } catch (Exception unused) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, m38272c(i2));
                stateListDrawable.addState(new int[0], m38272c(17170445));
                drawable = new LayerDrawable(new Drawable[]{c, stateListDrawable});
            }
            int paddingTop = getPaddingTop();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            setBackgroundDrawable(drawable);
            C2043bi.m5556aj(this, paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    /* renamed from: b */
    public final void mo25379b(int i) {
        this.f57239c = i;
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        requestLayout();
    }

    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = super.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.f57239c;
            layoutParams.width = this.f57239c;
        }
        return layoutParams;
    }
}
