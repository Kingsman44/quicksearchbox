package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class RtslCellInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145984v();

    /* renamed from: a */
    public final int f394610a;

    /* renamed from: b */
    public final boolean f394611b;

    /* renamed from: c */
    public final int f394612c;

    /* renamed from: d */
    public final long f394613d;

    /* renamed from: e */
    public final String f394614e;

    public RtslCellInfo(int i, boolean z, int i2, long j, String str) {
        this.f394610a = i;
        this.f394611b = z;
        this.f394612c = i2;
        this.f394613d = j;
        this.f394614e = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f394610a);
        C143947c.m234084c(parcel, 2, this.f394611b);
        C143947c.m234089h(parcel, 3, this.f394612c);
        C143947c.m234090i(parcel, 4, this.f394613d);
        C143947c.m234106y(parcel, 5, this.f394614e);
        C143947c.m234083b(parcel, a);
    }
}
