package com.google.android.gms.facs.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class FacsCacheCallOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144175c();

    /* renamed from: a */
    public final String f390480a;

    /* renamed from: b */
    public final long f390481b;

    public FacsCacheCallOptions(String str, long j) {
        this.f390480a = str;
        this.f390481b = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f390480a);
        C143947c.m234090i(parcel, 2, this.f390481b);
        C143947c.m234083b(parcel, a);
    }
}
