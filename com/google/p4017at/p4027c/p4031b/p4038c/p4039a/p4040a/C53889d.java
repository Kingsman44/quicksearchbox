package com.google.p4017at.p4027c.p4031b.p4038c.p4039a.p4040a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.c.b.c.a.a.d */
/* compiled from: PG */
public final class C53889d implements C61373ao {

    /* renamed from: a */
    public static final C31164au f141409a = C31164au.m58092b("google.internal.discover.discofeed.reactions.v1.DiscoverReactions.");

    /* renamed from: b */
    public static final C61372an f141410b = new C53886a();

    /* renamed from: c */
    public static final C61372an f141411c = new C53887b();

    /* renamed from: d */
    public static final C61372an f141412d = new C53888c();

    /* renamed from: e */
    public static final C53889d f141413e = new C53889d();

    /* renamed from: h */
    private static final C31164au f141414h = C31164au.m58092b("google.internal.discover.discofeed.reactions.v1.DiscoverReactions/");

    /* renamed from: i */
    private static final C31164au f141415i = C31164au.m58092b("discover-pa.googleapis.com");

    /* renamed from: f */
    public final C58485gu f141416f;

    /* renamed from: g */
    public final C58528ij f141417g = new C58526ih().mo55486f();

    /* renamed from: j */
    private final C58495hd f141418j;

    static {
        C31164au.m58092b("google.internal.discover.discofeed.reactions.v1.DiscoverReactions");
    }

    private C53889d() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.mtls.googleapis.com");
        e.mo55395g("staging-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.googleapis.com");
        this.f141416f = e.mo55394f();
        C61372an anVar = f141410b;
        C61372an anVar2 = f141411c;
        C61372an anVar3 = f141412d;
        C58528ij.m90012L(anVar, anVar2, anVar3);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("CreateReaction", anVar);
        gzVar.mo55429h("ListReactions", anVar2);
        gzVar.mo55429h("AllHearts", anVar3);
        this.f141418j = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f141415i;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f141414h.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f141418j.containsKey(substring)) {
            return (C61372an) this.f141418j.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
