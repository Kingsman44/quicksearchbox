package com.google.assistant.p3803ag.p3810d.p3811a;

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

/* renamed from: com.google.assistant.ag.d.a.b */
/* compiled from: PG */
public final class C49160b implements C61373ao {

    /* renamed from: a */
    public static final C31164au f127121a = C31164au.m58092b("assistant.proactive.v1.ProactiveBackend.");

    /* renamed from: b */
    public static final C61372an f127122b = new C49159a();

    /* renamed from: c */
    public static final C49160b f127123c = new C49160b();

    /* renamed from: f */
    private static final C31164au f127124f = C31164au.m58092b("assistant.proactive.v1.ProactiveBackend/");

    /* renamed from: g */
    private static final C31164au f127125g = C31164au.m58092b("proactivebackend-pa.googleapis.com");

    /* renamed from: d */
    public final C58485gu f127126d;

    /* renamed from: e */
    public final C58528ij f127127e = new C58526ih().mo55486f();

    /* renamed from: h */
    private final C58495hd f127128h;

    static {
        C31164au.m58092b("assistant.proactive.v1.ProactiveBackend");
    }

    private C49160b() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-proactivebackend-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-proactivebackend-pa.sandbox.googleapis.com");
        e.mo55395g("proactivebackend-pa.mtls.googleapis.com");
        e.mo55395g("staging-proactivebackend-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-proactivebackend-pa.sandbox.googleapis.com");
        e.mo55395g("proactivebackend-pa.googleapis.com");
        this.f127126d = e.mo55394f();
        C61372an anVar = f127122b;
        new C58759qy(anVar);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("Sync", anVar);
        this.f127128h = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f127125g;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f127124f.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f127128h.containsKey(substring)) {
            return (C61372an) this.f127128h.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
