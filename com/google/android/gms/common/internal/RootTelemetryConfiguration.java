package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143923bl();

    /* renamed from: a */
    public final int f390046a;

    /* renamed from: b */
    public final boolean f390047b;

    /* renamed from: c */
    public final boolean f390048c;

    /* renamed from: d */
    public final int f390049d;

    /* renamed from: e */
    public final int f390050e;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.f390046a = i;
        this.f390047b = z;
        this.f390048c = z2;
        this.f390049d = i2;
        this.f390050e = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f390046a);
        C143947c.m234084c(parcel, 2, this.f390047b);
        C143947c.m234084c(parcel, 3, this.f390048c);
        C143947c.m234089h(parcel, 4, this.f390049d);
        C143947c.m234089h(parcel, 5, this.f390050e);
        C143947c.m234083b(parcel, a);
    }
}
