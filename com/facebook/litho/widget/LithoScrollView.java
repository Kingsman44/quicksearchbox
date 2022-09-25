package com.facebook.litho.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.facebook.litho.C6132bm;
import com.facebook.litho.C6169cq;
import com.facebook.litho.LithoView;
import java.util.List;

/* compiled from: PG */
public class LithoScrollView extends NestedScrollView implements C6169cq {

    /* renamed from: e */
    public final LithoView f19032e;

    /* renamed from: f */
    public C6533ek f19033f;

    /* renamed from: g */
    public ViewTreeObserver.OnPreDrawListener f19034g;

    /* renamed from: h */
    public boolean f19035h;

    /* renamed from: i */
    public C6551p f19036i;

    /* renamed from: j */
    private C6132bm f19037j;

    public LithoScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo13143a(List list) {
        list.add(this.f19032e);
    }

    /* renamed from: b */
    public final C6132bm mo12667b() {
        return this.f19037j;
    }

    /* renamed from: c */
    public final void mo5293c(int i) {
        super.mo5293c(i);
        C6551p pVar = this.f19036i;
        if (pVar != null) {
            pVar.f19516b = true;
        }
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f6033c.mo5281c(f, f2, true);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C6132bm bmVar = this.f19037j;
        if (bmVar != null) {
            bmVar.mo13114a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        C6551p pVar = this.f19036i;
        if (pVar != null) {
            pVar.mo13644a(this);
        }
    }

    /* renamed from: m */
    public final void mo12684m(C6132bm bmVar) {
        this.f19037j = bmVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f19035h) {
            this.f19032e.mo12649u();
        }
        C6533ek ekVar = this.f19033f;
        if (ekVar != null) {
            ekVar.f19455a = getScrollY();
        }
        C6551p pVar = this.f19036i;
        if (pVar != null) {
            pVar.mo13645b(this);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C6551p pVar = this.f19036i;
        if (pVar != null) {
            pVar.mo13646c(this, motionEvent);
        }
        return onTouchEvent;
    }

    public LithoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LithoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LithoView lithoView = new LithoView(context);
        this.f19032e = lithoView;
        addView(lithoView);
    }
}
