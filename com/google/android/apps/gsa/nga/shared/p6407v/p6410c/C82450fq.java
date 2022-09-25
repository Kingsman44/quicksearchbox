package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fq */
/* compiled from: PG */
public final class C82450fq extends C82680od {

    /* renamed from: a */
    private final String f225286a = "NGA_UNDERSTANDING_NON_EMPTY_INTENT";

    /* renamed from: b */
    private final int f225287b;

    public C82450fq(String str, int i) {
        this.f225287b = i;
    }

    /* renamed from: b */
    public final int mo76276b() {
        return this.f225287b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225286a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82680od) {
            C82680od odVar = (C82680od) obj;
            return this.f225286a.equals(odVar.mo75583d()) && this.f225287b == odVar.mo76276b();
        }
    }

    public final int hashCode() {
        return ((this.f225286a.hashCode() ^ 1000003) * 1000003) ^ this.f225287b;
    }

    public final String toString() {
        String str = this.f225286a;
        int i = this.f225287b;
        return "NgaUnderstandingNonEmptyIntentEvent{token=" + str + ", intentGenerator=" + i + "}";
    }
}
