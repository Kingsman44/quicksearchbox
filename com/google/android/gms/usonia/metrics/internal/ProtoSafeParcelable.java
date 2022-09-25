package com.google.android.gms.usonia.metrics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class ProtoSafeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146299g();

    /* renamed from: a */
    public byte[] f395131a;

    public ProtoSafeParcelable() {
    }

    public ProtoSafeParcelable(byte[] bArr) {
        this.f395131a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProtoSafeParcelable) {
            return Arrays.equals(this.f395131a, ((ProtoSafeParcelable) obj).f395131a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f395131a))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 1, this.f395131a);
        C143947c.m234083b(parcel, a);
    }
}
