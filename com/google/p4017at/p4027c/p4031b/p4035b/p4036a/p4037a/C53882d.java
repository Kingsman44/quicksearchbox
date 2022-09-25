package com.google.p4017at.p4027c.p4031b.p4035b.p4036a.p4037a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.c.b.b.a.a.d */
/* compiled from: PG */
public final class C53882d implements C61373ao {

    /* renamed from: a */
    public static final C31164au f141390a = C31164au.m58092b("google.internal.discover.discofeed.feedrenderer.v1.DiscoverFeedRenderer.");

    /* renamed from: b */
    public static final C61372an f141391b = new C53879a();

    /* renamed from: c */
    public static final C61372an f141392c = new C53880b();

    /* renamed from: d */
    public static final C61372an f141393d = new C53881c();

    /* renamed from: e */
    public static final C53882d f141394e = new C53882d();

    /* renamed from: h */
    private static final C31164au f141395h = C31164au.m58092b("google.internal.discover.discofeed.feedrenderer.v1.DiscoverFeedRenderer/");

    /* renamed from: i */
    private static final C31164au f141396i = C31164au.m58092b("discover-pa.googleapis.com");

    /* renamed from: f */
    public final C58485gu f141397f;

    /* renamed from: g */
    public final C58528ij f141398g = new C58526ih().mo55486f();

    /* renamed from: j */
    private final C58495hd f141399j;

    static {
        C31164au.m58092b("google.internal.discover.discofeed.feedrenderer.v1.DiscoverFeedRenderer");
    }

    private C53882d() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.mtls.googleapis.com");
        e.mo55395g("staging-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.googleapis.com");
        this.f141397f = e.mo55394f();
        C61372an anVar = f141391b;
        C61372an anVar2 = f141392c;
        C61372an anVar3 = f141393d;
        C58528ij.m90012L(anVar, anVar2, anVar3);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("QueryInteractiveFeed", anVar);
        gzVar.mo55429h("QueryBackgroundFeed", anVar2);
        gzVar.mo55429h("QueryNextPage", anVar3);
        this.f141399j = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f141396i;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f141395h.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f141399j.containsKey(substring)) {
            return (C61372an) this.f141399j.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
