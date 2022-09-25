package com.google.p4017at.p4021b.p4022a.p4023a.p4024a.p4025a.p4026a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.b.a.a.a.a.a.c */
/* compiled from: PG */
public final class C53819c implements C61373ao {

    /* renamed from: a */
    public static final C31164au f141245a = C31164au.m58092b("google.internal.assistant.voice.growth.chalkboard.v1.AssistantLearningCenterService.");

    /* renamed from: b */
    public static final C61372an f141246b = new C53817a();

    /* renamed from: c */
    public static final C61372an f141247c = new C53818b();

    /* renamed from: d */
    public static final C53819c f141248d = new C53819c();

    /* renamed from: g */
    private static final C31164au f141249g = C31164au.m58092b("google.internal.assistant.voice.growth.chalkboard.v1.AssistantLearningCenterService/");

    /* renamed from: h */
    private static final C31164au f141250h = C31164au.m58092b("chalkboard-pa.googleapis.com");

    /* renamed from: e */
    public final C58485gu f141251e;

    /* renamed from: f */
    public final C58528ij f141252f = new C58526ih().mo55486f();

    /* renamed from: i */
    private final C58495hd f141253i;

    static {
        C31164au.m58092b("google.internal.assistant.voice.growth.chalkboard.v1.AssistantLearningCenterService");
    }

    private C53819c() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-chalkboard-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-chalkboard-pa.sandbox.googleapis.com");
        e.mo55395g("chalkboard-pa.mtls.googleapis.com");
        e.mo55395g("staging-chalkboard-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-chalkboard-pa.sandbox.googleapis.com");
        e.mo55395g("chalkboard-pa.googleapis.com");
        this.f141251e = e.mo55394f();
        C61372an anVar = f141246b;
        C61372an anVar2 = f141247c;
        C58528ij.m90011K(anVar, anVar2);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("PrefetchChalkboard", anVar);
        gzVar.mo55429h("FetchOneLearningCenterData", anVar2);
        this.f141253i = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f141250h;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f141249g.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f141253i.containsKey(substring)) {
            return (C61372an) this.f141253i.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
