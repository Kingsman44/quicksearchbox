package com.facebook.litho.widget;

import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0725if;
import android.support.p033v7.widget.StaggeredGridLayoutManager;
import android.view.View;

/* renamed from: com.facebook.litho.widget.di */
/* compiled from: PG */
public final class C6504di implements C6427am {

    /* renamed from: a */
    private final StaggeredGridLayoutManager f19282a;

    public C6504di(int i, int i2) {
        C6502dg dgVar = new C6502dg(i, i2);
        this.f19282a = dgVar;
        dgVar.mo2325h(false);
        dgVar.assertNotInLayoutOrScroll((String) null);
        if (dgVar.f1847k != 0) {
            dgVar.f1847k = 0;
            dgVar.requestLayout();
        }
    }

    /* renamed from: b */
    public final int mo13480b() {
        return C6499dd.m17610b(this.f19282a.mo2331n());
    }

    /* renamed from: c */
    public final int mo13481c() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19282a;
        int[] o = ((C6502dg) staggeredGridLayoutManager).mo13587o();
        if (o == null) {
            o = new int[staggeredGridLayoutManager.f1837a];
        } else {
            int length = o.length;
            if (length < staggeredGridLayoutManager.f1837a) {
                throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + staggeredGridLayoutManager.f1837a + ", array size:" + length);
            }
        }
        for (int i = 0; i < staggeredGridLayoutManager.f1837a; i++) {
            C0725if ifVar = staggeredGridLayoutManager.f1838b[i];
            o[i] = ifVar.f2565f.f1842f ? ifVar.mo3211d(ifVar.f2560a.size() - 1, -1, false) : ifVar.mo3211d(0, ifVar.f2560a.size(), false);
        }
        return C6499dd.m17610b(o);
    }

    /* renamed from: d */
    public final int mo13482d() {
        return C6499dd.m17609a(this.f19282a.mo2330m((int[]) null));
    }

    /* renamed from: e */
    public final int mo13483e() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19282a;
        int[] o = ((C6502dg) staggeredGridLayoutManager).mo13587o();
        if (o == null) {
            o = new int[staggeredGridLayoutManager.f1837a];
        } else {
            int length = o.length;
            if (length < staggeredGridLayoutManager.f1837a) {
                throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + staggeredGridLayoutManager.f1837a + ", array size:" + length);
            }
        }
        for (int i = 0; i < staggeredGridLayoutManager.f1837a; i++) {
            C0725if ifVar = staggeredGridLayoutManager.f1838b[i];
            o[i] = ifVar.f2565f.f1842f ? ifVar.mo3211d(0, ifVar.f2560a.size(), false) : ifVar.mo3211d(ifVar.f2560a.size() - 1, -1, false);
        }
        return C6499dd.m17609a(o);
    }

    /* renamed from: f */
    public final int mo13484f(int i, C6491cw cwVar) {
        if (this.f19282a.f1841e != 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Integer num = (Integer) cwVar.mo13525g("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec((cwVar.mo13530l() ? this.f19282a.f1837a : 1) * (View.MeasureSpec.getSize(i) / this.f19282a.f1837a), 1073741824);
    }

    /* renamed from: h */
    public final int mo13486h() {
        return this.f19282a.getItemCount();
    }

    /* renamed from: i */
    public final int mo13487i() {
        return this.f19282a.f1841e;
    }

    /* renamed from: j */
    public final C0653fo mo13488j() {
        return this.f19282a;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C6426al mo13489k(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19282a;
        return new C6503dh(i, i2, staggeredGridLayoutManager.f1841e, staggeredGridLayoutManager.f1837a);
    }

    /* renamed from: l */
    public final void mo13490l(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19282a;
        StaggeredGridLayoutManager.SavedState savedState = staggeredGridLayoutManager.f1848l;
        if (savedState != null) {
            savedState.mo2349a();
        }
        staggeredGridLayoutManager.f1844h = i;
        staggeredGridLayoutManager.f1845i = i2;
        staggeredGridLayoutManager.requestLayout();
    }

    /* renamed from: m */
    public final void mo13491m(C6425ak akVar) {
    }

    /* renamed from: a */
    public final int mo13479a(int i, int i2, int i3, int i4) {
        double ceil;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f19282a;
        int i5 = staggeredGridLayoutManager.f1837a;
        if (staggeredGridLayoutManager.f1841e != 0) {
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
        if (this.f19282a.f1841e == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Integer num = (Integer) cwVar.mo13525g("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec((cwVar.mo13530l() ? this.f19282a.f1837a : 1) * (View.MeasureSpec.getSize(i) / this.f19282a.f1837a), 1073741824);
    }
}
