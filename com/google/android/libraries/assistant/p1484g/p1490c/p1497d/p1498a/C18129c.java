package com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a;

import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.C18109a;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1499a.C18112b;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1499a.C18114d;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1499a.C18115e;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1499a.C18116f;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b.C18128j;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.assistant.g.c.d.a.c */
/* compiled from: PG */
public final class C18129c {

    /* renamed from: a */
    private final String f51610a;

    /* renamed from: b */
    private final C18146t f51611b;

    /* renamed from: c */
    private final C18146t f51612c;

    private C18129c(String str, C18146t tVar, C18146t tVar2) {
        this.f51610a = str;
        this.f51611b = tVar;
        this.f51612c = tVar2;
    }

    /* renamed from: b */
    public static C18129c m35313b(String str) {
        return new C18129c(str, C18146t.f51633e, C18146t.f51633e);
    }

    /* renamed from: e */
    public static C18146t m35314e(C18128j jVar) {
        C18145s d = C18146t.m35339d(C18110a.f51576a);
        d.mo23633d(jVar, Function.CC.identity(), C18118b.f51592a);
        return d.mo23506a();
    }

    /* renamed from: a */
    public final C18109a mo23622a() {
        String str = this.f51610a;
        C18130d dVar = (C18130d) this.f51611b;
        Supplier supplier = dVar.f51613a;
        C58485gu guVar = dVar.f51614b;
        Function function = dVar.f51615c;
        C18130d dVar2 = (C18130d) this.f51612c;
        Supplier supplier2 = dVar2.f51613a;
        C58485gu guVar2 = dVar2.f51614b;
        return new C18112b(str, new C18116f(guVar), new C18115e(supplier2, guVar2, dVar2.f51615c), new C18114d(str, C18112b.m35276e(guVar), C18112b.m35276e(guVar2)));
    }

    /* renamed from: c */
    public final C18129c mo23623c(C18146t tVar) {
        return new C18129c(this.f51610a, tVar, this.f51612c);
    }

    /* renamed from: d */
    public final C18129c mo23624d(C18146t tVar) {
        return new C18129c(this.f51610a, this.f51611b, tVar);
    }
}
