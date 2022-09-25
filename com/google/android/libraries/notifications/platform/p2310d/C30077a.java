package com.google.android.libraries.notifications.platform.p2310d;

/* renamed from: com.google.android.libraries.notifications.platform.d.a */
/* compiled from: PG */
final class C30077a extends C30084g {

    /* renamed from: d */
    private final String f81396d;

    public C30077a(String str) {
        if (str != null) {
            this.f81396d = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: a */
    public final String mo35458a() {
        return this.f81396d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30084g) {
            return this.f81396d.equals(((C30084g) obj).mo35458a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f81396d.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f81396d;
        return "GnpHttpHeaderKey{key=" + str + "}";
    }
}
