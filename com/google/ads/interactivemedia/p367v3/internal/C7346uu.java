package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;

/* renamed from: com.google.ads.interactivemedia.v3.internal.uu */
/* compiled from: PG */
public final class C7346uu implements C7334ui {

    /* renamed from: a */
    private final abw f23964a;

    /* renamed from: b */
    private final C7058kc f23965b;

    /* renamed from: c */
    private final int f23966c = 1048576;

    /* renamed from: d */
    private final acj f23967d = new acj();

    /* renamed from: e */
    private final acs f23968e = new acs();

    public C7346uu(abw abw, C7058kc kcVar) {
        this.f23964a = abw;
        this.f23965b = kcVar;
    }

    @Deprecated
    /* renamed from: a */
    public final C7347uv mo16588a(Uri uri) {
        C6868db dbVar = new C6868db();
        dbVar.mo15656h(uri);
        C6873dg a = dbVar.mo15649a();
        ary.m19467t(a.f21858b);
        C6872df dfVar = a.f21858b;
        Object obj = dfVar.f21856h;
        String str = dfVar.f21853e;
        return new C7347uv(a, this.f23964a, this.f23965b, acs.m18254b(a), this.f23967d, 1048576);
    }
}
