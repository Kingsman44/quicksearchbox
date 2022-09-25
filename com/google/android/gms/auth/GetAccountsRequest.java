package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142902d();

    /* renamed from: a */
    public final String f387640a;

    /* renamed from: b */
    public final String[] f387641b;

    public GetAccountsRequest(String str, String[] strArr) {
        this.f387640a = str;
        this.f387641b = strArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387640a);
        C143947c.m234107z(parcel, 2, this.f387641b);
        C143947c.m234083b(parcel, a);
    }
}
