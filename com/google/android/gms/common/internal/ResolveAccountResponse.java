package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143921bj();

    /* renamed from: a */
    final int f390041a;

    /* renamed from: b */
    IBinder f390042b;

    /* renamed from: c */
    public ConnectionResult f390043c;

    /* renamed from: d */
    public boolean f390044d;

    /* renamed from: e */
    public boolean f390045e;

    public ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f390041a = i;
        this.f390042b = iBinder;
        this.f390043c = connectionResult;
        this.f390044d = z;
        this.f390045e = z2;
    }

    /* renamed from: a */
    public final C143899ao mo119383a() {
        IBinder iBinder = this.f390042b;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return queryLocalInterface instanceof C143899ao ? (C143899ao) queryLocalInterface : new C143899ao(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f390043c.equals(resolveAccountResponse.f390043c) && C143912ba.m233950b(mo119383a(), resolveAccountResponse.mo119383a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f390041a);
        C143947c.m234098q(parcel, 2, this.f390042b);
        C143947c.m234105x(parcel, 3, this.f390043c, i);
        C143947c.m234084c(parcel, 4, this.f390044d);
        C143947c.m234084c(parcel, 5, this.f390045e);
        C143947c.m234083b(parcel, a);
    }
}
