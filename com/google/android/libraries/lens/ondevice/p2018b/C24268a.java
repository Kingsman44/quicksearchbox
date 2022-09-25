package com.google.android.libraries.lens.ondevice.p2018b;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.ondevice.b.a */
/* compiled from: PG */
public final class C24268a extends C24274b {

    /* renamed from: a */
    private final boolean f66315a;

    /* renamed from: b */
    private final C58833ax f66316b;

    public C24268a(boolean z, C58833ax axVar) {
        this.f66315a = z;
        this.f66316b = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo29803a() {
        return this.f66316b;
    }

    /* renamed from: b */
    public final boolean mo29804b() {
        return this.f66315a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24274b) {
            C24274b bVar = (C24274b) obj;
            return this.f66315a == bVar.mo29804b() && this.f66316b.equals(bVar.mo29803a());
        }
    }

    public final int hashCode() {
        return (((true != this.f66315a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f66316b.hashCode();
    }

    public final String toString() {
        boolean z = this.f66315a;
        String obj = this.f66316b.toString();
        return "DependencyMetadata{hasAllDependencies=" + z + ", dependencyStatus=" + obj + "}";
    }
}
