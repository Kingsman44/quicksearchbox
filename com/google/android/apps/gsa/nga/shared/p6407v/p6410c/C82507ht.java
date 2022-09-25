package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ht */
/* compiled from: PG */
public final class C82507ht extends C82737qg {

    /* renamed from: a */
    private final String f225456a = "VIS_DELEGATION";

    /* renamed from: b */
    private final boolean f225457b;

    /* renamed from: c */
    private final String f225458c;

    /* renamed from: d */
    private final boolean f225459d;

    public C82507ht(String str, boolean z, String str2, boolean z2) {
        this.f225457b = z;
        this.f225458c = str2;
        this.f225459d = z2;
    }

    /* renamed from: b */
    public final String mo76537b() {
        return this.f225458c;
    }

    /* renamed from: c */
    public final boolean mo76538c() {
        return this.f225457b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225456a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82737qg) {
            C82737qg qgVar = (C82737qg) obj;
            return this.f225456a.equals(qgVar.mo75583d()) && this.f225457b == qgVar.mo76538c() && this.f225458c.equals(qgVar.mo76537b()) && this.f225459d == qgVar.mo76540f();
        }
    }

    /* renamed from: f */
    public final boolean mo76540f() {
        return this.f225459d;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f225456a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f225457b ? 1237 : 1231)) * 1000003) ^ this.f225458c.hashCode()) * 1000003;
        if (true == this.f225459d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f225456a;
        boolean z = this.f225457b;
        String str2 = this.f225458c;
        boolean z2 = this.f225459d;
        return "VisDelegationEvent{token=" + str + ", delegationRequired=" + z + ", viIntentAction=" + str2 + ", shouldOnlyCreateSession=" + z2 + "}";
    }
}
