package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.usonia.DeviceInfo;
import java.util.Arrays;

/* compiled from: PG */
public final class OnDeviceOfflineParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146251bn();

    /* renamed from: a */
    public DeviceInfo f395027a;

    private OnDeviceOfflineParams() {
    }

    public OnDeviceOfflineParams(DeviceInfo deviceInfo) {
        this.f395027a = deviceInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnDeviceOfflineParams) {
            return C143912ba.m233950b(this.f395027a, ((OnDeviceOfflineParams) obj).f395027a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395027a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f395027a, i);
        C143947c.m234083b(parcel, a);
    }
}
