package com.google.android.libraries.web.base;

/* compiled from: PG */
final class AutoValue_WebFragmentId extends WebFragmentId {

    /* renamed from: a */
    private final long f112961a;

    public AutoValue_WebFragmentId(long j) {
        this.f112961a = j;
    }

    /* renamed from: a */
    public final long mo46294a() {
        return this.f112961a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof WebFragmentId) && this.f112961a == ((WebFragmentId) obj).mo46294a();
    }

    public final int hashCode() {
        long j = this.f112961a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        long j = this.f112961a;
        return "WebFragmentId{id=" + j + "}";
    }
}
