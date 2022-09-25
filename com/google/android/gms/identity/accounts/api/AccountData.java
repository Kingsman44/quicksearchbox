package com.google.android.gms.identity.accounts.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class AccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144353a();

    /* renamed from: a */
    public final String f390918a;

    /* renamed from: b */
    public final String f390919b;

    public AccountData(String str, String str2) {
        C143919bh.m233970m(str, "Account name must not be empty.");
        this.f390918a = str;
        this.f390919b = str2;
    }

    /* renamed from: a */
    public static AccountData m234630a(String str) {
        C143919bh.m233970m(str, "Account name must not be empty.");
        return new AccountData(str, (String) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f390918a);
        C143947c.m234106y(parcel, 2, this.f390919b);
        C143947c.m234083b(parcel, a);
    }
}
