package com.google.android.libraries.home.coreui.devicetile.p1954a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.a.o */
/* compiled from: PG */
public final class C23653o extends C23642d {

    /* renamed from: a */
    public final String f64699a;

    /* renamed from: b */
    public final boolean f64700b;

    /* renamed from: c */
    public final CharSequence f64701c;

    /* renamed from: d */
    private final C23641c f64702d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23653o(String str, C23641c cVar) {
        super(str, false, 14);
        C69664n.m101061g(str, "templateId");
        this.f64699a = str;
        this.f64702d = cVar;
        this.f64700b = cVar.f64657a;
        this.f64701c = cVar.f64658b;
    }

    /* renamed from: a */
    public final String mo28966a() {
        return this.f64699a;
    }

    /* renamed from: b */
    public final boolean mo28976b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo28977c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23653o)) {
            return false;
        }
        C23653o oVar = (C23653o) obj;
        return C69664n.m101066l(this.f64699a, oVar.f64699a) && C69664n.m101066l(this.f64702d, oVar.f64702d);
    }

    public final int hashCode() {
        return ((this.f64699a.hashCode() * 31) + this.f64702d.hashCode()) * 29791;
    }

    public final String toString() {
        String str = this.f64699a;
        C23641c cVar = this.f64702d;
        return "ToggleTemplate(templateId=" + str + ", button=" + cVar + ", readonly=false, isLoading=false, isExpanded=false)";
    }
}
