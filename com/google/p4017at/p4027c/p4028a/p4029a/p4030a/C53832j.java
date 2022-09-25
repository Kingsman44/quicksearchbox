package com.google.p4017at.p4027c.p4028a.p4029a.p4030a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.c.a.a.a.j */
/* compiled from: PG */
public final class C53832j implements C61373ao {

    /* renamed from: a */
    public static final C31164au f141273a = C31164au.m58092b("google.internal.discover.channels.v1.DiscoverChannels.");

    /* renamed from: b */
    public static final C61372an f141274b = new C53823a();

    /* renamed from: c */
    public static final C61372an f141275c = new C53824b();

    /* renamed from: d */
    public static final C61372an f141276d = new C53825c();

    /* renamed from: e */
    public static final C61372an f141277e = new C53826d();

    /* renamed from: f */
    public static final C61372an f141278f = new C53827e();

    /* renamed from: g */
    public static final C61372an f141279g = new C53828f();

    /* renamed from: h */
    public static final C61372an f141280h = new C53829g();

    /* renamed from: i */
    public static final C61372an f141281i = new C53830h();

    /* renamed from: j */
    public static final C61372an f141282j = new C53831i();

    /* renamed from: k */
    public static final C53832j f141283k = new C53832j();

    /* renamed from: n */
    private static final C31164au f141284n = C31164au.m58092b("google.internal.discover.channels.v1.DiscoverChannels/");

    /* renamed from: o */
    private static final C31164au f141285o = C31164au.m58092b("discover-pa.googleapis.com");

    /* renamed from: l */
    public final C58485gu f141286l;

    /* renamed from: m */
    public final C58528ij f141287m = new C58526ih().mo55486f();

    /* renamed from: p */
    private final C58495hd f141288p;

    static {
        C31164au.m58092b("google.internal.discover.channels.v1.DiscoverChannels");
    }

    private C53832j() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.mtls.googleapis.com");
        e.mo55395g("staging-discover-pa.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-discover-pa.sandbox.googleapis.com");
        e.mo55395g("discover-pa.googleapis.com");
        this.f141286l = e.mo55394f();
        C61372an anVar = f141274b;
        C61372an anVar2 = f141275c;
        C61372an anVar3 = f141276d;
        C61372an anVar4 = f141277e;
        C61372an anVar5 = f141278f;
        C61372an anVar6 = f141279g;
        C61372an anVar7 = f141280h;
        C61372an anVar8 = f141281i;
        C61372an anVar9 = f141282j;
        C58528ij.m90015O(anVar, anVar2, anVar3, anVar4, anVar5, anVar6, anVar7, anVar8, anVar9);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GetChannel", anVar);
        gzVar.mo55429h("ListChannels", anVar2);
        gzVar.mo55429h("FollowChannel", anVar3);
        gzVar.mo55429h("BatchFollowChannels", anVar4);
        gzVar.mo55429h("UnfollowChannel", anVar5);
        gzVar.mo55429h("BlockChannel", anVar6);
        gzVar.mo55429h("UnblockChannel", anVar7);
        gzVar.mo55429h("SubscribeChannel", anVar8);
        gzVar.mo55429h("UnsubscribeChannel", anVar9);
        this.f141288p = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f141285o;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f141284n.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f141288p.containsKey(substring)) {
            return (C61372an) this.f141288p.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
