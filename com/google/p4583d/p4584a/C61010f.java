package com.google.p4583d.p4584a;

import com.google.android.gms.measurement.p10848a.C145153bd;
import com.google.common.p4535g.C59203do;
import com.google.p4583d.p4584a.p4585a.C60953a;
import com.google.p4583d.p4584a.p4586b.C60955a;
import com.google.p4583d.p4584a.p4586b.C60966l;
import com.google.p4583d.p4584a.p4588d.C60979f;
import com.google.p4583d.p4584a.p4588d.C60986m;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4588d.C60988o;
import com.google.p4583d.p4584a.p4589e.C60996c;

/* renamed from: com.google.d.a.f */
/* compiled from: PG */
public final class C61010f {

    /* renamed from: a */
    final C60996c f165141a;

    /* renamed from: b */
    public final C61012g f165142b;

    /* renamed from: c */
    public final C61012g f165143c;

    /* renamed from: d */
    public final C60955a f165144d;

    public C61010f() {
        C60996c cVar = new C60996c();
        this.f165141a = cVar;
        C61012g gVar = new C61012g((C61012g) null, cVar);
        this.f165143c = gVar;
        this.f165142b = gVar.mo57525a();
        C60955a aVar = new C60955a();
        this.f165144d = aVar;
        gVar.mo57530f("require", new C60966l(aVar));
        aVar.mo57450a("internal.platform", C60993e.f165129a);
        gVar.mo57530f("runtime.counter", new C60979f(Double.valueOf(C59203do.f157270a)));
    }

    /* renamed from: a */
    public final C60987n mo57523a(C61012g gVar, C145153bd... bdVarArr) {
        C60987n nVar = C60987n.f165114f;
        for (C145153bd a : bdVarArr) {
            nVar = C60953a.m93112a(a);
            C61013h.m93270l(this.f165143c);
            if ((nVar instanceof C60988o) || (nVar instanceof C60986m)) {
                nVar = this.f165141a.mo57519a(gVar, nVar);
            }
        }
        return nVar;
    }
}
