package com.google.apps.p3589d.p3600k;

import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45716g;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.apps.d.k.k */
/* compiled from: PG */
public abstract class C45946k {

    /* renamed from: e */
    public static final C45946k f120735e = m82043h(C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, C59203do.f157270a);

    /* renamed from: h */
    public static C45946k m82043h(double d, double d2, double d3, double d4) {
        double d5 = d;
        double d6 = d2;
        double d7 = d3;
        double d8 = d4;
        double min = Math.min(d5, d7);
        double min2 = Math.min(d6, d8);
        return new C45938c(min, min2, Math.max(d5, d7), Math.max(d6, d8));
    }

    /* renamed from: a */
    public abstract double mo50047a();

    /* renamed from: b */
    public abstract double mo50048b();

    /* renamed from: c */
    public abstract double mo50049c();

    /* renamed from: d */
    public abstract double mo50050d();

    /* renamed from: e */
    public final double mo50060e() {
        return (mo50049c() + mo50047a()) / 2.0d;
    }

    /* renamed from: f */
    public final double mo50061f() {
        return (mo50050d() + mo50048b()) / 2.0d;
    }

    /* renamed from: g */
    public final double mo50062g(C45944i iVar) {
        C45937b bVar = (C45937b) iVar;
        double max = Math.max(Math.abs(bVar.f120725a - mo50060e()) - ((mo50047a() - mo50049c()) / 2.0d), C59203do.f157270a);
        double max2 = Math.max(Math.abs(bVar.f120726b - mo50061f()) - ((mo50048b() - mo50050d()) / 2.0d), C59203do.f157270a);
        return (max * max) + (max2 * max2);
    }

    /* renamed from: i */
    public final C45946k mo50063i(C45716g gVar) {
        double c = mo50049c();
        double a = mo50047a();
        double d = mo50050d();
        double b = mo50048b();
        C45712c cVar = new C45712c(gVar);
        double d2 = c;
        double d3 = a;
        double d4 = d;
        while (cVar.hasNext()) {
            C45946k kVar = (C45946k) cVar.next();
            d2 = Math.min(d2, kVar.mo50049c());
            d3 = Math.max(d3, kVar.mo50047a());
            d4 = Math.min(d4, kVar.mo50050d());
            b = Math.max(b, kVar.mo50048b());
        }
        return m82043h(d2, d4, d3, b);
    }

    /* renamed from: j */
    public final C45946k mo50064j(double d, double d2) {
        return new C45938c(mo50049c() + d, mo50050d() + d2, mo50047a() + d, mo50048b() + d2);
    }

    /* renamed from: k */
    public final C45946k mo50065k() {
        return m82043h(-mo50050d(), mo50049c(), -mo50048b(), mo50047a());
    }

    /* renamed from: l */
    public final C45946k mo50066l(C45946k kVar) {
        return m82043h(Math.min(mo50049c(), kVar.mo50049c()), Math.min(mo50050d(), kVar.mo50050d()), Math.max(mo50047a(), kVar.mo50047a()), Math.max(mo50048b(), kVar.mo50048b()));
    }
}
