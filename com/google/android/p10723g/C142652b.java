package com.google.android.p10723g;

/* renamed from: com.google.android.g.b */
/* compiled from: PG */
public final class C142652b {

    /* renamed from: a */
    private final String f387089a = "proto";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C142652b)) {
            return false;
        }
        return this.f387089a.equals(((C142652b) obj).f387089a);
    }

    public final int hashCode() {
        return this.f387089a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f387089a;
        return "Encoding{name=\"" + str + "\"}";
    }
}
