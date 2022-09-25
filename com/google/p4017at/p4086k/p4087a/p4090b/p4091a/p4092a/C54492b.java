package com.google.p4017at.p4086k.p4087a.p4090b.p4091a.p4092a;

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

/* renamed from: com.google.at.k.a.b.a.a.b */
/* compiled from: PG */
public final class C54492b implements C61373ao {

    /* renamed from: a */
    public static final C31164au f143066a = C31164au.m58092b("google.internal.search.gsa.oncontent.v1.OnContentService.");

    /* renamed from: b */
    public static final C61372an f143067b = new C54491a();

    /* renamed from: c */
    public static final C54492b f143068c = new C54492b();

    /* renamed from: f */
    private static final C31164au f143069f = C31164au.m58092b("google.internal.search.gsa.oncontent.v1.OnContentService/");

    /* renamed from: g */
    private static final C31164au f143070g = C31164au.m58092b("oncontent-pa.googleapis.com");

    /* renamed from: d */
    public final C58485gu f143071d;

    /* renamed from: e */
    public final C58528ij f143072e = new C58526ih().mo55486f();

    /* renamed from: h */
    private final C58495hd f143073h;

    static {
        C31164au.m58092b("google.internal.search.gsa.oncontent.v1.OnContentService");
    }

    private C54492b() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-oncontent-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-oncontent-pa.sandbox.googleapis.com");
        e.mo55395g("oncontent-pa.mtls.googleapis.com");
        e.mo55395g("prodsearchqual-oncontent-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("prodsearchqual-oncontent-pa.sandbox.googleapis.com");
        e.mo55395g("staging-oncontent-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-oncontent-pa.sandbox.googleapis.com");
        e.mo55395g("oncontent-pa.googleapis.com");
        this.f143071d = e.mo55394f();
        C61372an anVar = f143067b;
        new C58759qy(anVar);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GetOnContentData", anVar);
        this.f143073h = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f143070g;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f143069f.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f143073h.containsKey(substring)) {
            return (C61372an) this.f143073h.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
