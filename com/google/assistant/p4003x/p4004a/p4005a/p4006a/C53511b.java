package com.google.assistant.p4003x.p4004a.p4005a.p4006a;

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

/* renamed from: com.google.assistant.x.a.a.a.b */
/* compiled from: PG */
public final class C53511b implements C61373ao {

    /* renamed from: a */
    public static final C31164au f140444a = C31164au.m58092b("assistant.frontend.v1.YoutubeAssistantFrontendProxyService.");

    /* renamed from: b */
    public static final C61372an f140445b = new C53510a();

    /* renamed from: c */
    public static final C53511b f140446c = new C53511b();

    /* renamed from: f */
    private static final C31164au f140447f = C31164au.m58092b("assistant.frontend.v1.YoutubeAssistantFrontendProxyService/");

    /* renamed from: g */
    private static final C31164au f140448g = C31164au.m58092b("assistantfrontend-pa.googleapis.com");

    /* renamed from: d */
    public final C58485gu f140449d;

    /* renamed from: e */
    public final C58528ij f140450e = new C58526ih().mo55486f();

    /* renamed from: h */
    private final C58495hd f140451h;

    static {
        C31164au.m58092b("assistant.frontend.v1.YoutubeAssistantFrontendProxyService");
    }

    private C53511b() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("asfe-shared-autopush-assistantfrontend-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("asfe-shared-autopush-assistantfrontend-pa.sandbox.googleapis.com");
        e.mo55395g("assistantfrontend-pa.mtls.googleapis.com");
        e.mo55395g("autopush-assistantfrontend-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-assistantfrontend-pa.sandbox.googleapis.com");
        e.mo55395g("autopushasan-assistantfrontend-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopushasan-assistantfrontend-pa.sandbox.googleapis.com");
        e.mo55395g("autopushmsan-assistantfrontend-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopushmsan-assistantfrontend-pa.sandbox.googleapis.com");
        e.mo55395g("ganeshnk-autopush-assistantfrontend-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("ganeshnk-autopush-assistantfrontend-pa.sandbox.googleapis.com");
        e.mo55395g("pewu-autopush-assistantfrontend-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("pewu-autopush-assistantfrontend-pa.sandbox.googleapis.com");
        e.mo55395g("prodsearchqual-assistantfrontend-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("prodsearchqual-assistantfrontend-pa.sandbox.googleapis.com");
        e.mo55395g("staging-assistantfrontend-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-assistantfrontend-pa.sandbox.googleapis.com");
        e.mo55395g("assistantfrontend-pa.googleapis.com");
        this.f140449d = e.mo55394f();
        C61372an anVar = f140445b;
        new C58759qy(anVar);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GetYoutubeAssistantAction", anVar);
        this.f140451h = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f140448g;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f140447f.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f140451h.containsKey(substring)) {
            return (C61372an) this.f140451h.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
