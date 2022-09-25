package com.google.android.libraries.storage.protostore;

/* renamed from: com.google.android.libraries.storage.protostore.d */
/* compiled from: PG */
public final class C42959d extends C42941ci {

    /* renamed from: a */
    private final C42940ch f112364a;

    public C42959d(C42940ch chVar) {
        if (chVar != null) {
            this.f112364a = chVar;
            return;
        }
        throw new NullPointerException("Null service");
    }

    /* renamed from: a */
    public final C42940ch mo46015a() {
        return this.f112364a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42941ci) {
            return this.f112364a.equals(((C42941ci) obj).mo46015a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f112364a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f112364a.toString();
        return "SignallingConfig{service=" + obj + "}";
    }
}
