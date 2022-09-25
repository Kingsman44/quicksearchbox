package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3590a.C45682aa;
import com.google.apps.p3589d.p3590a.C45690g;
import com.google.apps.p3589d.p3590a.C45691h;
import com.google.apps.p3589d.p3590a.C45698o;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3595f.C45822y;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;
import com.google.apps.p3589d.p3600k.C45947l;

/* renamed from: com.google.apps.d.h.aj */
/* compiled from: PG */
public final class C45869aj {

    /* renamed from: a */
    public C45946k f120583a = C45946k.f120735e;

    /* renamed from: b */
    public C45946k f120584b = C45946k.f120735e;

    /* renamed from: c */
    public final C45698o f120585c;

    /* renamed from: d */
    private final C45723n f120586d = new C45723n(0);

    /* renamed from: e */
    private final C45723n f120587e = new C45723n(0);

    private C45869aj(C45698o oVar) {
        this.f120585c = oVar;
    }

    /* renamed from: a */
    public static C45682aa m81860a(C45880f fVar, C45698o oVar, C45941f fVar2) {
        C45869aj ajVar = new C45869aj(oVar);
        C45946k r = fVar.mo50007r();
        C45946k c = fVar.mo50005c();
        ajVar.f120583a = ajVar.f120585c.mo49793i(r);
        ajVar.f120584b = ajVar.f120585c.mo49793i(c);
        fVar.mo50002d(ajVar, C45944i.f120734c, fVar2);
        return C45682aa.m81362f(ajVar.f120586d.mo49829f(), ajVar.f120587e.mo49829f(), ajVar.f120583a, ajVar.f120584b, ajVar.f120585c);
    }

    /* renamed from: d */
    private final C45944i m81861d(double d, double d2) {
        return new C45937b(this.f120585c.mo49790e(d), this.f120585c.mo49791f(d2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo50011b(C45822y yVar, double d, double d2, C45941f fVar, boolean z) {
        C45946k kVar;
        C45822y e = yVar.mo49949e();
        C45723n nVar = this.f120587e;
        double d3 = this.f120585c.mo49789d(yVar.mo49946b());
        int c = yVar.mo49947c();
        C45946k i = this.f120585c.mo49793i(yVar.mo49951f());
        if (e == null) {
            kVar = null;
        } else {
            kVar = this.f120585c.mo49793i(e.mo49951f());
        }
        nVar.f120220a.add(new C45690g(d3, c, i, kVar, m81861d(d, d2), z, fVar, C45947l.m82055a(c)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo50012c(double d, double d2, double d3, double d4, C45941f fVar, double d5) {
        C45723n nVar = this.f120586d;
        nVar.f120220a.add(new C45691h(m81861d(d, d2), m81861d(d3, d4), fVar, this.f120585c.mo49789d(d5)));
    }
}
