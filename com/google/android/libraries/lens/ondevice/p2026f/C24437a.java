package com.google.android.libraries.lens.ondevice.p2026f;

import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63242o;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a */
/* compiled from: PG */
final class C24437a extends C24489r {

    /* renamed from: a */
    private final C63242o f66909a;

    /* renamed from: b */
    private final C24803n f66910b;

    public C24437a(C63242o oVar, C24803n nVar) {
        if (oVar != null) {
            this.f66909a = oVar;
            if (nVar != null) {
                this.f66910b = nVar;
                return;
            }
            throw new NullPointerException("Null dependencyStatus");
        }
        throw new NullPointerException("Null primitiveType");
    }

    /* renamed from: a */
    public final C24803n mo29886a() {
        return this.f66910b;
    }

    /* renamed from: b */
    public final C63242o mo29887b() {
        return this.f66909a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24489r) {
            C24489r rVar = (C24489r) obj;
            return this.f66909a.equals(rVar.mo29887b()) && this.f66910b.equals(rVar.mo29886a());
        }
    }

    public final int hashCode() {
        return ((this.f66909a.hashCode() ^ 1000003) * 1000003) ^ this.f66910b.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f66909a.f170881r);
        String obj = this.f66910b.toString();
        return "PrimitiveDependencyStatus{primitiveType=" + num + ", dependencyStatus=" + obj + "}";
    }
}
