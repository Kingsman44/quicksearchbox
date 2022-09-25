package com.google.p4017at.p4060h.p4061a.p4062a.p4065c;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.h.a.a.c.j */
/* compiled from: PG */
public final class C54143j implements C61373ao {

    /* renamed from: a */
    public static final C31164au f142074a = C31164au.m58092b("google.internal.mothership.searchapi.v2.WernickeService.");

    /* renamed from: b */
    public static final C61372an f142075b = new C54134a();

    /* renamed from: c */
    public static final C61372an f142076c = new C54135b();

    /* renamed from: d */
    public static final C61372an f142077d = new C54136c();

    /* renamed from: e */
    public static final C61372an f142078e = new C54137d();

    /* renamed from: f */
    public static final C61372an f142079f = new C54138e();

    /* renamed from: g */
    public static final C61372an f142080g = new C54139f();

    /* renamed from: h */
    public static final C61372an f142081h = new C54140g();

    /* renamed from: i */
    public static final C61372an f142082i = new C54141h();

    /* renamed from: j */
    public static final C61372an f142083j = new C54142i();

    /* renamed from: k */
    public static final C54143j f142084k = new C54143j();

    /* renamed from: n */
    private static final C31164au f142085n = C31164au.m58092b("google.internal.mothership.searchapi.v2.WernickeService/");

    /* renamed from: o */
    private static final C31164au f142086o = C31164au.m58092b("wernickeservice-pa.googleapis.com");

    /* renamed from: l */
    public final C58485gu f142087l;

    /* renamed from: m */
    public final C58528ij f142088m;

    /* renamed from: p */
    private final C58495hd f142089p;

    static {
        C31164au.m58092b("google.internal.mothership.searchapi.v2.WernickeService");
    }

    private C54143j() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("wernickeservice-pa.googleapis.com");
        e.mo55395g("wernickeservice-pa.googleapis.com");
        this.f142087l = e.mo55394f();
        C58526ih ihVar = new C58526ih();
        ihVar.mo55373c("https://www.googleapis.com/auth/mothership_search");
        this.f142088m = ihVar.mo55486f();
        C61372an anVar = f142075b;
        C61372an anVar2 = f142076c;
        C61372an anVar3 = f142077d;
        C61372an anVar4 = f142078e;
        C61372an anVar5 = f142079f;
        C61372an anVar6 = f142080g;
        C61372an anVar7 = f142081h;
        C61372an anVar8 = f142082i;
        C61372an anVar9 = f142083j;
        C58528ij.m90015O(anVar, anVar2, anVar3, anVar4, anVar5, anVar6, anVar7, anVar8, anVar9);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GetEpisodeData", anVar);
        gzVar.mo55429h("GetEpisodeRecommendations", anVar2);
        gzVar.mo55429h("GetPlayerDataPayload", anVar3);
        gzVar.mo55429h("GetRecommendationTopicsList", anVar4);
        gzVar.mo55429h("GetSearchResults", anVar5);
        gzVar.mo55429h("GetSuggestResults", anVar6);
        gzVar.mo55429h("SynchronizeFavorites", anVar7);
        gzVar.mo55429h("SynchronizeProgress", anVar8);
        gzVar.mo55429h("SynchronizeSingleProgress", anVar9);
        this.f142089p = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f142086o;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f142085n.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f142089p.containsKey(substring)) {
            return (C61372an) this.f142089p.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
