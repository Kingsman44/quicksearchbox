package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xt */
/* compiled from: PG */
public abstract class C7426xt {

    /* renamed from: a */
    private final C7423xq f24343a;

    /* renamed from: b */
    public final C6864cy f24344b;

    /* renamed from: c */
    public final String f24345c;

    /* renamed from: d */
    public final long f24346d;

    /* renamed from: e */
    public final List f24347e;

    public /* synthetic */ C7426xt(C6864cy cyVar, String str, C7432xz xzVar, List list) {
        this.f24344b = cyVar;
        this.f24345c = str;
        this.f24347e = Collections.unmodifiableList(list);
        this.f24343a = xzVar.mo16794i(this);
        this.f24346d = aeu.m18496N(xzVar.f24364j, 1000000, xzVar.f24363i);
    }

    /* renamed from: k */
    public abstract C7423xq mo16782k();

    /* renamed from: l */
    public abstract C7403wx mo16783l();

    /* renamed from: m */
    public abstract String mo16784m();

    /* renamed from: n */
    public final C7423xq mo16785n() {
        return this.f24343a;
    }
}
