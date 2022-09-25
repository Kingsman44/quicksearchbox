package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class DeviceDataUploadOptInFlags extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146047a();

    /* renamed from: a */
    public final boolean f394760a;

    /* renamed from: b */
    public final boolean f394761b;

    public DeviceDataUploadOptInFlags(boolean z, boolean z2) {
        this.f394760a = z;
        this.f394761b = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 2, this.f394760a);
        C143947c.m234084c(parcel, 3, this.f394761b);
        C143947c.m234083b(parcel, a);
    }
}
