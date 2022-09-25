package com.facebook.litho.widget;

import android.content.Context;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;

/* renamed from: com.facebook.litho.widget.ap */
/* compiled from: PG */
public final class C6430ap implements C6427am {

    /* renamed from: a */
    private final LinearLayoutManager f19080a;

    public C6430ap(Context context, int i) {
        C6428an anVar = new C6428an(context, i);
        this.f19080a = anVar;
        anVar.setMeasurementCacheEnabled(false);
    }

    /* renamed from: b */
    public final int mo13480b() {
        return this.f19080a.findFirstCompletelyVisibleItemPosition();
    }

    /* renamed from: c */
    public final int mo13481c() {
        return this.f19080a.findFirstVisibleItemPosition();
    }

    /* renamed from: d */
    public final int mo13482d() {
        return this.f19080a.findLastCompletelyVisibleItemPosition();
    }

    /* renamed from: e */
    public final int mo13483e() {
        return this.f19080a.findLastVisibleItemPosition();
    }

    /* renamed from: f */
    public final int mo13484f(int i, C6491cw cwVar) {
        return this.f19080a.getOrientation() != 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i;
    }

    /* renamed from: g */
    public final int mo13485g(int i, C6491cw cwVar) {
        return this.f19080a.getOrientation() != 0 ? i : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    /* renamed from: h */
    public final int mo13486h() {
        return this.f19080a.getItemCount();
    }

    /* renamed from: i */
    public final int mo13487i() {
        return this.f19080a.getOrientation();
    }

    /* renamed from: j */
    public final C0653fo mo13488j() {
        return this.f19080a;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C6426al mo13489k(int i, int i2) {
        return new C6429ao(i, i2, this.f19080a.getOrientation());
    }

    /* renamed from: l */
    public final void mo13490l(int i, int i2) {
        this.f19080a.scrollToPositionWithOffset(i, i2);
    }

    /* renamed from: m */
    public final void mo13491m(C6425ak akVar) {
    }

    /* renamed from: a */
    public final int mo13479a(int i, int i2, int i3, int i4) {
        double d;
        if (this.f19080a.getOrientation() != 0) {
            d = Math.ceil((double) (((float) i4) / ((float) i2)));
        } else {
            d = Math.ceil((double) (((float) i3) / ((float) i)));
        }
        int i5 = (int) d;
        if (i5 < 2) {
            return 2;
        }
        if (i5 > 10) {
            return 10;
        }
        return i5;
    }
}
