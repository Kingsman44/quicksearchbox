package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bd */
/* compiled from: PG */
public final class C82329bd extends C82558jq {

    /* renamed from: a */
    private final String f224907a = "NGA_CLOUD_HANDOVER_GRAPH_CANCEL_REASON";

    /* renamed from: b */
    private final int f224908b;

    public C82329bd(String str, int i) {
        this.f224908b = i;
    }

    /* renamed from: b */
    public final int mo75735b() {
        return this.f224908b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224907a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82558jq) {
            C82558jq jqVar = (C82558jq) obj;
            return this.f224907a.equals(jqVar.mo75583d()) && this.f224908b == jqVar.mo75735b();
        }
    }

    public final int hashCode() {
        return ((this.f224907a.hashCode() ^ 1000003) * 1000003) ^ this.f224908b;
    }

    public final String toString() {
        String str = this.f224907a;
        int i = this.f224908b;
        return "NgaCloudHandoverGraphCancelReasonEvent{token=" + str + ", reason=" + i + "}";
    }
}
