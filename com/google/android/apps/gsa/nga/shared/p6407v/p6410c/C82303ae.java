package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ae */
/* compiled from: PG */
final class C82303ae extends C82531iq {

    /* renamed from: a */
    private final String f224819a;

    /* renamed from: b */
    private final String f224820b;

    public C82303ae(String str, String str2) {
        this.f224819a = str;
        this.f224820b = str2;
    }

    /* renamed from: b */
    public final String mo75606b() {
        return this.f224820b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224819a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82531iq) {
            C82531iq iqVar = (C82531iq) obj;
            return this.f224819a.equals(iqVar.mo75583d()) && this.f224820b.equals(iqVar.mo75606b());
        }
    }

    public final int hashCode() {
        return ((this.f224819a.hashCode() ^ 1000003) * 1000003) ^ this.f224820b.hashCode();
    }

    public final String toString() {
        String str = this.f224819a;
        String str2 = this.f224820b;
        return "GacsInvocationStatusEvent{token=" + str + ", status=" + str2 + "}";
    }
}
