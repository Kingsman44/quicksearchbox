package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class PutDataResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146478ci();

    /* renamed from: a */
    public final int f395624a;

    /* renamed from: b */
    public final DataItemParcelable f395625b;

    public PutDataResponse(int i, DataItemParcelable dataItemParcelable) {
        this.f395624a = i;
        this.f395625b = dataItemParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395624a);
        C143947c.m234105x(parcel, 3, this.f395625b, i);
        C143947c.m234083b(parcel, a);
    }
}
