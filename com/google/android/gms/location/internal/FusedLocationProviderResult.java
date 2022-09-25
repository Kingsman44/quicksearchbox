package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class FusedLocationProviderResult extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C144911a();

    /* renamed from: a */
    public final Status f391852a;

    public FusedLocationProviderResult(Status status) {
        this.f391852a = status;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f391852a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f391852a, i);
        C143947c.m234083b(parcel, a);
    }
}
