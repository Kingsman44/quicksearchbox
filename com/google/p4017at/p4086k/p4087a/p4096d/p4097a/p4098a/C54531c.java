package com.google.p4017at.p4086k.p4087a.p4096d.p4097a.p4098a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.k.a.d.a.a.c */
/* compiled from: PG */
public final class C54531c implements C61373ao {

    /* renamed from: a */
    public static final C31164au f143171a = C31164au.m58092b("google.internal.search.gsa.pronto.v1.ProntoService.");

    /* renamed from: b */
    public static final C61372an f143172b = new C54529a();

    /* renamed from: c */
    public static final C61372an f143173c = new C54530b();

    /* renamed from: d */
    public static final C54531c f143174d = new C54531c();

    /* renamed from: g */
    private static final C31164au f143175g = C31164au.m58092b("google.internal.search.gsa.pronto.v1.ProntoService/");

    /* renamed from: h */
    private static final C31164au f143176h = C31164au.m58092b("pronto-pa.googleapis.com");

    /* renamed from: e */
    public final C58485gu f143177e;

    /* renamed from: f */
    public final C58528ij f143178f = new C58526ih().mo55486f();

    /* renamed from: i */
    private final C58495hd f143179i;

    static {
        C31164au.m58092b("google.internal.search.gsa.pronto.v1.ProntoService");
    }

    private C54531c() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-pronto-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-pronto-pa.sandbox.googleapis.com");
        e.mo55395g("prodsearchqual-pronto-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("prodsearchqual-pronto-pa.sandbox.googleapis.com");
        e.mo55395g("pronto-pa.mtls.googleapis.com");
        e.mo55395g("staging-pronto-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-pronto-pa.sandbox.googleapis.com");
        e.mo55395g("pronto-pa.googleapis.com");
        this.f143177e = e.mo55394f();
        C61372an anVar = f143172b;
        C61372an anVar2 = f143173c;
        C58528ij.m90011K(anVar, anVar2);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GetProntoFeedback", anVar);
        gzVar.mo55429h("GetPronunciationAnalysis", anVar2);
        this.f143179i = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f143176h;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f143175g.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f143179i.containsKey(substring)) {
            return (C61372an) this.f143179i.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
