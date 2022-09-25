package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142917q();

    /* renamed from: a */
    public final Account f387642a;

    /* renamed from: b */
    public final String[] f387643b;

    /* renamed from: c */
    public Bundle f387644c;

    public HasCapabilitiesRequest(Account account, String[] strArr, Bundle bundle) {
        this.f387642a = account;
        this.f387643b = strArr;
        this.f387644c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f387642a, i);
        C143947c.m234107z(parcel, 2, this.f387643b);
        C143947c.m234093l(parcel, 3, this.f387644c);
        C143947c.m234083b(parcel, a);
    }
}
