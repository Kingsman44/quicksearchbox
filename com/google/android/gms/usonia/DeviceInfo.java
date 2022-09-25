package com.google.android.gms.usonia;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class DeviceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146107a();

    /* renamed from: a */
    public byte[] f394829a;

    /* renamed from: b */
    public String f394830b;

    private DeviceInfo() {
    }

    public DeviceInfo(byte[] bArr, String str) {
        this.f394829a = bArr;
        this.f394830b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceInfo) {
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            return Arrays.equals(this.f394829a, deviceInfo.f394829a) && C143912ba.m233950b(this.f394830b, deviceInfo.f394830b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f394829a)), this.f394830b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 1, this.f394829a);
        C143947c.m234106y(parcel, 2, this.f394830b);
        C143947c.m234083b(parcel, a);
    }
}
