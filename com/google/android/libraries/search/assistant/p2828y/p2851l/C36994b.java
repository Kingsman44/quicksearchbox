package com.google.android.libraries.search.assistant.p2828y.p2851l;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.y.l.b */
/* compiled from: PG */
final class C36994b extends C36996d {

    /* renamed from: a */
    private final Optional f96356a;

    public C36994b(Optional optional) {
        this.f96356a = optional;
    }

    /* renamed from: a */
    public final Optional mo40524a() {
        return this.f96356a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36996d) {
            return this.f96356a.equals(((C36996d) obj).mo40524a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f96356a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f96356a);
        return "DisplayParamsConfiguration{foregroundComponent=" + valueOf + "}";
    }
}
