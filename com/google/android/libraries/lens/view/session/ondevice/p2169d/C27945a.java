package com.google.android.libraries.lens.view.session.ondevice.p2169d;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.d.a */
/* compiled from: PG */
final class C27945a extends C27952h {

    /* renamed from: a */
    private final C58833ax f76100a;

    public C27945a(C58833ax axVar) {
        this.f76100a = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo33414a() {
        return this.f76100a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27952h) {
            return this.f76100a.equals(((C27952h) obj).mo33414a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f76100a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f76100a.toString();
        return "HybridEligibilityState{eligibleCascade=" + obj + "}";
    }
}
