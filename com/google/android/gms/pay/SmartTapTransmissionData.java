package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class SmartTapTransmissionData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145587ah();

    /* renamed from: a */
    public String[] f393696a;

    private SmartTapTransmissionData() {
    }

    public SmartTapTransmissionData(String[] strArr) {
        this.f393696a = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SmartTapTransmissionData) {
            return Arrays.equals(this.f393696a, ((SmartTapTransmissionData) obj).f393696a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f393696a))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234107z(parcel, 1, this.f393696a);
        C143947c.m234083b(parcel, a);
    }
}
