package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetCapabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146430ao();

    /* renamed from: a */
    public final int f395578a;

    /* renamed from: b */
    public final CapabilityInfoParcelable f395579b;

    public GetCapabilityResponse(int i, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.f395578a = i;
        this.f395579b = capabilityInfoParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395578a);
        C143947c.m234105x(parcel, 3, this.f395579b, i);
        C143947c.m234083b(parcel, a);
    }
}
