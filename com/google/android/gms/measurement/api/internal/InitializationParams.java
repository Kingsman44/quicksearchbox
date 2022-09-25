package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class InitializationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145203l();

    /* renamed from: a */
    public final long f392411a;

    /* renamed from: b */
    public final long f392412b;

    /* renamed from: c */
    public final boolean f392413c;

    /* renamed from: d */
    public final String f392414d;

    /* renamed from: e */
    public final String f392415e;

    /* renamed from: f */
    public final String f392416f;

    /* renamed from: g */
    public final Bundle f392417g;

    /* renamed from: h */
    public final String f392418h;

    public InitializationParams(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f392411a = j;
        this.f392412b = j2;
        this.f392413c = z;
        this.f392414d = str;
        this.f392415e = str2;
        this.f392416f = str3;
        this.f392417g = bundle;
        this.f392418h = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 1, this.f392411a);
        C143947c.m234090i(parcel, 2, this.f392412b);
        C143947c.m234084c(parcel, 3, this.f392413c);
        C143947c.m234106y(parcel, 4, this.f392414d);
        C143947c.m234106y(parcel, 5, this.f392415e);
        C143947c.m234106y(parcel, 6, this.f392416f);
        C143947c.m234093l(parcel, 7, this.f392417g);
        C143947c.m234106y(parcel, 8, this.f392418h);
        C143947c.m234083b(parcel, a);
    }
}
