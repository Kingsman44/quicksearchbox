package com.google.ads.interactivemedia.p367v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xw */
/* compiled from: PG */
public final class C7429xw extends C7427xu {

    /* renamed from: e */
    final C7436yc f24355e;

    /* renamed from: f */
    final C7436yc f24356f;

    /* renamed from: g */
    final long f24357g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7429xw(C7423xq xqVar, long j, long j2, long j3, long j4, long j5, List list, long j6, C7436yc ycVar, C7436yc ycVar2, long j7, long j8) {
        super(xqVar, j, j2, j3, j5, list, j6, j7, j8);
        this.f24355e = ycVar;
        this.f24356f = ycVar2;
        this.f24357g = j4;
    }

    /* renamed from: d */
    public final C7423xq mo16789d(C7426xt xtVar, long j) {
        long j2;
        List list = this.f24350c;
        if (list != null) {
            j2 = ((C7430xx) list.get((int) (j - this.f24348a))).f24358a;
        } else {
            j2 = (j - this.f24348a) * this.f24349b;
        }
        long j3 = j2;
        C7436yc ycVar = this.f24356f;
        C6864cy cyVar = xtVar.f24344b;
        return new C7423xq(ycVar.mo16797b(cyVar.f21801a, j, cyVar.f21808h, j3), 0, -1);
    }

    /* renamed from: h */
    public final int mo16793h(long j) {
        List list = this.f24350c;
        if (list != null) {
            return list.size();
        }
        long j2 = this.f24357g;
        if (j2 != -1) {
            return (int) ((j2 - this.f24348a) + 1);
        }
        if (j != -9223372036854775807L) {
            return (int) aeu.m18489G(j, (this.f24349b * 1000000) / this.f24363i);
        }
        return -1;
    }

    /* renamed from: i */
    public final C7423xq mo16794i(C7426xt xtVar) {
        C7436yc ycVar = this.f24355e;
        if (ycVar == null) {
            return this.f24362h;
        }
        C6864cy cyVar = xtVar.f24344b;
        return new C7423xq(ycVar.mo16797b(cyVar.f21801a, 0, cyVar.f21808h, 0), 0, -1);
    }
}
