package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_MatchInfo  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_MatchInfo extends MatchInfo {

    /* renamed from: a */
    public final int f110653a;

    /* renamed from: b */
    public final int f110654b;

    public C$AutoValue_MatchInfo(int i, int i2) {
        this.f110653a = i;
        this.f110654b = i2;
    }

    /* renamed from: a */
    public final int mo45022a() {
        return this.f110654b;
    }

    /* renamed from: b */
    public final int mo45023b() {
        return this.f110653a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MatchInfo) {
            MatchInfo matchInfo = (MatchInfo) obj;
            return this.f110653a == matchInfo.mo45023b() && this.f110654b == matchInfo.mo45022a();
        }
    }

    public final int hashCode() {
        return ((this.f110653a ^ 1000003) * 1000003) ^ this.f110654b;
    }

    public final String toString() {
        int i = this.f110653a;
        int i2 = this.f110654b;
        return "MatchInfo{startIndex=" + i + ", length=" + i2 + "}";
    }
}
