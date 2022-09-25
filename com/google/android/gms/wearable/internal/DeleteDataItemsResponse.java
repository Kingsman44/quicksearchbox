package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class DeleteDataItemsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146428am();

    /* renamed from: a */
    public final int f395574a;

    /* renamed from: b */
    public final int f395575b;

    public DeleteDataItemsResponse(int i, int i2) {
        this.f395574a = i;
        this.f395575b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395574a);
        C143947c.m234089h(parcel, 3, this.f395575b);
        C143947c.m234083b(parcel, a);
    }
}
