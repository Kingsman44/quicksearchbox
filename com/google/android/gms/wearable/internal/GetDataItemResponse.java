package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetDataItemResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146440ay();

    /* renamed from: a */
    public final int f395599a;

    /* renamed from: b */
    public final DataItemParcelable f395600b;

    public GetDataItemResponse(int i, DataItemParcelable dataItemParcelable) {
        this.f395599a = i;
        this.f395600b = dataItemParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395599a);
        C143947c.m234105x(parcel, 3, this.f395600b, i);
        C143947c.m234083b(parcel, a);
    }
}
