package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gk */
/* compiled from: PG */
public final class C82471gk extends C82700ox {

    /* renamed from: a */
    private final String f225342a = "NGA_WARM_ACTIONS_SODA_SESSION_COUNT";

    /* renamed from: b */
    private final int f225343b;

    /* renamed from: c */
    private final boolean f225344c;

    public C82471gk(String str, int i, boolean z) {
        this.f225343b = i;
        this.f225344c = z;
    }

    /* renamed from: b */
    public final int mo76368b() {
        return this.f225343b;
    }

    /* renamed from: c */
    public final boolean mo76369c() {
        return this.f225344c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225342a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82700ox) {
            C82700ox oxVar = (C82700ox) obj;
            return this.f225342a.equals(oxVar.mo75583d()) && this.f225343b == oxVar.mo76368b() && this.f225344c == oxVar.mo76369c();
        }
    }

    public final int hashCode() {
        return ((((this.f225342a.hashCode() ^ 1000003) * 1000003) ^ this.f225343b) * 1000003) ^ (true != this.f225344c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225342a;
        int i = this.f225343b;
        boolean z = this.f225344c;
        return "NgaWarmActionsSodaSessionCountEvent{token=" + str + ", contextType=" + i + ", start=" + z + "}";
    }
}
