package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AutocompletePrediction;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_AutocompletePrediction_SubstringMatch  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_AutocompletePrediction_SubstringMatch extends AutocompletePrediction.SubstringMatch {

    /* renamed from: a */
    public final int f85515a;

    /* renamed from: b */
    public final int f85516b;

    public C$AutoValue_AutocompletePrediction_SubstringMatch(int i, int i2) {
        this.f85515a = i;
        this.f85516b = i2;
    }

    /* renamed from: a */
    public final int mo37472a() {
        return this.f85516b;
    }

    /* renamed from: b */
    public final int mo37473b() {
        return this.f85515a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompletePrediction.SubstringMatch) {
            AutocompletePrediction.SubstringMatch substringMatch = (AutocompletePrediction.SubstringMatch) obj;
            return this.f85515a == substringMatch.mo37473b() && this.f85516b == substringMatch.mo37472a();
        }
    }

    public final int hashCode() {
        return ((this.f85515a ^ 1000003) * 1000003) ^ this.f85516b;
    }

    public final String toString() {
        int i = this.f85515a;
        int i2 = this.f85516b;
        return "SubstringMatch{offset=" + i + ", length=" + i2 + "}";
    }
}
