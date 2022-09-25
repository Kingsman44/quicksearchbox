package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.lens.p4701g.C62301bx;

/* renamed from: com.google.android.libraries.lens.ondevice.k.b */
/* compiled from: PG */
final class C24562b extends C24595cf {

    /* renamed from: a */
    private final C62301bx f67248a;

    public C24562b(C62301bx bxVar) {
        if (bxVar != null) {
            this.f67248a = bxVar;
            return;
        }
        throw new NullPointerException("Null pageLayoutMutatorResult");
    }

    /* renamed from: a */
    public final C62301bx mo29957a() {
        return this.f67248a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24595cf) {
            return this.f67248a.equals(((C24595cf) obj).mo29957a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f67248a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f67248a.toString();
        return "Output{pageLayoutMutatorResult=" + obj + "}";
    }
}
