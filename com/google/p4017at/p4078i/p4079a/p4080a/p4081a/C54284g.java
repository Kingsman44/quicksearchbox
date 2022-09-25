package com.google.p4017at.p4078i.p4079a.p4080a.p4081a;

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

/* renamed from: com.google.at.i.a.a.a.g */
/* compiled from: PG */
public final class C54284g implements C61373ao {

    /* renamed from: a */
    public static final C31164au f142542a = C31164au.m58092b("google.internal.people.v2.minimal.PeopleApiAutocompleteMinimalService.");

    /* renamed from: b */
    public static final C61372an f142543b = new C54283f();

    /* renamed from: c */
    public static final C54284g f142544c = new C54284g();

    /* renamed from: f */
    private static final C31164au f142545f = C31164au.m58092b("google.internal.people.v2.minimal.PeopleApiAutocompleteMinimalService/");

    /* renamed from: g */
    private static final C31164au f142546g = C31164au.m58092b("people-pa.googleapis.com");

    /* renamed from: d */
    public final C58485gu f142547d;

    /* renamed from: e */
    public final C58528ij f142548e = new C58526ih().mo55486f();

    /* renamed from: h */
    private final C58495hd f142549h;

    static {
        C31164au.m58092b("google.internal.people.v2.minimal.PeopleApiAutocompleteMinimalService");
    }

    private C54284g() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-people-pa.sandbox.googleapis.com");
        e.mo55395g("staging-people-pa.sandbox.googleapis.com");
        e.mo55395g("people-pa.googleapis.com");
        this.f142547d = e.mo55394f();
        C61372an anVar = f142543b;
        new C58759qy(anVar);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("ListAutocompletions", anVar);
        this.f142549h = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f142546g;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f142545f.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f142549h.containsKey(substring)) {
            return (C61372an) this.f142549h.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
