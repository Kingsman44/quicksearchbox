package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class AddLocalCapabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146469c();

    /* renamed from: a */
    public final int f395522a;

    public AddLocalCapabilityResponse(int i) {
        this.f395522a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395522a);
        C143947c.m234083b(parcel, a);
    }
}
