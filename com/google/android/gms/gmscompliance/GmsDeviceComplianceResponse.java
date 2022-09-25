package com.google.android.gms.gmscompliance;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GmsDeviceComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144273c();

    /* renamed from: a */
    final int f390654a;

    /* renamed from: b */
    public boolean f390655b;

    /* renamed from: c */
    public PendingIntent f390656c;

    /* renamed from: d */
    public boolean f390657d;

    /* renamed from: e */
    public long f390658e;

    /* renamed from: f */
    public byte[] f390659f;

    public GmsDeviceComplianceResponse() {
        this(1, true, (PendingIntent) null, false, 0, (byte[]) null);
    }

    public GmsDeviceComplianceResponse(int i, boolean z, PendingIntent pendingIntent, boolean z2, long j, byte[] bArr) {
        this.f390654a = i;
        this.f390655b = z;
        this.f390656c = pendingIntent;
        this.f390657d = z2;
        this.f390658e = j;
        this.f390659f = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f390654a);
        C143947c.m234084c(parcel, 2, this.f390655b);
        C143947c.m234105x(parcel, 3, this.f390656c, i);
        C143947c.m234084c(parcel, 4, this.f390657d);
        C143947c.m234090i(parcel, 5, this.f390658e);
        C143947c.m234094m(parcel, 6, this.f390659f);
        C143947c.m234083b(parcel, a);
    }
}
