package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Collection;
import java.util.Set;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.cv */
/* compiled from: PG */
public final class C23521cv implements C23571er {

    /* renamed from: a */
    public static final C23520cu f64272a = new C23520cu();

    /* renamed from: b */
    public static final C23580g f64273b = C23579f.m44002b(C69498ao.f185920a);

    /* renamed from: c */
    private final C23574eu f64274c;

    /* renamed from: d */
    private final Set f64275d;

    /* renamed from: e */
    private final C23580g f64276e;

    public C23521cv(C23574eu euVar, Set set, C23580g gVar) {
        C69664n.m101061g(euVar, "valueType");
        C69664n.m101061g(set, "supportedControls");
        C69664n.m101061g(gVar, "availableTransportControlsParameter");
        this.f64274c = euVar;
        this.f64275d = set;
        this.f64276e = gVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return this.f64274c;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100944b(this.f64276e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23521cv)) {
            return false;
        }
        C23521cv cvVar = (C23521cv) obj;
        return this.f64274c == cvVar.f64274c && C69664n.m101066l(this.f64275d, cvVar.f64275d) && C69664n.m101066l(this.f64276e, cvVar.f64276e);
    }

    public final int hashCode() {
        return (((this.f64274c.hashCode() * 31) + this.f64275d.hashCode()) * 31) + this.f64276e.hashCode();
    }

    public final String toString() {
        C23574eu euVar = this.f64274c;
        Set set = this.f64275d;
        C23580g gVar = this.f64276e;
        return "HomeAutomationMediaTransportationControlTrait(valueType=" + euVar + ", supportedControls=" + set + ", availableTransportControlsParameter=" + gVar + ")";
    }
}
