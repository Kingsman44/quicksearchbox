package com.google.apps.tiktok.p3644h;

/* renamed from: com.google.apps.tiktok.h.m */
/* compiled from: PG */
final class C47136m extends C47127d {

    /* renamed from: a */
    private final String f122752a;

    public C47136m(String str) {
        this.f122752a = str;
    }

    /* renamed from: a */
    public final String mo51028a() {
        return this.f122752a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47127d) {
            return this.f122752a.equals(((C47127d) obj).mo51028a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f122752a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f122752a;
        return "AuthTokenManagerConfig{scope=" + str + "}";
    }
}
