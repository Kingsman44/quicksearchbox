package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class ProtoSafeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145583ad();

    /* renamed from: a */
    public byte[] f393689a;

    private ProtoSafeParcelable() {
    }

    public ProtoSafeParcelable(byte[] bArr) {
        this.f393689a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProtoSafeParcelable) {
            return Arrays.equals(this.f393689a, ((ProtoSafeParcelable) obj).f393689a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f393689a))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 1, this.f393689a);
        C143947c.m234083b(parcel, a);
    }
}
