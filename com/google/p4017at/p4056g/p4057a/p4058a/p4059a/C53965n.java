package com.google.p4017at.p4056g.p4057a.p4058a.p4059a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.g.a.a.a.n */
/* compiled from: PG */
public final class C53965n implements C61373ao {

    /* renamed from: a */
    public static final C31164au f141587a = C31164au.m58092b("google.internal.lens.api.v1.LensStreamService.");

    /* renamed from: b */
    public static final C61372an f141588b = new C53959h();

    /* renamed from: c */
    public static final C61372an f141589c = new C53960i();

    /* renamed from: d */
    public static final C61372an f141590d = new C53961j();

    /* renamed from: e */
    public static final C61372an f141591e = new C53962k();

    /* renamed from: f */
    public static final C61372an f141592f = new C53963l();

    /* renamed from: g */
    public static final C61372an f141593g = new C53964m();

    /* renamed from: h */
    public static final C53965n f141594h = new C53965n();

    /* renamed from: k */
    private static final C31164au f141595k = C31164au.m58092b("google.internal.lens.api.v1.LensStreamService/");

    /* renamed from: l */
    private static final C31164au f141596l = C31164au.m58092b("lens-pa.googleapis.com");

    /* renamed from: i */
    public final C58485gu f141597i;

    /* renamed from: j */
    public final C58528ij f141598j;

    /* renamed from: m */
    private final C58495hd f141599m;

    static {
        C31164au.m58092b("google.internal.lens.api.v1.LensStreamService");
    }

    private C53965n() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-lens-pa.sandbox.googleapis.com");
        e.mo55395g("daily0-lens-pa.sandbox.googleapis.com");
        e.mo55395g("daily1-lens-pa.sandbox.googleapis.com");
        e.mo55395g("daily2-lens-pa.sandbox.googleapis.com");
        e.mo55395g("daily3-lens-pa.sandbox.googleapis.com");
        e.mo55395g("daily4-lens-pa.sandbox.googleapis.com");
        e.mo55395g("daily5-lens-pa.sandbox.googleapis.com");
        e.mo55395g("daily6-lens-pa.sandbox.googleapis.com");
        e.mo55395g("preprod-lens-pa.sandbox.googleapis.com");
        e.mo55395g("prodbatch-lens-pa.googleapis.com");
        e.mo55395g("prodlocal-lens-pa.sandbox.googleapis.com");
        e.mo55395g("staging-lens-pa.sandbox.googleapis.com");
        e.mo55395g("lens-pa.googleapis.com");
        this.f141597i = e.mo55394f();
        C58526ih ihVar = new C58526ih();
        ihVar.mo55373c("https://www.googleapis.com/auth/lens");
        this.f141598j = ihVar.mo55486f();
        C61372an anVar = f141588b;
        C61372an anVar2 = f141589c;
        C61372an anVar3 = f141590d;
        C61372an anVar4 = f141591e;
        C61372an anVar5 = f141592f;
        C61372an anVar6 = f141593g;
        C58528ij.m90015O(anVar, anVar2, anVar3, anVar4, anVar5, anVar6, new C61372an[0]);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("StreamLensResults", anVar);
        gzVar.mo55429h("FetchLensResults", anVar2);
        gzVar.mo55429h("FetchGleamsAndResultPanel", anVar3);
        gzVar.mo55429h("FetchImageMetadata", anVar4);
        gzVar.mo55429h("FetchLensRelatedContent", anVar5);
        gzVar.mo55429h("FetchEmptyResultPanel", anVar6);
        this.f141599m = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f141596l;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f141595k.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f141599m.containsKey(substring)) {
            return (C61372an) this.f141599m.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
