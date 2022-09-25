package com.google.frameworks.client.data.android;

/* renamed from: com.google.frameworks.client.data.android.d */
/* compiled from: PG */
final class C61401d extends C61362ad {

    /* renamed from: a */
    private final String f166041a;

    public C61401d(String str) {
        if (str != null) {
            this.f166041a = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: a */
    public final String mo57931a() {
        return this.f166041a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61362ad) {
            return this.f166041a.equals(((C61362ad) obj).mo57931a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f166041a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f166041a;
        return "HttpHeaderKey{key=" + str + "}";
    }
}
