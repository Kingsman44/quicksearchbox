package com.google.android.libraries.p11029ao.p11032c;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.ao.c.f */
/* compiled from: PG */
public final class C147805f {

    /* renamed from: a */
    public static final C147805f f398779a;

    /* renamed from: b */
    public static final C147805f f398780b;

    /* renamed from: c */
    public final boolean f398781c;

    /* renamed from: d */
    public final boolean f398782d;

    /* renamed from: e */
    public final C58485gu f398783e;

    static {
        C147804e eVar = new C147804e();
        eVar.mo124474b();
        f398779a = eVar.mo124473a();
        C147804e eVar2 = new C147804e();
        C58838bb.m90884s(eVar2.f398777b == null, "A SourcePolicy can only set internal() or external() once.");
        eVar2.f398777b = true;
        f398780b = eVar2.mo124473a();
    }

    public C147805f(boolean z, boolean z2, C58485gu guVar) {
        this.f398781c = z;
        this.f398782d = z2;
        this.f398783e = guVar;
    }

    /* renamed from: a */
    public static C147805f m240906a(String str) {
        C147804e eVar = new C147804e();
        eVar.mo124474b();
        eVar.f398778c = true;
        C147803d dVar = new C147803d(str);
        C58838bb.m90866a(eVar.f398777b, "Must call internal() or external() before appending rules.");
        eVar.f398776a.mo55395g(dVar);
        return eVar.mo124473a();
    }
}
