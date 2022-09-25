package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class PerformEapAkaResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146477ch();

    /* renamed from: a */
    public final int f395622a;

    /* renamed from: b */
    public final String f395623b;

    public PerformEapAkaResponse(int i, String str) {
        this.f395622a = i;
        this.f395623b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395622a);
        C143947c.m234106y(parcel, 3, this.f395623b);
        C143947c.m234083b(parcel, a);
    }
}
