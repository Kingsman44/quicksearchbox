package com.google.p4017at.p4078i.p4079a.p4080a.p4081a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.at.i.a.a.a.e */
/* compiled from: PG */
public final class C54282e implements C61373ao {

    /* renamed from: a */
    public static final C31164au f142529a = C31164au.m58092b("google.internal.people.v2.minimal.InternalPeopleMinimalService.");

    /* renamed from: b */
    public static final C61372an f142530b = new C54278a();

    /* renamed from: c */
    public static final C61372an f142531c = new C54279b();

    /* renamed from: d */
    public static final C61372an f142532d = new C54280c();

    /* renamed from: e */
    public static final C61372an f142533e = new C54281d();

    /* renamed from: f */
    public static final C54282e f142534f = new C54282e();

    /* renamed from: i */
    private static final C31164au f142535i = C31164au.m58092b("google.internal.people.v2.minimal.InternalPeopleMinimalService/");

    /* renamed from: j */
    private static final C31164au f142536j = C31164au.m58092b("people-pa.googleapis.com");

    /* renamed from: g */
    public final C58485gu f142537g;

    /* renamed from: h */
    public final C58528ij f142538h;

    /* renamed from: k */
    private final C58495hd f142539k;

    static {
        C31164au.m58092b("google.internal.people.v2.minimal.InternalPeopleMinimalService");
    }

    private C54282e() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-people-pa.sandbox.googleapis.com");
        e.mo55395g("staging-people-pa.sandbox.googleapis.com");
        e.mo55395g("people-pa.googleapis.com");
        this.f142537g = e.mo55394f();
        C58526ih ihVar = new C58526ih();
        ihVar.mo55373c("https://www.googleapis.com/auth/peopleapi.readonly");
        this.f142538h = ihVar.mo55486f();
        C61372an anVar = f142530b;
        C61372an anVar2 = f142531c;
        C61372an anVar3 = f142532d;
        C61372an anVar4 = f142533e;
        C58528ij.m90013M(anVar, anVar2, anVar3, anVar4);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GetPeople", anVar);
        gzVar.mo55429h("ListContactPeople", anVar2);
        gzVar.mo55429h("ListRankedTargets", anVar3);
        gzVar.mo55429h("ListPeopleByKnownId", anVar4);
        this.f142539k = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f142536j;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f142535i.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f142539k.containsKey(substring)) {
            return (C61372an) this.f142539k.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
