package com.google.android.libraries.lens.ondevice.p2018b.p2020b;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.ondevice.b.b.d */
/* compiled from: PG */
final class C24278d extends C24282h {

    /* renamed from: b */
    private final C58833ax f66330b;

    public C24278d(C58833ax axVar) {
        this.f66330b = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo29819a() {
        return this.f66330b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24282h) {
            return this.f66330b.equals(((C24282h) obj).mo29819a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f66330b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f66330b);
        return "RuntimeParameters{pageLayoutMutatorRuntimeParameters=" + valueOf + "}";
    }
}
