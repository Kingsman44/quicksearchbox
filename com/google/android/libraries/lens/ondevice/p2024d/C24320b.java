package com.google.android.libraries.lens.ondevice.p2024d;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.ondevice.d.b */
/* compiled from: PG */
public final class C24320b extends C24425s {

    /* renamed from: a */
    private final C24424r f66570a;

    /* renamed from: b */
    private final C58833ax f66571b;

    public C24320b(C24424r rVar, C58833ax axVar) {
        this.f66570a = rVar;
        this.f66571b = axVar;
    }

    /* renamed from: a */
    public final C24424r mo29866a() {
        return this.f66570a;
    }

    /* renamed from: b */
    public final C58833ax mo29867b() {
        return this.f66571b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24425s) {
            C24425s sVar = (C24425s) obj;
            return this.f66570a.equals(sVar.mo29866a()) && this.f66571b.equals(sVar.mo29867b());
        }
    }

    public final int hashCode() {
        return ((this.f66570a.hashCode() ^ 1000003) * 1000003) ^ this.f66571b.hashCode();
    }

    public final String toString() {
        String obj = this.f66570a.toString();
        String obj2 = this.f66571b.toString();
        return "CascadeInputContext{cascadeId=" + obj + ", lodeResourceHolder=" + obj2 + "}";
    }
}
