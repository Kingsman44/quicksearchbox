package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.du */
/* compiled from: PG */
public final class C82400du extends C82630mh {

    /* renamed from: a */
    private final String f225127a = "NGA_OPA_HANDOVER_GRAPH_FAILED_ROOT_CAUSE";

    /* renamed from: b */
    private final int f225128b;

    public C82400du(String str, int i) {
        this.f225128b = i;
    }

    /* renamed from: b */
    public final int mo76040b() {
        return this.f225128b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225127a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82630mh) {
            C82630mh mhVar = (C82630mh) obj;
            return this.f225127a.equals(mhVar.mo75583d()) && this.f225128b == mhVar.mo76040b();
        }
    }

    public final int hashCode() {
        return ((this.f225127a.hashCode() ^ 1000003) * 1000003) ^ this.f225128b;
    }

    public final String toString() {
        String str = this.f225127a;
        int i = this.f225128b;
        return "NgaOpaHandoverGraphFailedRootCauseEvent{token=" + str + ", gsaErrorCode=" + i + "}";
    }
}
