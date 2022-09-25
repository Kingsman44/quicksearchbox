package com.google.p4017at.p4086k.p4087a.p4093c.p4094a.p4095a;

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

/* renamed from: com.google.at.k.a.c.a.a.b */
/* compiled from: PG */
public final class C54519b implements C61373ao {

    /* renamed from: a */
    public static final C31164au f143142a = C31164au.m58092b("google.internal.search.gsa.promomanager.v2.PromoManagerService.");

    /* renamed from: b */
    public static final C61372an f143143b = new C54518a();

    /* renamed from: c */
    public static final C54519b f143144c = new C54519b();

    /* renamed from: f */
    private static final C31164au f143145f = C31164au.m58092b("google.internal.search.gsa.promomanager.v2.PromoManagerService/");

    /* renamed from: g */
    private static final C31164au f143146g = C31164au.m58092b("xgapromomanager-pa.googleapis.com");

    /* renamed from: d */
    public final C58485gu f143147d;

    /* renamed from: e */
    public final C58528ij f143148e = new C58526ih().mo55486f();

    /* renamed from: h */
    private final C58495hd f143149h;

    static {
        C31164au.m58092b("google.internal.search.gsa.promomanager.v2.PromoManagerService");
    }

    private C54519b() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-xgapromomanager-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-xgapromomanager-pa.sandbox.googleapis.com");
        e.mo55395g("staging-xgapromomanager-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-xgapromomanager-pa.sandbox.googleapis.com");
        e.mo55395g("xgapromomanager-pa.mtls.googleapis.com");
        e.mo55395g("xgapromomanager-pa.googleapis.com");
        this.f143147d = e.mo55394f();
        C61372an anVar = f143143b;
        new C58759qy(anVar);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GetConfiguration", anVar);
        this.f143149h = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f143146g;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f143145f.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f143149h.containsKey(substring)) {
            return (C61372an) this.f143149h.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
