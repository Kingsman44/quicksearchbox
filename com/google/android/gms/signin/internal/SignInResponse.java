package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class SignInResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146003i();

    /* renamed from: a */
    final int f394687a;

    /* renamed from: b */
    public final ConnectionResult f394688b;

    /* renamed from: c */
    public final ResolveAccountResponse f394689c;

    public SignInResponse(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f394687a = i;
        this.f394688b = connectionResult;
        this.f394689c = resolveAccountResponse;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f394687a);
        C143947c.m234105x(parcel, 2, this.f394688b, i);
        C143947c.m234105x(parcel, 3, this.f394689c, i);
        C143947c.m234083b(parcel, a);
    }
}
