package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;

/* renamed from: com.google.android.material.internal.at */
/* compiled from: PG */
public class C44721at extends FrameLayout {

    /* renamed from: a */
    public Drawable f116574a;

    /* renamed from: b */
    Rect f116575b;

    /* renamed from: c */
    public boolean f116576c;

    /* renamed from: d */
    public boolean f116577d;

    /* renamed from: e */
    private Rect f116578e;

    public C44721at(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo48029a(C2082cp cpVar) {
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f116575b != null && this.f116574a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f116576c) {
                this.f116578e.set(0, 0, width, this.f116575b.top);
                this.f116574a.setBounds(this.f116578e);
                this.f116574a.draw(canvas);
            }
            if (this.f116577d) {
                this.f116578e.set(0, height - this.f116575b.bottom, width, height);
                this.f116574a.setBounds(this.f116578e);
                this.f116574a.draw(canvas);
            }
            this.f116578e.set(0, this.f116575b.top, this.f116575b.left, height - this.f116575b.bottom);
            this.f116574a.setBounds(this.f116578e);
            this.f116574a.draw(canvas);
            this.f116578e.set(width - this.f116575b.right, this.f116575b.top, width, height - this.f116575b.bottom);
            this.f116574a.setBounds(this.f116578e);
            this.f116574a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f116574a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f116574a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public C44721at(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C44721at(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f116578e = new Rect();
        this.f116576c = true;
        this.f116577d = true;
        TypedArray a = C44733be.m79295a(context, attributeSet, C44717ap.f116569c, i, 2132151251, new int[0]);
        this.f116574a = a.getDrawable(0);
        a.recycle();
        setWillNotDraw(true);
        C2043bi.m5555ai(this, new C44720as(this));
    }
}
