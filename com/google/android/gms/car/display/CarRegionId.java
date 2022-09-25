package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class CarRegionId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143192c();

    /* renamed from: a */
    public final int f388293a;

    /* renamed from: b */
    public final CarDisplayId f388294b;

    public CarRegionId(int i, CarDisplayId carDisplayId) {
        this.f388293a = i;
        this.f388294b = carDisplayId;
    }

    /* renamed from: a */
    public static CarRegionId m232311a(CarDisplayId carDisplayId) {
        return new CarRegionId(0, carDisplayId);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarRegionId)) {
            return false;
        }
        CarRegionId carRegionId = (CarRegionId) obj;
        return this.f388294b.equals(carRegionId.f388294b) && carRegionId.f388293a == this.f388293a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f388293a), this.f388294b});
    }

    public final String toString() {
        int i = this.f388293a;
        String valueOf = String.valueOf(this.f388294b);
        return "CarRegionId{regionId=" + i + " carDisplayId=" + valueOf + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f388293a);
        C143947c.m234105x(parcel, 2, this.f388294b, i);
        C143947c.m234083b(parcel, a);
    }
}
