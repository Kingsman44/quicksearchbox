package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class CarDisplayId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143191b();

    /* renamed from: a */
    public static final CarDisplayId f388291a = new CarDisplayId(0);

    /* renamed from: b */
    public final int f388292b;

    public CarDisplayId(int i) {
        this.f388292b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CarDisplayId) && ((CarDisplayId) obj).f388292b == this.f388292b;
    }

    public final int hashCode() {
        return this.f388292b;
    }

    public final String toString() {
        int i = this.f388292b;
        return "CarDisplayId{displayId=" + i + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f388292b);
        C143947c.m234083b(parcel, a);
    }
}
