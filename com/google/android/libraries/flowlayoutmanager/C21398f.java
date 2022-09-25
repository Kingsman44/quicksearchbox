package com.google.android.libraries.flowlayoutmanager;

import android.util.Log;
import android.view.View;
import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1972g;

/* renamed from: com.google.android.libraries.flowlayoutmanager.f */
/* compiled from: PG */
final class C21398f {

    /* renamed from: a */
    public static final C1971f f59826a = new C1972g(30);

    /* renamed from: b */
    public int f59827b;

    /* renamed from: c */
    public int f59828c;

    /* renamed from: d */
    public float f59829d;

    /* renamed from: e */
    public int f59830e;

    /* renamed from: f */
    public int f59831f;

    /* renamed from: g */
    public int f59832g;

    /* renamed from: h */
    public int f59833h;

    /* renamed from: i */
    public int f59834i;

    /* renamed from: j */
    public int f59835j;

    /* renamed from: k */
    public int f59836k;

    /* renamed from: l */
    public int f59837l;

    /* renamed from: m */
    public int f59838m;

    /* renamed from: n */
    public int f59839n;

    /* renamed from: o */
    public boolean f59840o;

    /* renamed from: p */
    public int f59841p;

    public C21398f() {
        m40487c();
    }

    /* renamed from: c */
    private final void m40487c() {
        this.f59837l = -1;
        this.f59838m = -1;
        this.f59830e = 0;
        this.f59831f = 0;
        this.f59832g = 0;
        this.f59833h = 0;
        this.f59834i = 0;
        this.f59835j = 0;
        this.f59839n = 0;
        this.f59836k = 0;
        this.f59827b = 0;
        this.f59828c = 0;
        this.f59829d = Float.NaN;
        this.f59841p = 0;
        this.f59840o = false;
    }

    /* renamed from: a */
    public final void mo26899a(FlowLayoutManager flowLayoutManager, View view, boolean z) {
        int decoratedMeasuredWidth = flowLayoutManager.getDecoratedMeasuredWidth(view);
        int decoratedMeasuredHeight = flowLayoutManager.getDecoratedMeasuredHeight(view);
        int baseline = view.getBaseline();
        int topDecorationHeight = (baseline < 0 || baseline > view.getMeasuredHeight()) ? decoratedMeasuredHeight : baseline + flowLayoutManager.getTopDecorationHeight(view);
        if (z && !(decoratedMeasuredWidth == this.f59837l && decoratedMeasuredHeight == this.f59838m && topDecorationHeight == this.f59839n)) {
            Log.w("FlowLayoutManager", "Child measurement changed without notifying from the adapter! Some layout may be incorrect.");
        }
        this.f59837l = decoratedMeasuredWidth;
        this.f59838m = decoratedMeasuredHeight;
        this.f59839n = topDecorationHeight;
        this.f59840o = true;
    }

    /* renamed from: b */
    public final void mo26900b() {
        m40487c();
        f59826a.mo5127b(this);
    }
}
