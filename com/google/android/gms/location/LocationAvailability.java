package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C144887ar();

    /* renamed from: a */
    public final int f391761a;

    /* renamed from: b */
    public final int f391762b;

    /* renamed from: c */
    public final long f391763c;

    /* renamed from: d */
    int f391764d;

    /* renamed from: e */
    public final NetworkLocationStatus[] f391765e;

    public LocationAvailability(int i, int i2, int i3, long j, NetworkLocationStatus[] networkLocationStatusArr) {
        this.f391764d = i < 1000 ? 0 : 1000;
        this.f391761a = i2;
        this.f391762b = i3;
        this.f391763c = j;
        this.f391765e = networkLocationStatusArr;
    }

    /* renamed from: a */
    public final boolean mo120334a() {
        return this.f391764d < 1000;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f391761a == locationAvailability.f391761a && this.f391762b == locationAvailability.f391762b && this.f391763c == locationAvailability.f391763c && this.f391764d == locationAvailability.f391764d && Arrays.equals(this.f391765e, locationAvailability.f391765e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f391764d)});
    }

    public final String toString() {
        boolean a = mo120334a();
        return "LocationAvailability[" + a + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f391761a);
        C143947c.m234089h(parcel, 2, this.f391762b);
        C143947c.m234090i(parcel, 3, this.f391763c);
        C143947c.m234089h(parcel, 4, this.f391764d);
        C143947c.m234079B(parcel, 5, this.f391765e, i);
        C143947c.m234084c(parcel, 6, mo120334a());
        C143947c.m234083b(parcel, a);
    }
}
