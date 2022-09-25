package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.dv */
/* compiled from: PG */
public final class C23548dv implements C23571er {

    /* renamed from: a */
    public static final C23547du f64458a = new C23547du();

    /* renamed from: b */
    private final C23546dt f64459b;

    public C23548dv(C23546dt dtVar) {
        C69664n.m101061g(dtVar, "partnerDeviceId");
        this.f64459b = dtVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return C23574eu.PARTNER_DEVICE_ID;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100944b(this.f64459b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23548dv) && C69664n.m101066l(this.f64459b, ((C23548dv) obj).f64459b);
    }

    public final int hashCode() {
        return this.f64459b.hashCode();
    }

    public final String toString() {
        C23546dt dtVar = this.f64459b;
        return "HomeAutomationPartnerDeviceIdTrait(partnerDeviceId=" + dtVar + ")";
    }
}
