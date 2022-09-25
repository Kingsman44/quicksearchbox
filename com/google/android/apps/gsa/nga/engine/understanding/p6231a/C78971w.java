package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.w */
/* compiled from: PG */
public final class C78971w extends C78945b {

    /* renamed from: a */
    private final String f217227a;

    public C78971w(String str) {
        if (str != null) {
            this.f217227a = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo73705a() {
        return this.f217227a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78945b) {
            return this.f217227a.equals(((C78945b) obj).mo73705a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f217227a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f217227a;
        return "App{packageName=" + str + "}";
    }
}
