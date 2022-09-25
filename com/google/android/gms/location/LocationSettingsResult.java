package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class LocationSettingsResult extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C144898bb();

    /* renamed from: a */
    public final Status f391786a;

    /* renamed from: b */
    public final LocationSettingsStates f391787b;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f391786a = status;
        this.f391787b = locationSettingsStates;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f391786a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f391786a, i);
        C143947c.m234105x(parcel, 2, this.f391787b, i);
        C143947c.m234083b(parcel, a);
    }
}
