package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.q */
/* compiled from: PG */
public final class C82730q extends C82517ic {

    /* renamed from: a */
    private final String f225482a = "DID_ACOUSTIC_SCORE_EVENT";

    /* renamed from: b */
    private final String f225483b;

    /* renamed from: c */
    private final String f225484c;

    /* renamed from: d */
    private final String f225485d;

    /* renamed from: e */
    private final boolean f225486e;

    public C82730q(String str, String str2, String str3, String str4, boolean z) {
        this.f225483b = str2;
        this.f225484c = str3;
        this.f225485d = str4;
        this.f225486e = z;
    }

    /* renamed from: b */
    public final String mo76554b() {
        return this.f225485d;
    }

    /* renamed from: c */
    public final String mo76555c() {
        return this.f225483b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225482a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82517ic) {
            C82517ic icVar = (C82517ic) obj;
            return this.f225482a.equals(icVar.mo75583d()) && this.f225483b.equals(icVar.mo76555c()) && this.f225484c.equals(icVar.mo76556f()) && this.f225485d.equals(icVar.mo76554b()) && this.f225486e == icVar.mo76557g();
        }
    }

    /* renamed from: f */
    public final String mo76556f() {
        return this.f225484c;
    }

    /* renamed from: g */
    public final boolean mo76557g() {
        return this.f225486e;
    }

    public final int hashCode() {
        return ((((((((this.f225482a.hashCode() ^ 1000003) * 1000003) ^ this.f225483b.hashCode()) * 1000003) ^ this.f225484c.hashCode()) * 1000003) ^ this.f225485d.hashCode()) * 1000003) ^ (true != this.f225486e ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225482a;
        String str2 = this.f225483b;
        String str3 = this.f225484c;
        String str4 = this.f225485d;
        boolean z = this.f225486e;
        return "DidAcousticScoreEvent{token=" + str + ", languageCode=" + str2 + ", speechEngine=" + str3 + ", eventType=" + str4 + ", scoreIsPresent=" + z + "}";
    }
}
