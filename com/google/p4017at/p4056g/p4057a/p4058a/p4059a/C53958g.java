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

/* renamed from: com.google.at.g.a.a.a.g */
/* compiled from: PG */
public final class C53958g implements C61373ao {

    /* renamed from: a */
    public static final C31164au f141562a = C31164au.m58092b("google.internal.lens.api.v1.LensApplicationService.");

    /* renamed from: b */
    public static final C61372an f141563b = new C53952a();

    /* renamed from: c */
    public static final C61372an f141564c = new C53953b();

    /* renamed from: d */
    public static final C61372an f141565d = new C53954c();

    /* renamed from: e */
    public static final C61372an f141566e = new C53955d();

    /* renamed from: f */
    public static final C61372an f141567f = new C53956e();

    /* renamed from: g */
    public static final C61372an f141568g = new C53957f();

    /* renamed from: h */
    public static final C53958g f141569h = new C53958g();

    /* renamed from: k */
    private static final C31164au f141570k = C31164au.m58092b("google.internal.lens.api.v1.LensApplicationService/");

    /* renamed from: l */
    private static final C31164au f141571l = C31164au.m58092b("lens-pa.googleapis.com");

    /* renamed from: i */
    public final C58485gu f141572i;

    /* renamed from: j */
    public final C58528ij f141573j;

    /* renamed from: m */
    private final C58495hd f141574m;

    static {
        C31164au.m58092b("google.internal.lens.api.v1.LensApplicationService");
    }

    private C53958g() {
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
        this.f141572i = e.mo55394f();
        C58526ih ihVar = new C58526ih();
        ihVar.mo55373c("https://www.googleapis.com/auth/lens");
        this.f141573j = ihVar.mo55486f();
        C61372an anVar = f141563b;
        C61372an anVar2 = f141564c;
        C61372an anVar3 = f141565d;
        C61372an anVar4 = f141566e;
        C61372an anVar5 = f141567f;
        C61372an anVar6 = f141568g;
        C58528ij.m90015O(anVar, anVar2, anVar3, anVar4, anVar5, anVar6, new C61372an[0]);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("SendCloudCopyPayload", anVar);
        gzVar.mo55429h("ListCloudCopyDevices", anVar2);
        gzVar.mo55429h("CloudCopyAck", anVar3);
        gzVar.mo55429h("TranslateText", anVar4);
        gzVar.mo55429h("StreamTranslateText", anVar5);
        gzVar.mo55429h("FetchTranslatedImage", anVar6);
        this.f141574m = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f141571l;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f141570k.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f141574m.containsKey(substring)) {
            return (C61372an) this.f141574m.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
