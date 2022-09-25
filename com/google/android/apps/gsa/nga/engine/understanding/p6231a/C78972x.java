package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.x */
/* compiled from: PG */
public final class C78972x extends C78947c {

    /* renamed from: a */
    private final String f217228a;

    public C78972x(String str) {
        if (str != null) {
            this.f217228a = str;
            return;
        }
        throw new NullPointerException("Null baseUri");
    }

    /* renamed from: a */
    public final String mo73706a() {
        return this.f217228a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78947c) {
            return this.f217228a.equals(((C78947c) obj).mo73706a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f217228a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f217228a;
        return "Site{baseUri=" + str + "}";
    }
}
