package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetCloudSyncOptInStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146434as();

    /* renamed from: a */
    public final int f395586a;

    /* renamed from: b */
    public final boolean f395587b;

    /* renamed from: c */
    public final boolean f395588c;

    public GetCloudSyncOptInStatusResponse(int i, boolean z, boolean z2) {
        this.f395586a = i;
        this.f395587b = z;
        this.f395588c = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395586a);
        C143947c.m234084c(parcel, 3, this.f395587b);
        C143947c.m234084c(parcel, 4, this.f395588c);
        C143947c.m234083b(parcel, a);
    }
}
