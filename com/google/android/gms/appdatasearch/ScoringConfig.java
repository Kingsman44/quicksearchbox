package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ScoringConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142794aj();

    /* renamed from: a */
    public final boolean f387536a;

    public ScoringConfig(boolean z) {
        this.f387536a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScoringConfig) && this.f387536a == ((ScoringConfig) obj).f387536a;
    }

    public final int hashCode() {
        return this.f387536a ? 1 : 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f387536a);
        C143947c.m234083b(parcel, a);
    }
}
