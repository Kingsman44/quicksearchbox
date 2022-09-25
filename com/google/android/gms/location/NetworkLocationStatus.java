package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

@Deprecated
/* compiled from: PG */
public final class NetworkLocationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144900bd();

    /* renamed from: a */
    public final int f391794a;

    /* renamed from: b */
    public final int f391795b;

    /* renamed from: c */
    public final long f391796c;

    /* renamed from: d */
    public final long f391797d;

    public NetworkLocationStatus(int i, int i2, long j, long j2) {
        this.f391794a = i;
        this.f391795b = i2;
        this.f391796c = j;
        this.f391797d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NetworkLocationStatus) {
            NetworkLocationStatus networkLocationStatus = (NetworkLocationStatus) obj;
            if (this.f391794a == networkLocationStatus.f391794a && this.f391795b == networkLocationStatus.f391795b && this.f391796c == networkLocationStatus.f391796c && this.f391797d == networkLocationStatus.f391797d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f391795b), Integer.valueOf(this.f391794a), Long.valueOf(this.f391797d), Long.valueOf(this.f391796c)});
    }

    public final String toString() {
        int i = this.f391794a;
        int i2 = this.f391795b;
        long j = this.f391797d;
        long j2 = this.f391796c;
        return "NetworkLocationStatus: Wifi status: " + i + " Cell status: " + i2 + " elapsed time NS: " + j + " system time ms: " + j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f391794a);
        C143947c.m234089h(parcel, 2, this.f391795b);
        C143947c.m234090i(parcel, 3, this.f391796c);
        C143947c.m234090i(parcel, 4, this.f391797d);
        C143947c.m234083b(parcel, a);
    }
}
