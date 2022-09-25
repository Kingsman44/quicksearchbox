package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.google.android.setupdesign.C45318g;

/* compiled from: PG */
public class Illustration extends FrameLayout {

    /* renamed from: a */
    public float f118412a = 0.0f;

    /* renamed from: b */
    private float f118413b;

    /* renamed from: c */
    private Drawable f118414c;

    /* renamed from: d */
    private Drawable f118415d;

    /* renamed from: e */
    private final Rect f118416e = new Rect();

    /* renamed from: f */
    private final Rect f118417f = new Rect();

    /* renamed from: g */
    private float f118418g = 1.0f;

    public Illustration(Context context) {
        super(context);
        m80784b((AttributeSet) null, 0);
    }

    /* renamed from: b */
    private final void m80784b(AttributeSet attributeSet, int i) {
        if (!isInEditMode()) {
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C45318g.f118391j, i, 0);
                this.f118412a = obtainStyledAttributes.getFloat(0, 0.0f);
                obtainStyledAttributes.recycle();
            }
            this.f118413b = getResources().getDisplayMetrics().density * 8.0f;
            setWillNotDraw(false);
        }
    }

    /* renamed from: c */
    private static final boolean m80785c(Drawable drawable, int i) {
        if (i == 1) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo49257a(Drawable drawable) {
        if (drawable != this.f118415d) {
            this.f118415d = drawable;
            invalidate();
            requestLayout();
        }
    }

    public final void onDraw(Canvas canvas) {
        if (this.f118414c != null) {
            canvas.save();
            canvas.translate(0.0f, (float) this.f118417f.height());
            float f = this.f118418g;
            canvas.scale(f, f, 0.0f, 0.0f);
            if (m80785c(this.f118414c, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.f118414c.getBounds().width()), 0.0f);
            }
            this.f118414c.draw(canvas);
            canvas.restore();
        }
        if (this.f118415d != null) {
            canvas.save();
            if (m80785c(this.f118415d, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.f118417f.width()), 0.0f);
            }
            this.f118415d.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Drawable drawable = this.f118415d;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f118415d.getIntrinsicHeight();
            this.f118416e.set(0, 0, i5, i6);
            if (this.f118412a != 0.0f) {
                float f = ((float) i5) / ((float) intrinsicWidth);
                this.f118418g = f;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
                intrinsicWidth = i5;
            }
            Gravity.apply(55, intrinsicWidth, intrinsicHeight, this.f118416e, this.f118417f);
            this.f118415d.setBounds(this.f118417f);
        }
        Drawable drawable2 = this.f118414c;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, (int) Math.ceil((double) (((float) i5) / this.f118418g)), (int) Math.ceil((double) (((float) (i6 - this.f118417f.height())) / this.f118418g)));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f118412a != 0.0f) {
            float size = (float) ((int) (((float) View.MeasureSpec.getSize(i)) / this.f118412a));
            setPadding(0, (int) (size - (size % this.f118413b)), 0, 0);
        }
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        super.onMeasure(i, i2);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != this.f118414c) {
            this.f118414c = drawable;
            invalidate();
            requestLayout();
        }
    }

    @Deprecated
    public final void setForeground(Drawable drawable) {
        mo49257a(drawable);
    }

    public Illustration(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80784b(attributeSet, 0);
    }

    public Illustration(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m80784b(attributeSet, i);
    }
}
