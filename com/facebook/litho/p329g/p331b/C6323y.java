package com.facebook.litho.p329g.p331b;

import android.support.p033v7.widget.C0710hr;
import android.support.p033v7.widget.LinearLayoutManager;
import com.facebook.litho.C6411u;
import com.facebook.litho.widget.C6427am;
import com.facebook.litho.widget.C6504di;

/* renamed from: com.facebook.litho.g.b.y */
/* compiled from: PG */
public final class C6323y implements C6319u {

    /* renamed from: a */
    private final int f18698a;

    /* renamed from: b */
    private final int f18699b;

    /* renamed from: c */
    private final C6308j f18700c;

    @Deprecated
    public C6323y(int i, int i2, C6308j jVar, C6322x xVar) {
        this.f18698a = i;
        this.f18699b = i2;
        this.f18700c = jVar == null ? C6321w.f18691a : jVar;
        if (xVar == null) {
            int i3 = C6321w.f18693e;
        }
    }

    /* renamed from: a */
    public final int mo13303a() {
        return this.f18699b;
    }

    /* renamed from: b */
    public final int mo13304b() {
        return LinearLayoutManager.INVALID_OFFSET;
    }

    /* renamed from: c */
    public final C0710hr mo13305c() {
        return null;
    }

    /* renamed from: d */
    public final C6308j mo13306d() {
        return this.f18700c;
    }

    /* renamed from: e */
    public final C6427am mo13307e(C6411u uVar) {
        return new C6504di(this.f18698a, this.f18699b);
    }
}
