package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;
import androidx.swiperefreshlayout.C4171a;

/* renamed from: androidx.swiperefreshlayout.widget.a */
/* compiled from: PG */
public final class C4172a extends ImageView {

    /* renamed from: a */
    public Animation.AnimationListener f13533a;

    /* renamed from: b */
    private int f13534b;

    public C4172a(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C4171a.f13490a);
        this.f13534b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        C2043bi.m5548ab(this, f * 4.0f);
        shapeDrawable.getPaint().setColor(this.f13534b);
        C2043bi.m5530X(this, shapeDrawable);
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f13533a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f13533a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f13534b = i;
        }
    }
}
