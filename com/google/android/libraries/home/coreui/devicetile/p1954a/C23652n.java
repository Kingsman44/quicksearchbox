package com.google.android.libraries.home.coreui.devicetile.p1954a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.a.n */
/* compiled from: PG */
public final class C23652n extends C23642d {

    /* renamed from: a */
    public final C23646h f64694a;

    /* renamed from: b */
    public final boolean f64695b;

    /* renamed from: c */
    public final CharSequence f64696c;

    /* renamed from: d */
    private final String f64697d;

    /* renamed from: e */
    private final C23641c f64698e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23652n(String str, C23641c cVar, C23646h hVar) {
        super((String) null, false, 15);
        C69664n.m101061g(str, "templateId");
        this.f64697d = str;
        this.f64698e = cVar;
        this.f64694a = hVar;
        this.f64695b = cVar.f64657a;
        this.f64696c = cVar.f64658b;
    }

    /* renamed from: a */
    public final String mo28966a() {
        return this.f64697d;
    }

    /* renamed from: b */
    public final boolean mo28976b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23652n)) {
            return false;
        }
        C23652n nVar = (C23652n) obj;
        return C69664n.m101066l(this.f64697d, nVar.f64697d) && C69664n.m101066l(this.f64698e, nVar.f64698e) && C69664n.m101066l(this.f64694a, nVar.f64694a);
    }

    public final int hashCode() {
        return ((((this.f64697d.hashCode() * 31) + this.f64698e.hashCode()) * 31) + this.f64694a.hashCode()) * 961;
    }

    public final String toString() {
        String str = this.f64697d;
        C23641c cVar = this.f64698e;
        C23646h hVar = this.f64694a;
        return "ToggleRangeTemplate(templateId=" + str + ", controlButton=" + cVar + ", range=" + hVar + ", readonly=false, isExpanded=false)";
    }
}
