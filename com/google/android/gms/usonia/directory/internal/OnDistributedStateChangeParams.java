package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.usonia.DeviceInfo;
import java.util.Arrays;

/* compiled from: PG */
public final class OnDistributedStateChangeParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146254bq();

    /* renamed from: a */
    public DeviceInfo f395032a;

    /* renamed from: b */
    public String f395033b;

    /* renamed from: c */
    public byte[] f395034c;

    /* renamed from: d */
    public boolean f395035d;

    private OnDistributedStateChangeParams() {
    }

    public OnDistributedStateChangeParams(DeviceInfo deviceInfo, String str, byte[] bArr, boolean z) {
        this.f395032a = deviceInfo;
        this.f395033b = str;
        this.f395034c = bArr;
        this.f395035d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnDistributedStateChangeParams) {
            OnDistributedStateChangeParams onDistributedStateChangeParams = (OnDistributedStateChangeParams) obj;
            return C143912ba.m233950b(this.f395032a, onDistributedStateChangeParams.f395032a) && C143912ba.m233950b(this.f395033b, onDistributedStateChangeParams.f395033b) && Arrays.equals(this.f395034c, onDistributedStateChangeParams.f395034c) && C143912ba.m233950b(Boolean.valueOf(this.f395035d), Boolean.valueOf(onDistributedStateChangeParams.f395035d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395032a, this.f395033b, Integer.valueOf(Arrays.hashCode(this.f395034c)), Boolean.valueOf(this.f395035d)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f395032a, i);
        C143947c.m234106y(parcel, 2, this.f395033b);
        C143947c.m234094m(parcel, 3, this.f395034c);
        C143947c.m234084c(parcel, 4, this.f395035d);
        C143947c.m234083b(parcel, a);
    }
}
