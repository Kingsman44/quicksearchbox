package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class CallerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145081b();

    /* renamed from: a */
    public final String f392141a;

    /* renamed from: b */
    public final long f392142b;

    public CallerInfo(String str, long j) {
        this.f392141a = str;
        this.f392142b = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f392141a);
        C143947c.m234090i(parcel, 2, this.f392142b);
        C143947c.m234083b(parcel, a);
    }
}
