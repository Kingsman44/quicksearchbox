package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetTransactionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145615m();

    /* renamed from: a */
    public Transaction[] f393641a;

    private GetTransactionsResponse() {
    }

    public GetTransactionsResponse(Transaction[] transactionArr) {
        this.f393641a = transactionArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetTransactionsResponse) {
            return Arrays.equals(this.f393641a, ((GetTransactionsResponse) obj).f393641a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f393641a))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 1, this.f393641a, i);
        C143947c.m234083b(parcel, a);
    }
}
