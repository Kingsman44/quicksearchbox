package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143951v();

    /* renamed from: a */
    public final RootTelemetryConfiguration f390006a;

    /* renamed from: b */
    public final boolean f390007b;

    /* renamed from: c */
    public final boolean f390008c;

    /* renamed from: d */
    public final int[] f390009d;

    /* renamed from: e */
    public final int f390010e;

    /* renamed from: f */
    public final int[] f390011f;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f390006a = rootTelemetryConfiguration;
        this.f390007b = z;
        this.f390008c = z2;
        this.f390009d = iArr;
        this.f390010e = i;
        this.f390011f = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f390006a, i);
        C143947c.m234084c(parcel, 2, this.f390007b);
        C143947c.m234084c(parcel, 3, this.f390008c);
        C143947c.m234099r(parcel, 4, this.f390009d);
        C143947c.m234089h(parcel, 5, this.f390010e);
        C143947c.m234099r(parcel, 6, this.f390011f);
        C143947c.m234083b(parcel, a);
    }
}
