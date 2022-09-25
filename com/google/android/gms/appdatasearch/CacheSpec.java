package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class CacheSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142807d();

    /* renamed from: a */
    public final String f387415a;

    /* renamed from: b */
    public final int f387416b;

    public CacheSpec(String str, int i) {
        this.f387415a = str;
        this.f387416b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387415a);
        C143947c.m234089h(parcel, 2, this.f387416b);
        C143947c.m234083b(parcel, a);
    }
}
