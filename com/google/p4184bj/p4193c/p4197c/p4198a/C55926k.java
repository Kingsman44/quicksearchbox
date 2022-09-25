package com.google.p4184bj.p4193c.p4197c.p4198a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.bj.c.c.a.k */
/* compiled from: PG */
public final class C55926k implements C61373ao {

    /* renamed from: a */
    public static final C31164au f148859a = C31164au.m58092b("footprints.oneplatform.FootprintsService.");

    /* renamed from: b */
    public static final C61372an f148860b = new C55917b();

    /* renamed from: c */
    public static final C61372an f148861c = new C55918c();

    /* renamed from: d */
    public static final C61372an f148862d = new C55919d();

    /* renamed from: e */
    public static final C61372an f148863e = new C55920e();

    /* renamed from: f */
    public static final C61372an f148864f = new C55921f();

    /* renamed from: g */
    public static final C61372an f148865g = new C55922g();

    /* renamed from: h */
    public static final C61372an f148866h = new C55923h();

    /* renamed from: i */
    public static final C61372an f148867i = new C55924i();

    /* renamed from: j */
    public static final C61372an f148868j = new C55925j();

    /* renamed from: k */
    public static final C61372an f148869k = new C55916a();

    /* renamed from: l */
    public static final C55926k f148870l = new C55926k();

    /* renamed from: o */
    private static final C31164au f148871o = C31164au.m58092b("footprints.oneplatform.FootprintsService/");

    /* renamed from: p */
    private static final C31164au f148872p = C31164au.m58092b("footprints-pa.googleapis.com");

    /* renamed from: m */
    public final C58485gu f148873m;

    /* renamed from: n */
    public final C58528ij f148874n = new C58526ih().mo55486f();

    /* renamed from: q */
    private final C58495hd f148875q;

    static {
        C31164au.m58092b("footprints.oneplatform.FootprintsService");
    }

    private C55926k() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-footprints-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-footprints-pa.sandbox.googleapis.com");
        e.mo55395g("autopushsearchqual-footprints-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopushsearchqual-footprints-pa.sandbox.googleapis.com");
        e.mo55395g("footprints-pa.mtls.googleapis.com");
        e.mo55395g("staging-footprints-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-footprints-pa.sandbox.googleapis.com");
        e.mo55395g("footprints-pa.googleapis.com");
        this.f148873m = e.mo55394f();
        C61372an anVar = f148860b;
        C61372an anVar2 = f148861c;
        C61372an anVar3 = f148862d;
        C61372an anVar4 = f148863e;
        C61372an anVar5 = f148864f;
        C61372an anVar6 = f148865g;
        C61372an anVar7 = f148866h;
        C61372an anVar8 = f148867i;
        C61372an anVar9 = f148868j;
        C61372an anVar10 = f148869k;
        C58528ij.m90015O(anVar, anVar2, anVar3, anVar4, anVar5, anVar6, anVar7, anVar8, anVar9, anVar10);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("Read", anVar);
        gzVar.mo55429h("Write", anVar2);
        gzVar.mo55429h("Delete", anVar3);
        gzVar.mo55429h("GetFacs", anVar4);
        gzVar.mo55429h("GetActivityControlsSettings", anVar5);
        gzVar.mo55429h("UpdateActivityControlsSettings", anVar6);
        gzVar.mo55429h("GetMobileConsents", anVar7);
        gzVar.mo55429h("GetSettingText", anVar8);
        gzVar.mo55429h("GetDeletions", anVar9);
        gzVar.mo55429h("GetXuikitConsentFlow", anVar10);
        this.f148875q = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f148872p;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f148871o.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f148875q.containsKey(substring)) {
            return (C61372an) this.f148875q.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
