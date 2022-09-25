package com.google.android.libraries.p10915aa.p10920b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.aa.b.u */
/* compiled from: PG */
final class C146698u extends C146661ai {

    /* renamed from: a */
    private final Optional f396141a;

    public C146698u(Optional optional) {
        this.f396141a = optional;
    }

    /* renamed from: a */
    public final Optional mo123441a() {
        return this.f396141a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146661ai) {
            return this.f396141a.equals(((C146661ai) obj).mo123441a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f396141a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f396141a);
        return "ProcessedReferenceScreenCondition{reference=" + valueOf + "}";
    }
}
