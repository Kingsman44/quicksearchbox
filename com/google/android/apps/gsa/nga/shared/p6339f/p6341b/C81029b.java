package com.google.android.apps.gsa.nga.shared.p6339f.p6341b;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.b.b */
/* compiled from: PG */
final class C81029b extends C81040m {

    /* renamed from: a */
    private final boolean f222091a;

    /* renamed from: b */
    private final C58833ax f222092b;

    /* renamed from: c */
    private final C58833ax f222093c;

    public C81029b(boolean z, C58833ax axVar, C58833ax axVar2) {
        this.f222091a = z;
        this.f222092b = axVar;
        this.f222093c = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo74817a() {
        return this.f222093c;
    }

    /* renamed from: b */
    public final C58833ax mo74818b() {
        return this.f222092b;
    }

    /* renamed from: c */
    public final boolean mo74819c() {
        return this.f222091a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81040m) {
            C81040m mVar = (C81040m) obj;
            return this.f222091a == mVar.mo74819c() && this.f222092b.equals(mVar.mo74818b()) && this.f222093c.equals(mVar.mo74817a());
        }
    }

    public final int hashCode() {
        return (((((true != this.f222091a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f222092b.hashCode()) * 1000003) ^ this.f222093c.hashCode();
    }

    public final String toString() {
        boolean z = this.f222091a;
        String valueOf = String.valueOf(this.f222092b);
        String valueOf2 = String.valueOf(this.f222093c);
        return "ClientsState{storeClientIsActive=" + z + ", sodaEventStore=" + valueOf + ", sodaCallback=" + valueOf2 + "}";
    }
}
