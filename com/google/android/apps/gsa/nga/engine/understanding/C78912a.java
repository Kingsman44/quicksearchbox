package com.google.android.apps.gsa.nga.engine.understanding;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a */
/* compiled from: PG */
public final class C78912a extends C79330v {

    /* renamed from: a */
    public final String f217132a;

    public C78912a(String str) {
        if (str != null) {
            this.f217132a = str;
            return;
        }
        throw new NullPointerException("Null normalizedIntentName");
    }

    /* renamed from: a */
    public final String mo73681a() {
        return this.f217132a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79330v) {
            return this.f217132a.equals(((C79330v) obj).mo73681a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f217132a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f217132a;
        return "IntentNameWrapper{normalizedIntentName=" + str + "}";
    }
}
