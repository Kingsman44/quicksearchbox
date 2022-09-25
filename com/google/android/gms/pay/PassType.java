package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class PassType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145624v();

    /* renamed from: a */
    public int f393670a;

    public PassType() {
    }

    public PassType(int i) {
        this.f393670a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PassType) {
            return C143912ba.m233950b(Integer.valueOf(this.f393670a), Integer.valueOf(((PassType) obj).f393670a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393670a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393670a);
        C143947c.m234083b(parcel, a);
    }
}
