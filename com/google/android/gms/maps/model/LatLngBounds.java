package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C145020d();

    /* renamed from: a */
    public final LatLng f392014a;

    /* renamed from: b */
    public final LatLng f392015b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C143919bh.m233971n(latLng, "southwest must not be null.");
        C143919bh.m233971n(latLng2, "northeast must not be null.");
        double d = latLng2.f392012a;
        double d2 = latLng.f392012a;
        C143919bh.m233961d(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(d));
        this.f392014a = latLng;
        this.f392015b = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f392014a.equals(latLngBounds.f392014a) && this.f392015b.equals(latLngBounds.f392015b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f392014a, this.f392015b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("southwest", this.f392014a, arrayList);
        C143910az.m233947b("northeast", this.f392015b, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f392014a, i);
        C143947c.m234105x(parcel, 3, this.f392015b, i);
        C143947c.m234083b(parcel, a);
    }
}
