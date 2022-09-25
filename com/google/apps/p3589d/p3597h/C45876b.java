package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3590a.C45699p;
import com.google.apps.p3589d.p3590a.C45703t;
import com.google.apps.p3589d.p3593d.C45758q;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45938c;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;

/* renamed from: com.google.apps.d.h.b */
/* compiled from: PG */
final class C45876b extends C45867ah {

    /* renamed from: a */
    public static final /* synthetic */ int f120606a = 0;

    /* renamed from: e */
    private final double f120607e;

    /* renamed from: f */
    private final C45946k f120608f;

    public C45876b(C45758q qVar, C45946k kVar, double d, C45894t tVar) {
        super(qVar, tVar);
        this.f120608f = kVar;
        this.f120607e = d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C45699p mo50000a(C45703t tVar, C45944i iVar) {
        return this.f120579d.mo50016k(tVar, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C45879e mo50001b(C45944i iVar, C45944i iVar2) {
        return this.f120579d.mo50018o(iVar, iVar2);
    }

    /* renamed from: c */
    public final C45946k mo50005c() {
        return this.f120579d.mo50005c().mo50066l(this.f120608f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50002d(C45869aj ajVar, C45944i iVar, C45941f fVar) {
        int i;
        C45944i iVar2 = iVar;
        this.f120579d.mo50002d(ajVar, iVar2, fVar);
        C45937b bVar = (C45937b) iVar2;
        C45946k j = this.f120608f.mo50064j(bVar.f120725a, bVar.f120726b);
        int i2 = ((C45758q) this.f120611c).f120329a;
        if (i2 == 1 || i2 == 3) {
            C45938c cVar = (C45938c) j;
            double d = cVar.f120727a;
            double d2 = cVar.f120728b;
            double d3 = cVar.f120729c;
            double d4 = cVar.f120730d;
            double d5 = this.f120607e;
            i = 3;
            ajVar.mo50012c(d, d2, d3, d4, fVar, d5);
        } else {
            i = 3;
        }
        if (i2 == 2 || i2 == i) {
            C45938c cVar2 = (C45938c) j;
            ajVar.mo50012c(cVar2.f120727a, cVar2.f120730d, cVar2.f120729c, cVar2.f120728b, fVar, this.f120607e);
        }
    }
}
