package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.am */
/* compiled from: PG */
public final class C82311am extends C82539iy {

    /* renamed from: a */
    private final String f224840a = "INVOCATION_MANAGER_BUFFER_NOT_USED";

    public C82311am(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224840a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82539iy) {
            return this.f224840a.equals(((C82539iy) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f224840a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f224840a;
        return "InvocationManagerBufferNotUsedEvent{token=" + str + "}";
    }
}
