package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143995t();

    /* renamed from: a */
    public final boolean f389585a;

    /* renamed from: b */
    public final String f389586b;

    /* renamed from: c */
    public final int f389587c;

    /* renamed from: d */
    public final int f389588d;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2) {
        this.f389585a = z;
        this.f389586b = str;
        this.f389587c = C144021x.m234205a(i) - 1;
        this.f389588d = C143870e.m233879a(i2) - 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f389585a);
        C143947c.m234106y(parcel, 2, this.f389586b);
        C143947c.m234089h(parcel, 3, this.f389587c);
        C143947c.m234089h(parcel, 4, this.f389588d);
        C143947c.m234083b(parcel, a);
    }
}
