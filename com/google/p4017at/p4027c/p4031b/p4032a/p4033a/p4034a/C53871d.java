package com.google.p4017at.p4027c.p4031b.p4032a.p4033a.p4034a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.c.b.a.a.a.d */
/* compiled from: PG */
public final class C53871d implements C61373ao {

    /* renamed from: a */
    public static final C31164au f141363a = C31164au.m58092b("google.internal.discover.discofeed.actions.v1.DiscoverActions.");

    /* renamed from: b */
    public static final C61372an f141364b = new C53868a();

    /* renamed from: c */
    public static final C61372an f141365c = new C53869b();

    /* renamed from: d */
    public static final C61372an f141366d = new C53870c();

    /* renamed from: e */
    public static final C53871d f141367e = new C53871d();

    /* renamed from: h */
    private static final C31164au f141368h = C31164au.m58092b("google.internal.discover.discofeed.actions.v1.DiscoverActions/");

    /* renamed from: i */
    private static final C31164au f141369i = C31164au.m58092b("discover-pa.googleapis.com");

    /* renamed from: f */
    public final C58485gu f141370f;

    /* renamed from: g */
    public final C58528ij f141371g = new C58526ih().mo55486f();

    /* renamed from: j */
    private final C58495hd f141372j;

    static {
        C31164au.m58092b("google.internal.discover.discofeed.actions.v1.DiscoverActions");
    }

    private C53871d() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.mtls.googleapis.com");
        e.mo55395g("staging-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.googleapis.com");
        this.f141370f = e.mo55394f();
        C61372an anVar = f141364b;
        C61372an anVar2 = f141365c;
        C61372an anVar3 = f141366d;
        C58528ij.m90012L(anVar, anVar2, anVar3);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("UploadActions", anVar);
        gzVar.mo55429h("BackgroundUploadActions", anVar2);
        gzVar.mo55429h("LogActions", anVar3);
        this.f141372j = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f141369i;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f141368h.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f141372j.containsKey(substring)) {
            return (C61372an) this.f141372j.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
