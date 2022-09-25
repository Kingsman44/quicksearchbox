package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class KillOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143157cm();

    /* renamed from: a */
    public final String f387997a;

    /* renamed from: b */
    public final boolean f387998b;

    /* renamed from: c */
    public final boolean f387999c;

    /* renamed from: d */
    public final String f388000d;

    public KillOptions(String str, boolean z, boolean z2, String str2) {
        this.f387997a = str;
        this.f387998b = z;
        this.f387999c = z2;
        this.f388000d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387997a);
        C143947c.m234084c(parcel, 2, this.f387998b);
        C143947c.m234084c(parcel, 3, this.f387999c);
        C143947c.m234106y(parcel, 4, this.f388000d);
        C143947c.m234083b(parcel, a);
    }
}
