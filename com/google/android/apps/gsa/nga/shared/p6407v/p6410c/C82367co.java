package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.co */
/* compiled from: PG */
public final class C82367co extends C82597lb {

    /* renamed from: a */
    private final String f225009a = "NGA_HOTWORD_DECISION_LOCAL_MDA";

    /* renamed from: b */
    private final String f225010b;

    /* renamed from: c */
    private final String f225011c;

    public C82367co(String str, String str2, String str3) {
        this.f225010b = str2;
        this.f225011c = str3;
    }

    /* renamed from: b */
    public final String mo75882b() {
        return this.f225011c;
    }

    /* renamed from: c */
    public final String mo75883c() {
        return this.f225010b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225009a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82597lb) {
            C82597lb lbVar = (C82597lb) obj;
            return this.f225009a.equals(lbVar.mo75583d()) && this.f225010b.equals(lbVar.mo75883c()) && this.f225011c.equals(lbVar.mo75882b());
        }
    }

    public final int hashCode() {
        return ((((this.f225009a.hashCode() ^ 1000003) * 1000003) ^ this.f225010b.hashCode()) * 1000003) ^ this.f225011c.hashCode();
    }

    public final String toString() {
        String str = this.f225009a;
        String str2 = this.f225010b;
        String str3 = this.f225011c;
        return "NgaHotwordDecisionLocalMdaEvent{token=" + str + ", deviceType=" + str2 + ", decision=" + str3 + "}";
    }
}
