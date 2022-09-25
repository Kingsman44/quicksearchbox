package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetPassesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145609g();

    /* renamed from: a */
    public Account f393629a;

    /* renamed from: b */
    public int f393630b;

    /* renamed from: c */
    public int f393631c;

    /* renamed from: d */
    public PassFilter f393632d;

    public GetPassesRequest() {
    }

    public GetPassesRequest(Account account, int i, int i2, PassFilter passFilter) {
        this.f393629a = account;
        this.f393630b = i;
        this.f393631c = i2;
        this.f393632d = passFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPassesRequest) {
            GetPassesRequest getPassesRequest = (GetPassesRequest) obj;
            return C143912ba.m233950b(this.f393629a, getPassesRequest.f393629a) && C143912ba.m233950b(Integer.valueOf(this.f393630b), Integer.valueOf(getPassesRequest.f393630b)) && C143912ba.m233950b(Integer.valueOf(this.f393631c), Integer.valueOf(getPassesRequest.f393631c)) && C143912ba.m233950b(this.f393632d, getPassesRequest.f393632d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393629a, Integer.valueOf(this.f393630b), Integer.valueOf(this.f393631c), this.f393632d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393629a, i);
        C143947c.m234089h(parcel, 2, this.f393630b);
        C143947c.m234089h(parcel, 3, this.f393631c);
        C143947c.m234105x(parcel, 4, this.f393632d, i);
        C143947c.m234083b(parcel, a);
    }
}
