package com.google.apps.tiktok.experiments.phenotype;

import com.google.protobuf.C63088z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.bn */
/* compiled from: PG */
public final class C46947bn {

    /* renamed from: a */
    public final String f122435a;

    /* renamed from: b */
    public final String f122436b;

    /* renamed from: c */
    public final C63088z f122437c;

    /* renamed from: d */
    private final long f122438d;

    public C46947bn(String str, String str2, C63088z zVar, long j) {
        C69664n.m101061g(str, "serverToken");
        C69664n.m101061g(str2, "snapshotToken");
        this.f122435a = str;
        this.f122436b = str2;
        this.f122437c = zVar;
        this.f122438d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46947bn)) {
            return false;
        }
        C46947bn bnVar = (C46947bn) obj;
        return C69664n.m101066l(this.f122435a, bnVar.f122435a) && C69664n.m101066l(this.f122436b, bnVar.f122436b) && C69664n.m101066l(this.f122437c, bnVar.f122437c) && this.f122438d == bnVar.f122438d;
    }

    public final int hashCode() {
        int hashCode = ((this.f122435a.hashCode() * 31) + this.f122436b.hashCode()) * 31;
        C63088z zVar = this.f122437c;
        int hashCode2 = zVar == null ? 0 : zVar.hashCode();
        long j = this.f122438d;
        return ((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.f122435a;
        String str2 = this.f122436b;
        C63088z zVar = this.f122437c;
        long j = this.f122438d;
        return "Metadata(serverToken=" + str + ", snapshotToken=" + str2 + ", experimentToken=" + zVar + ", lastUpdateEpochMillis=" + j + ")";
    }
}
