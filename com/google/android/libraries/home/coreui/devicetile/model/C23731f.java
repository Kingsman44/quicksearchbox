package com.google.android.libraries.home.coreui.devicetile.model;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.model.f */
/* compiled from: PG */
public final class C23731f extends C23739n {

    /* renamed from: a */
    public final String f64912a;

    /* renamed from: b */
    private final C23730e f64913b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23731f(String str, C23730e eVar) {
        super(str);
        C69664n.m101061g(str, "templateId");
        this.f64912a = str;
        this.f64913b = eVar;
    }

    /* renamed from: a */
    public final String mo29075a() {
        return this.f64912a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23731f)) {
            return false;
        }
        C23731f fVar = (C23731f) obj;
        return C69664n.m101066l(this.f64912a, fVar.f64912a) && C69664n.m101066l(this.f64913b, fVar.f64913b);
    }

    public final int hashCode() {
        int hashCode = this.f64912a.hashCode() * 31;
        C23730e eVar = this.f64913b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        String str = this.f64912a;
        C23730e eVar = this.f64913b;
        return "CommandAction(templateId=" + str + ", challengeValue=" + eVar + ")";
    }
}
