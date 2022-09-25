package com.facebook.litho.widget;

import android.content.Context;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.GridLayoutManager;
import android.view.View;

/* renamed from: com.facebook.litho.widget.ab */
/* compiled from: PG */
public final class C6416ab implements C6427am {

    /* renamed from: a */
    public final GridLayoutManager f19045a;

    /* renamed from: b */
    public C6425ak f19046b;

    /* renamed from: c */
    private final C6559x f19047c;

    public C6416ab(Context context, int i, int i2) {
        C6561z zVar = new C6561z(context, i, i2);
        this.f19045a = zVar;
        C6559x xVar = new C6559x(this);
        this.f19047c = xVar;
        zVar.mSpanSizeLookup = xVar;
    }

    /* renamed from: b */
    public final int mo13480b() {
        return this.f19045a.findFirstCompletelyVisibleItemPosition();
    }

    /* renamed from: c */
    public final int mo13481c() {
        return this.f19045a.findFirstVisibleItemPosition();
    }

    /* renamed from: d */
    public final int mo13482d() {
        return this.f19045a.findLastCompletelyVisibleItemPosition();
    }

    /* renamed from: e */
    public final int mo13483e() {
        return this.f19045a.findLastVisibleItemPosition();
    }

    /* renamed from: f */
    public final int mo13484f(int i, C6491cw cwVar) {
        if (this.f19045a.getOrientation() != 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Integer num = (Integer) cwVar.mo13525g("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        if (cwVar.mo13530l()) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(cwVar.mo13519a() * (View.MeasureSpec.getSize(i) / this.f19045a.mSpanCount), 1073741824);
    }

    /* renamed from: h */
    public final int mo13486h() {
        return this.f19045a.getItemCount();
    }

    /* renamed from: i */
    public final int mo13487i() {
        return this.f19045a.getOrientation();
    }

    /* renamed from: j */
    public final C0653fo mo13488j() {
        return this.f19045a;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C6426al mo13489k(int i, int i2) {
        GridLayoutManager gridLayoutManager = this.f19045a;
        return new C6415aa(i, i2, gridLayoutManager.getOrientation(), gridLayoutManager.mSpanCount);
    }

    /* renamed from: l */
    public final void mo13490l(int i, int i2) {
        this.f19045a.scrollToPositionWithOffset(i, i2);
    }

    /* renamed from: m */
    public final void mo13491m(C6425ak akVar) {
        this.f19046b = akVar;
    }

    /* renamed from: a */
    public final int mo13479a(int i, int i2, int i3, int i4) {
        double ceil;
        GridLayoutManager gridLayoutManager = this.f19045a;
        int i5 = gridLayoutManager.mSpanCount;
        if (gridLayoutManager.getOrientation() != 0) {
            double d = (double) i4;
            double d2 = (double) i2;
            Double.isNaN(d);
            Double.isNaN(d2);
            ceil = Math.ceil(d / d2);
        } else {
            double d3 = (double) i3;
            double d4 = (double) i;
            Double.isNaN(d3);
            Double.isNaN(d4);
            ceil = Math.ceil(d3 / d4);
        }
        return ((int) ceil) * i5;
    }

    /* renamed from: g */
    public final int mo13485g(int i, C6491cw cwVar) {
        if (this.f19045a.getOrientation() == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Integer num = (Integer) cwVar.mo13525g("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        if (cwVar.mo13530l()) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(cwVar.mo13519a() * (View.MeasureSpec.getSize(i) / this.f19045a.mSpanCount), 1073741824);
    }
}
