package com.google.frameworks.p4619a.p4620a.p4621a.p4622a.p4623a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.frameworks.a.a.a.a.a.g */
/* compiled from: PG */
public final class C61277g implements C61373ao {

    /* renamed from: a */
    public static final C31164au f165732a = C31164au.m58092b("frameworks.debug.settings.proto.external.DebugSettingsPublicService.");

    /* renamed from: b */
    public static final C61372an f165733b = new C61271a();

    /* renamed from: c */
    public static final C61372an f165734c = new C61272b();

    /* renamed from: d */
    public static final C61372an f165735d = new C61273c();

    /* renamed from: e */
    public static final C61372an f165736e = new C61274d();

    /* renamed from: f */
    public static final C61372an f165737f = new C61275e();

    /* renamed from: g */
    public static final C61372an f165738g = new C61276f();

    /* renamed from: h */
    public static final C61277g f165739h = new C61277g();

    /* renamed from: k */
    private static final C31164au f165740k = C31164au.m58092b("frameworks.debug.settings.proto.external.DebugSettingsPublicService/");

    /* renamed from: l */
    private static final C31164au f165741l = C31164au.m58092b("debugsettings-pa.googleapis.com");

    /* renamed from: i */
    public final C58485gu f165742i;

    /* renamed from: j */
    public final C58528ij f165743j = new C58526ih().mo55486f();

    /* renamed from: m */
    private final C58495hd f165744m;

    static {
        C31164au.m58092b("frameworks.debug.settings.proto.external.DebugSettingsPublicService");
    }

    private C61277g() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-debugsettings-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-debugsettings-pa.sandbox.googleapis.com");
        e.mo55395g("daily0-debugsettings-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("daily0-debugsettings-pa.sandbox.googleapis.com");
        e.mo55395g("daily1-debugsettings-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("daily1-debugsettings-pa.sandbox.googleapis.com");
        e.mo55395g("daily2-debugsettings-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("daily2-debugsettings-pa.sandbox.googleapis.com");
        e.mo55395g("daily3-debugsettings-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("daily3-debugsettings-pa.sandbox.googleapis.com");
        e.mo55395g("daily4-debugsettings-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("daily4-debugsettings-pa.sandbox.googleapis.com");
        e.mo55395g("daily5-debugsettings-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("daily5-debugsettings-pa.sandbox.googleapis.com");
        e.mo55395g("daily6-debugsettings-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("daily6-debugsettings-pa.sandbox.googleapis.com");
        e.mo55395g("debugsettings-pa.mtls.googleapis.com");
        e.mo55395g("oneplatformcontrolplane-debugsettings-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("oneplatformcontrolplane-debugsettings-pa.sandbox.googleapis.com");
        e.mo55395g("debugsettings-pa.googleapis.com");
        this.f165742i = e.mo55394f();
        C61372an anVar = f165733b;
        C61372an anVar2 = f165734c;
        C61372an anVar3 = f165735d;
        C61372an anVar4 = f165736e;
        C61372an anVar5 = f165737f;
        C61372an anVar6 = f165738g;
        C58528ij.m90015O(anVar, anVar2, anVar3, anVar4, anVar5, anVar6, new C61372an[0]);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("ReadAllSettings", anVar);
        gzVar.mo55429h("UpdateSettings", anVar2);
        gzVar.mo55429h("CheckSettingsPropagation", anVar3);
        gzVar.mo55429h("UpdateCookieBasedStatus", anVar4);
        gzVar.mo55429h("SyncDebugSettingsFetchMetadata", anVar5);
        gzVar.mo55429h("GetTestIdentityWithDebugSettings", anVar6);
        this.f165744m = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f165741l;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f165740k.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f165744m.containsKey(substring)) {
            return (C61372an) this.f165744m.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
