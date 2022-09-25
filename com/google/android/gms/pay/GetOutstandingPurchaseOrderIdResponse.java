package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetOutstandingPurchaseOrderIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145608f();

    /* renamed from: a */
    public long f393628a;

    private GetOutstandingPurchaseOrderIdResponse() {
    }

    public GetOutstandingPurchaseOrderIdResponse(long j) {
        this.f393628a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOutstandingPurchaseOrderIdResponse) {
            return C143912ba.m233950b(Long.valueOf(this.f393628a), Long.valueOf(((GetOutstandingPurchaseOrderIdResponse) obj).f393628a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f393628a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 1, this.f393628a);
        C143947c.m234083b(parcel, a);
    }
}
