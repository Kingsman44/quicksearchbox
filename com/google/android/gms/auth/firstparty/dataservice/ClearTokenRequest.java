package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ClearTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142906a();

    /* renamed from: a */
    final int f387806a;

    /* renamed from: b */
    public String f387807b;

    public ClearTokenRequest() {
        this.f387806a = 1;
    }

    public ClearTokenRequest(int i, String str) {
        this.f387806a = i;
        this.f387807b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f387806a);
        C143947c.m234106y(parcel, 2, this.f387807b);
        C143947c.m234083b(parcel, a);
    }
}
