package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144899bc();

    /* renamed from: a */
    public final boolean f391788a;

    /* renamed from: b */
    public final boolean f391789b;

    /* renamed from: c */
    public final boolean f391790c;

    /* renamed from: d */
    public final boolean f391791d;

    /* renamed from: e */
    public final boolean f391792e;

    /* renamed from: f */
    public final boolean f391793f;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f391788a = z;
        this.f391789b = z2;
        this.f391790c = z3;
        this.f391791d = z4;
        this.f391792e = z5;
        this.f391793f = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f391788a);
        C143947c.m234084c(parcel, 2, this.f391789b);
        C143947c.m234084c(parcel, 3, this.f391790c);
        C143947c.m234084c(parcel, 4, this.f391791d);
        C143947c.m234084c(parcel, 5, this.f391792e);
        C143947c.m234084c(parcel, 6, this.f391793f);
        C143947c.m234083b(parcel, a);
    }
}
