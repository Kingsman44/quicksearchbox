package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C145021e();

    /* renamed from: a */
    public final double f392012a;

    /* renamed from: b */
    public final double f392013b;

    public LatLng(double d, double d2) {
        this.f392013b = (d2 < -180.0d || d2 >= 180.0d) ? ((((d2 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d : d2;
        this.f392012a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f392012a) == Double.doubleToLongBits(latLng.f392012a) && Double.doubleToLongBits(this.f392013b) == Double.doubleToLongBits(latLng.f392013b);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f392012a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f392013b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        double d = this.f392012a;
        double d2 = this.f392013b;
        return "lat/lng: (" + d + "," + d2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234086e(parcel, 2, this.f392012a);
        C143947c.m234086e(parcel, 3, this.f392013b);
        C143947c.m234083b(parcel, a);
    }
}
