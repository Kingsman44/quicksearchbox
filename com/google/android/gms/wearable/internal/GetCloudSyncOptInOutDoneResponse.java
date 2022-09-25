package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetCloudSyncOptInOutDoneResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146433ar();

    /* renamed from: a */
    public final int f395584a;

    /* renamed from: b */
    public final boolean f395585b;

    public GetCloudSyncOptInOutDoneResponse(int i, boolean z) {
        this.f395584a = i;
        this.f395585b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395584a);
        C143947c.m234084c(parcel, 3, this.f395585b);
        C143947c.m234083b(parcel, a);
    }
}
