package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143950u();

    /* renamed from: a */
    Bundle f390002a;

    /* renamed from: b */
    Feature[] f390003b;

    /* renamed from: c */
    int f390004c;

    /* renamed from: d */
    public ConnectionTelemetryConfiguration f390005d;

    public ConnectionInfo() {
    }

    public ConnectionInfo(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f390002a = bundle;
        this.f390003b = featureArr;
        this.f390004c = i;
        this.f390005d = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234093l(parcel, 1, this.f390002a);
        C143947c.m234079B(parcel, 2, this.f390003b, i);
        C143947c.m234089h(parcel, 3, this.f390004c);
        C143947c.m234105x(parcel, 4, this.f390005d, i);
        C143947c.m234083b(parcel, a);
    }
}
