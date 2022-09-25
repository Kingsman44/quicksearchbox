package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0597dm;
import android.util.AttributeSet;
import android.view.Gravity;

/* renamed from: com.google.android.material.internal.o */
/* compiled from: PG */
public class C44755o extends C0597dm {

    /* renamed from: a */
    protected boolean f116689a;

    /* renamed from: b */
    boolean f116690b;

    /* renamed from: c */
    private Drawable f116691c;

    /* renamed from: d */
    private final Rect f116692d;

    /* renamed from: e */
    private final Rect f116693e;

    /* renamed from: f */
    private int f116694f;

    public C44755o(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f116691c;
        if (drawable != null) {
            if (this.f116690b) {
                this.f116690b = false;
                Rect rect = this.f116692d;
                Rect rect2 = this.f116693e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f116689a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f116694f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f116691c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f116691c;
        if (drawable != null && drawable.isStateful()) {
            this.f116691c.setState(getDrawableState());
        }
    }

    public final Drawable getForeground() {
        return this.f116691c;
    }

    public final int getForegroundGravity() {
        return this.f116694f;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f116691c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f116690b = z | this.f116690b;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f116690b = true;
    }

    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f116691c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f116691c);
            }
            this.f116691c = drawable;
            this.f116690b = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f116694f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public final void setForegroundGravity(int i) {
        if (this.f116694f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f116694f = i;
            if (i == 119 && this.f116691c != null) {
                this.f116691c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f116691c;
    }

    public C44755o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C44755o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f116692d = new Rect();
        this.f116693e = new Rect();
        this.f116694f = 119;
        this.f116689a = true;
        this.f116690b = false;
        TypedArray a = C44733be.m79295a(context, attributeSet, C44717ap.f116568b, i, 0, new int[0]);
        this.f116694f = a.getInt(1, this.f116694f);
        Drawable drawable = a.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f116689a = a.getBoolean(2, true);
        a.recycle();
    }
}
