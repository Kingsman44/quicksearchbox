package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class SignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146002h();

    /* renamed from: a */
    final int f394685a;

    /* renamed from: b */
    final ResolveAccountRequest f394686b;

    public SignInRequest(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f394685a = i;
        this.f394686b = resolveAccountRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f394685a);
        C143947c.m234105x(parcel, 2, this.f394686b, i);
        C143947c.m234083b(parcel, a);
    }
}
