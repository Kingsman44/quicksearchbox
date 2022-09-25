package com.google.android.libraries.lens.view.filters;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: PG */
public final class FilterPreview extends LinearLayout {

    /* renamed from: a */
    public C26015l f70216a;

    /* renamed from: b */
    public C26014k f70217b;

    /* renamed from: c */
    public Runnable f70218c;

    /* renamed from: d */
    public PointF f70219d = new PointF();

    public FilterPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo30988a() {
        this.f70216a.f70698c.animate().cancel();
        this.f70216a.f70698c.removeCallbacks(this.f70218c);
        this.f70216a.f70698c.setAlpha(0.0f);
    }

    /* renamed from: b */
    public final void mo30989b() {
        setTranslationX(this.f70219d.x - (((float) this.f70216a.f70698c.getWidth()) * 0.5f));
        setTranslationY(this.f70219d.y - (((float) this.f70216a.f70698c.getHeight()) * 0.5f));
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f70216a = new C26015l(this);
        this.f70217b = new C26014k(getResources());
        this.f70218c = new C26013j(this);
        this.f70216a.f70698c.setAlpha(0.0f);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo30989b();
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            mo30988a();
        }
    }
}
