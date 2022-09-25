package com.google.p4172bg.p4173a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.bg.a.a */
/* compiled from: PG */
final class C55690a extends C55691b {

    /* renamed from: a */
    private final int f146923a;

    /* renamed from: b */
    private final C58485gu f146924b;

    public C55690a(int i, C58485gu guVar) {
        this.f146923a = i;
        if (guVar != null) {
            this.f146924b = guVar;
            return;
        }
        throw new NullPointerException("Null children");
    }

    /* renamed from: a */
    public final int mo54264a() {
        return this.f146923a;
    }

    /* renamed from: b */
    public final C58485gu mo54265b() {
        return this.f146924b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C55691b) {
            C55691b bVar = (C55691b) obj;
            return this.f146923a == bVar.mo54264a() && C58597ky.m90218i(this.f146924b, bVar.mo54265b());
        }
    }

    public final int hashCode() {
        return ((this.f146923a ^ 1000003) * 1000003) ^ this.f146924b.hashCode();
    }

    public final String toString() {
        int i = this.f146923a;
        String obj = this.f146924b.toString();
        return "EntityInfo{index=" + i + ", children=" + obj + "}";
    }
}
