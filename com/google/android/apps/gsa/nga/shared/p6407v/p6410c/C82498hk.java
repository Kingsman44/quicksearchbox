package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hk */
/* compiled from: PG */
public final class C82498hk extends C82727px {

    /* renamed from: a */
    private final String f225412a = "SPEEDBUMP_LATENCY";

    /* renamed from: b */
    private final Double f225413b;

    /* renamed from: c */
    private final String f225414c;

    public C82498hk(String str, Double d, String str2) {
        this.f225413b = d;
        this.f225414c = str2;
    }

    /* renamed from: b */
    public final Double mo76479b() {
        return this.f225413b;
    }

    /* renamed from: c */
    public final String mo76480c() {
        return this.f225414c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225412a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82727px) {
            C82727px pxVar = (C82727px) obj;
            return this.f225412a.equals(pxVar.mo75583d()) && this.f225413b.equals(pxVar.mo76479b()) && this.f225414c.equals(pxVar.mo76480c());
        }
    }

    public final int hashCode() {
        return ((((this.f225412a.hashCode() ^ 1000003) * 1000003) ^ this.f225413b.hashCode()) * 1000003) ^ this.f225414c.hashCode();
    }

    public final String toString() {
        String str = this.f225412a;
        Double d = this.f225413b;
        String str2 = this.f225414c;
        return "SpeedbumpLatencyEvent{token=" + str + ", value=" + d + ", outcome=" + str2 + "}";
    }
}
