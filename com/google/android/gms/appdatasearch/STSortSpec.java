package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class STSortSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142793ai();

    /* renamed from: a */
    public final String f387535a;

    public STSortSpec(String str) {
        this.f387535a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof STSortSpec) {
            return C143912ba.m233950b(this.f387535a, ((STSortSpec) obj).f387535a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f387535a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387535a);
        C143947c.m234083b(parcel, a);
    }
}
