package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices;

import com.google.common.p4552o.aog;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.a */
/* compiled from: PG */
final class C88671a extends C88674d {

    /* renamed from: a */
    private final long f239746a;

    /* renamed from: b */
    private final aog f239747b;

    public C88671a(long j, aog aog) {
        this.f239746a = j;
        this.f239747b = aog;
    }

    /* renamed from: a */
    public final long mo82356a() {
        return this.f239746a;
    }

    /* renamed from: b */
    public final aog mo82357b() {
        return this.f239747b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C88674d) {
            C88674d dVar = (C88674d) obj;
            return this.f239746a == dVar.mo82356a() && this.f239747b.equals(dVar.mo82357b());
        }
    }

    public final int hashCode() {
        long j = this.f239746a;
        return this.f239747b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f239746a;
        String obj = this.f239747b.toString();
        return "ImpressionBuilderWithStartTime{startTime=" + j + ", impressionBuilder=" + obj + "}";
    }
}
