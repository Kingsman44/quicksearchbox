package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bu */
/* compiled from: PG */
final class C82346bu extends C82576kh {

    /* renamed from: a */
    private final String f224944a;

    /* renamed from: b */
    private final boolean f224945b;

    public C82346bu(String str, boolean z) {
        this.f224944a = str;
        this.f224945b = z;
    }

    /* renamed from: b */
    public final boolean mo75794b() {
        return this.f224945b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224944a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82576kh) {
            C82576kh khVar = (C82576kh) obj;
            return this.f224944a.equals(khVar.mo75583d()) && this.f224945b == khVar.mo75794b();
        }
    }

    public final int hashCode() {
        return ((this.f224944a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f224945b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f224944a;
        boolean z = this.f224945b;
        return "NgaFeedbackSendOutcomeEvent{token=" + str + ", success=" + z + "}";
    }
}
