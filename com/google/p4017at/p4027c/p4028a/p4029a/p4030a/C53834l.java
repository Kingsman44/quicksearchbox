package com.google.p4017at.p4027c.p4028a.p4029a.p4030a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.c.a.a.a.l */
/* compiled from: PG */
public final class C53834l implements C61373ao {

    /* renamed from: a */
    public static final C31164au f141291a = C31164au.m58092b("google.internal.discover.channels.v1.DiscoverChannelsRenderer.");

    /* renamed from: b */
    public static final C61372an f141292b = new C53833k();

    /* renamed from: c */
    public static final C53834l f141293c = new C53834l();

    /* renamed from: f */
    private static final C31164au f141294f = C31164au.m58092b("google.internal.discover.channels.v1.DiscoverChannelsRenderer/");

    /* renamed from: g */
    private static final C31164au f141295g = C31164au.m58092b("discover-pa.googleapis.com");

    /* renamed from: d */
    public final C58485gu f141296d;

    /* renamed from: e */
    public final C58528ij f141297e = new C58526ih().mo55486f();

    /* renamed from: h */
    private final C58495hd f141298h;

    static {
        C31164au.m58092b("google.internal.discover.channels.v1.DiscoverChannelsRenderer");
    }

    private C53834l() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.mtls.googleapis.com");
        e.mo55395g("staging-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.googleapis.com");
        this.f141296d = e.mo55394f();
        C61372an anVar = f141292b;
        new C58759qy(anVar);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("ListContents", anVar);
        this.f141298h = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f141295g;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f141294f.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f141298h.containsKey(substring)) {
            return (C61372an) this.f141298h.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
