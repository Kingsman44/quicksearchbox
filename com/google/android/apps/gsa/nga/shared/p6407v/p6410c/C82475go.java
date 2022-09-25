package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.go */
/* compiled from: PG */
public final class C82475go extends C82705pb {

    /* renamed from: a */
    private final String f225354a = "NGA_WARM_ACTIONS_TRIGGER_SODA_EVENT_COUNT";

    /* renamed from: b */
    private final Double f225355b;

    /* renamed from: c */
    private final int f225356c;

    /* renamed from: d */
    private final String f225357d;

    public C82475go(String str, Double d, int i, String str2) {
        this.f225355b = d;
        this.f225356c = i;
        this.f225357d = str2;
    }

    /* renamed from: b */
    public final int mo76388b() {
        return this.f225356c;
    }

    /* renamed from: c */
    public final Double mo76389c() {
        return this.f225355b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225354a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82705pb) {
            C82705pb pbVar = (C82705pb) obj;
            return this.f225354a.equals(pbVar.mo75583d()) && this.f225355b.equals(pbVar.mo76389c()) && this.f225356c == pbVar.mo76388b() && this.f225357d.equals(pbVar.mo76391f());
        }
    }

    /* renamed from: f */
    public final String mo76391f() {
        return this.f225357d;
    }

    public final int hashCode() {
        return ((((((this.f225354a.hashCode() ^ 1000003) * 1000003) ^ this.f225355b.hashCode()) * 1000003) ^ this.f225356c) * 1000003) ^ this.f225357d.hashCode();
    }

    public final String toString() {
        String str = this.f225354a;
        Double d = this.f225355b;
        int i = this.f225356c;
        String str2 = this.f225357d;
        return "NgaWarmActionsTriggerSodaEventCountEvent{token=" + str + ", value=" + d + ", contextType=" + i + ", command=" + str2 + "}";
    }
}
