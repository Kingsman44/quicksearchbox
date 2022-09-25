package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class PackageStorageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146476cg();

    /* renamed from: a */
    public final String f395619a;

    /* renamed from: b */
    public final String f395620b;

    /* renamed from: c */
    public final long f395621c;

    public PackageStorageInfo(String str, String str2, long j) {
        this.f395619a = str;
        this.f395620b = str2;
        this.f395621c = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395619a);
        C143947c.m234106y(parcel, 3, this.f395620b);
        C143947c.m234090i(parcel, 4, this.f395621c);
        C143947c.m234083b(parcel, a);
    }
}
