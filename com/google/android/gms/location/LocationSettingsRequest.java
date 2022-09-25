package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144897ba();

    /* renamed from: a */
    public final List f391783a;

    /* renamed from: b */
    public final boolean f391784b;

    /* renamed from: c */
    public final boolean f391785c;

    public LocationSettingsRequest(List list, boolean z, boolean z2) {
        this.f391783a = list;
        this.f391784b = z;
        this.f391785c = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, Collections.unmodifiableList(this.f391783a));
        C143947c.m234084c(parcel, 2, this.f391784b);
        C143947c.m234084c(parcel, 3, this.f391785c);
        C143947c.m234083b(parcel, a);
    }
}
