package com.google.android.libraries.home.coreui.devicetile.model;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.model.t */
/* compiled from: PG */
public final class C23745t extends C23739n {

    /* renamed from: a */
    public final String f65095a;

    /* renamed from: b */
    public final float f65096b;

    /* renamed from: c */
    private final C23730e f65097c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23745t(String str, float f, C23730e eVar) {
        super(str);
        C69664n.m101061g(str, "templateId");
        this.f65095a = str;
        this.f65096b = f;
        this.f65097c = eVar;
    }

    /* renamed from: a */
    public final String mo29075a() {
        return this.f65095a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23745t)) {
            return false;
        }
        C23745t tVar = (C23745t) obj;
        return C69664n.m101066l(this.f65095a, tVar.f65095a) && C69664n.m101066l(Float.valueOf(this.f65096b), Float.valueOf(tVar.f65096b)) && C69664n.m101066l(this.f65097c, tVar.f65097c);
    }

    public final int hashCode() {
        int hashCode = ((this.f65095a.hashCode() * 31) + Float.floatToIntBits(this.f65096b)) * 31;
        C23730e eVar = this.f65097c;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        String str = this.f65095a;
        float f = this.f65096b;
        C23730e eVar = this.f65097c;
        return "FloatAction(templateId=" + str + ", newValue=" + f + ", challengeValue=" + eVar + ")";
    }
}
