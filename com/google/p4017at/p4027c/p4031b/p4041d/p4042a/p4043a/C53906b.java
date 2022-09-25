package com.google.p4017at.p4027c.p4031b.p4041d.p4042a.p4043a;

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

/* renamed from: com.google.at.c.b.d.a.a.b */
/* compiled from: PG */
public final class C53906b implements C61373ao {

    /* renamed from: a */
    public static final C31164au f141444a = C31164au.m58092b("google.internal.discover.discofeed.recommendations.v1.StoryRecommendations.");

    /* renamed from: b */
    public static final C61372an f141445b = new C53905a();

    /* renamed from: c */
    public static final C53906b f141446c = new C53906b();

    /* renamed from: f */
    private static final C31164au f141447f = C31164au.m58092b("google.internal.discover.discofeed.recommendations.v1.StoryRecommendations/");

    /* renamed from: g */
    private static final C31164au f141448g = C31164au.m58092b("discover-pa.googleapis.com");

    /* renamed from: d */
    public final C58485gu f141449d;

    /* renamed from: e */
    public final C58528ij f141450e = new C58526ih().mo55486f();

    /* renamed from: h */
    private final C58495hd f141451h;

    static {
        C31164au.m58092b("google.internal.discover.discofeed.recommendations.v1.StoryRecommendations");
    }

    private C53906b() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.mtls.googleapis.com");
        e.mo55395g("staging-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.googleapis.com");
        this.f141449d = e.mo55394f();
        C61372an anVar = f141445b;
        new C58759qy(anVar);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("ListRecommendedStories", anVar);
        this.f141451h = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f141448g;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f141447f.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f141451h.containsKey(substring)) {
            return (C61372an) this.f141451h.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
