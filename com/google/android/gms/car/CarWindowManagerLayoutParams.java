package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class CarWindowManagerLayoutParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143119bc();

    /* renamed from: a */
    public int f387986a;

    public CarWindowManagerLayoutParams() {
    }

    public CarWindowManagerLayoutParams(int i) {
        this.f387986a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f387986a == ((CarWindowManagerLayoutParams) obj).f387986a;
    }

    public final int hashCode() {
        return this.f387986a;
    }

    public final String toString() {
        int i = this.f387986a;
        return "CarWindowManagerLayoutParams{windowLayoutFlags=" + i + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f387986a);
        C143947c.m234083b(parcel, a);
    }
}
