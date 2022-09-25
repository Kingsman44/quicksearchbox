package com.google.p4017at.p4099l.p4100a.p4101a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.l.a.a.l */
/* compiled from: PG */
public final class C54560l implements C61373ao {

    /* renamed from: a */
    public static final C31164au f143232a = C31164au.m58092b("google.internal.zerostateproxy.v1.ZeroStateProxy.");

    /* renamed from: b */
    public static final C61372an f143233b = new C54551c();

    /* renamed from: c */
    public static final C61372an f143234c = new C54552d();

    /* renamed from: d */
    public static final C61372an f143235d = new C54553e();

    /* renamed from: e */
    public static final C61372an f143236e = new C54554f();

    /* renamed from: f */
    public static final C61372an f143237f = new C54555g();

    /* renamed from: g */
    public static final C61372an f143238g = new C54556h();

    /* renamed from: h */
    public static final C61372an f143239h = new C54557i();

    /* renamed from: i */
    public static final C61372an f143240i = new C54558j();

    /* renamed from: j */
    public static final C61372an f143241j = new C54559k();

    /* renamed from: k */
    public static final C61372an f143242k = new C54549a();

    /* renamed from: l */
    public static final C61372an f143243l = new C54550b();

    /* renamed from: m */
    public static final C54560l f143244m = new C54560l();

    /* renamed from: p */
    private static final C31164au f143245p = C31164au.m58092b("google.internal.zerostateproxy.v1.ZeroStateProxy/");

    /* renamed from: q */
    private static final C31164au f143246q = C31164au.m58092b("zerostateproxy-pa.googleapis.com");

    /* renamed from: n */
    public final C58485gu f143247n;

    /* renamed from: o */
    public final C58528ij f143248o = new C58526ih().mo55486f();

    /* renamed from: r */
    private final C58495hd f143249r;

    static {
        C31164au.m58092b("google.internal.zerostateproxy.v1.ZeroStateProxy");
    }

    private C54560l() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-zerostateproxy-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-zerostateproxy-pa.sandbox.googleapis.com");
        e.mo55395g("prodsearchqual-zerostateproxy-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("prodsearchqual-zerostateproxy-pa.sandbox.googleapis.com");
        e.mo55395g("staging-zerostateproxy-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-zerostateproxy-pa.sandbox.googleapis.com");
        e.mo55395g("zerostateproxy-pa.mtls.googleapis.com");
        e.mo55395g("zerostateproxy-pa.googleapis.com");
        this.f143247n = e.mo55394f();
        C61372an anVar = f143233b;
        C61372an anVar2 = f143234c;
        C61372an anVar3 = f143235d;
        C61372an anVar4 = f143236e;
        C61372an anVar5 = f143237f;
        C61372an anVar6 = f143238g;
        C61372an anVar7 = f143239h;
        C61372an anVar8 = f143240i;
        C61372an anVar9 = f143241j;
        C61372an anVar10 = f143242k;
        C61372an anVar11 = f143243l;
        C58528ij.m90015O(anVar, anVar2, anVar3, anVar4, anVar5, anVar6, anVar7, anVar8, anVar9, anVar10, anVar11);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GenerateOpaTvAmbient", anVar);
        gzVar.mo55429h("GenerateOpaTvRecommendations", anVar2);
        gzVar.mo55429h("GenerateOpaTvFallbackSuggestions", anVar3);
        gzVar.mo55429h("GenerateOpaTvSearchTab", anVar4);
        gzVar.mo55429h("GenerateOpaTvSuggestedQueries", anVar5);
        gzVar.mo55429h("SyncPcpData", anVar6);
        gzVar.mo55429h("GenerateOpaLiteRecommendations", anVar7);
        gzVar.mo55429h("GenerateWeatherWidget", anVar8);
        gzVar.mo55429h("GenerateShoppingListWidget", anVar9);
        gzVar.mo55429h("GenerateProactiveAutoContent", anVar10);
        gzVar.mo55429h("GenerateTitanProactiveContent", anVar11);
        this.f143249r = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f143246q;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f143245p.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f143249r.containsKey(substring)) {
            return (C61372an) this.f143249r.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
