package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142880a();

    /* renamed from: a */
    final int f387679a;

    /* renamed from: b */
    public final int f387680b;

    /* renamed from: c */
    public final PendingIntent f387681c;

    /* renamed from: d */
    public final int f387682d;

    /* renamed from: e */
    final Bundle f387683e;

    /* renamed from: f */
    public final byte[] f387684f;

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f387679a = i;
        this.f387680b = i2;
        this.f387682d = i3;
        this.f387683e = bundle;
        this.f387684f = bArr;
        this.f387681c = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f387680b);
        C143947c.m234105x(parcel, 2, this.f387681c, i);
        C143947c.m234089h(parcel, 3, this.f387682d);
        C143947c.m234093l(parcel, 4, this.f387683e);
        C143947c.m234094m(parcel, 5, this.f387684f);
        C143947c.m234089h(parcel, 1000, this.f387679a);
        C143947c.m234083b(parcel, a);
    }
}
