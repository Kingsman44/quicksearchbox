package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Collection;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.ek */
/* compiled from: PG */
public final class C23564ek implements C23571er {

    /* renamed from: a */
    public static final C23563ej f64483a = new C23563ej();

    /* renamed from: b */
    public static final C23562ei f64484b = C23560eg.m43969b(C23561eh.STOPPED.f64481e, false);

    /* renamed from: c */
    private final boolean f64485c;

    /* renamed from: d */
    private final List f64486d;

    /* renamed from: e */
    private final C23574eu f64487e;

    /* renamed from: f */
    private final C23562ei f64488f;

    /* renamed from: g */
    private final C23566em f64489g;

    public C23564ek(boolean z, List list, C23574eu euVar, C23562ei eiVar, C23566em emVar) {
        C69664n.m101061g(list, "availableZones");
        C69664n.m101061g(euVar, "typeVal");
        C69664n.m101061g(eiVar, "startStopParameter");
        C69664n.m101061g(emVar, "startStopZoneParameter");
        this.f64485c = z;
        this.f64486d = list;
        this.f64487e = euVar;
        this.f64488f = eiVar;
        this.f64489g = emVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return this.f64487e;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100947e(this.f64488f, this.f64489g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23564ek)) {
            return false;
        }
        C23564ek ekVar = (C23564ek) obj;
        return this.f64485c == ekVar.f64485c && C69664n.m101066l(this.f64486d, ekVar.f64486d) && this.f64487e == ekVar.f64487e && C69664n.m101066l(this.f64488f, ekVar.f64488f) && C69664n.m101066l(this.f64489g, ekVar.f64489g);
    }

    public final int hashCode() {
        return ((((((((this.f64485c ? 1 : 0) * true) + this.f64486d.hashCode()) * 31) + this.f64487e.hashCode()) * 31) + this.f64488f.hashCode()) * 31) + this.f64489g.hashCode();
    }

    public final String toString() {
        boolean z = this.f64485c;
        List list = this.f64486d;
        C23574eu euVar = this.f64487e;
        C23562ei eiVar = this.f64488f;
        C23566em emVar = this.f64489g;
        return "HomeAutomationStartStopTrait(isPausable=" + z + ", availableZones=" + list + ", typeVal=" + euVar + ", startStopParameter=" + eiVar + ", startStopZoneParameter=" + emVar + ")";
    }
}
