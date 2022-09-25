package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.lens.p4701g.C62301bx;

/* renamed from: com.google.android.libraries.lens.ondevice.k.c */
/* compiled from: PG */
final class C24589c extends C24605cp {

    /* renamed from: a */
    private final C62301bx f67285a;

    public C24589c(C62301bx bxVar) {
        if (bxVar != null) {
            this.f67285a = bxVar;
            return;
        }
        throw new NullPointerException("Null pageLayoutMutatorResult");
    }

    /* renamed from: a */
    public final C62301bx mo29961a() {
        return this.f67285a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24605cp) {
            return this.f67285a.equals(((C24605cp) obj).mo29961a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f67285a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f67285a.toString();
        return "Output{pageLayoutMutatorResult=" + obj + "}";
    }
}
