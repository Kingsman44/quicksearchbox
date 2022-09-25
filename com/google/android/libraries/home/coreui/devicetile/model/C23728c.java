package com.google.android.libraries.home.coreui.devicetile.model;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.model.c */
/* compiled from: PG */
public final class C23728c extends C23739n {

    /* renamed from: a */
    public final String f64908a;

    /* renamed from: b */
    public final boolean f64909b;

    /* renamed from: c */
    private final C23730e f64910c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23728c(String str, boolean z, C23730e eVar) {
        super(str);
        C69664n.m101061g(str, "templateId");
        this.f64908a = str;
        this.f64909b = z;
        this.f64910c = eVar;
    }

    /* renamed from: a */
    public final String mo29075a() {
        return this.f64908a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23728c)) {
            return false;
        }
        C23728c cVar = (C23728c) obj;
        return C69664n.m101066l(this.f64908a, cVar.f64908a) && this.f64909b == cVar.f64909b && C69664n.m101066l(this.f64910c, cVar.f64910c);
    }

    public final int hashCode() {
        int hashCode = ((this.f64908a.hashCode() * 31) + (this.f64909b ? 1 : 0)) * 31;
        C23730e eVar = this.f64910c;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        String str = this.f64908a;
        boolean z = this.f64909b;
        C23730e eVar = this.f64910c;
        return "BooleanAction(templateId=" + str + ", newState=" + z + ", challengeValue=" + eVar + ")";
    }
}
