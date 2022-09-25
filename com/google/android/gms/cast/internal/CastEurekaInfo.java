package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class CastEurekaInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143595u();

    /* renamed from: a */
    public final int f389251a;

    /* renamed from: b */
    public final boolean f389252b;

    public CastEurekaInfo(int i, boolean z) {
        this.f389251a = i;
        this.f389252b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastEurekaInfo)) {
            return false;
        }
        CastEurekaInfo castEurekaInfo = (CastEurekaInfo) obj;
        return this.f389251a == castEurekaInfo.f389251a && this.f389252b == castEurekaInfo.f389252b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f389251a), Boolean.valueOf(this.f389252b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f389251a);
        C143947c.m234084c(parcel, 3, this.f389252b);
        C143947c.m234083b(parcel, a);
    }
}
