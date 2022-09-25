package com.google.android.apps.search.googleapp.discover.streamui.p10229e;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.e.v */
/* compiled from: PG */
public final class C134742v {

    /* renamed from: a */
    public final int f366900a;

    /* renamed from: b */
    public final int f366901b;

    public C134742v(int i, int i2) {
        this.f366900a = i;
        this.f366901b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134742v)) {
            return false;
        }
        C134742v vVar = (C134742v) obj;
        return this.f366900a == vVar.f366900a && this.f366901b == vVar.f366901b;
    }

    public final int hashCode() {
        return (this.f366900a * 31) + this.f366901b;
    }

    public final String toString() {
        int i = this.f366900a;
        int i2 = this.f366901b;
        return "LoadResult(successes=" + i + ", failures=" + i2 + ")";
    }
}
