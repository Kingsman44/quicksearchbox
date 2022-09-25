package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.dd */
/* compiled from: PG */
public final class C23530dd implements C23571er {

    /* renamed from: a */
    public static final C23529dc f64281a = new C23529dc();

    /* renamed from: b */
    public static final C23525cz f64282b = C23524cy.m43926b("off", false);

    /* renamed from: c */
    public static final C23528db f64283c = new C23528db(0, false);

    /* renamed from: d */
    public final C23525cz f64284d;

    /* renamed from: e */
    private final C23528db f64285e;

    public C23530dd() {
        this(f64282b, f64283c);
    }

    public C23530dd(C23525cz czVar, C23528db dbVar) {
        C69664n.m101061g(czVar, "onOffParameter");
        C69664n.m101061g(dbVar, "onOffReasonParameter");
        this.f64284d = czVar;
        this.f64285e = dbVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return C23574eu.ON_OFF;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100947e(this.f64284d, this.f64285e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23530dd)) {
            return false;
        }
        C23530dd ddVar = (C23530dd) obj;
        return C69664n.m101066l(this.f64284d, ddVar.f64284d) && C69664n.m101066l(this.f64285e, ddVar.f64285e);
    }

    public final int hashCode() {
        return (this.f64284d.hashCode() * 31) + this.f64285e.hashCode();
    }

    public final String toString() {
        C23525cz czVar = this.f64284d;
        C23528db dbVar = this.f64285e;
        return "HomeAutomationOnOffTrait(onOffParameter=" + czVar + ", onOffReasonParameter=" + dbVar + ")";
    }
}
