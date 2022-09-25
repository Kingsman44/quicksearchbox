package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetRecentContextCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142820q();

    /* renamed from: a */
    public final Account f387448a;

    /* renamed from: b */
    public final boolean f387449b;

    /* renamed from: c */
    public final boolean f387450c;

    /* renamed from: d */
    public final boolean f387451d;

    /* renamed from: e */
    public final String f387452e;

    public GetRecentContextCall$Request() {
        this((Account) null, false, false, false, (String) null);
    }

    public GetRecentContextCall$Request(Account account, boolean z, boolean z2, boolean z3, String str) {
        this.f387448a = account;
        this.f387449b = z;
        this.f387450c = z2;
        this.f387451d = z3;
        this.f387452e = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f387448a, i);
        C143947c.m234084c(parcel, 2, this.f387449b);
        C143947c.m234084c(parcel, 3, this.f387450c);
        C143947c.m234084c(parcel, 4, this.f387451d);
        C143947c.m234106y(parcel, 5, this.f387452e);
        C143947c.m234083b(parcel, a);
    }
}
