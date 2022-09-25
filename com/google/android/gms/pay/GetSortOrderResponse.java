package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetSortOrderResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145614l();

    /* renamed from: a */
    public SortOrderInfo f393640a;

    private GetSortOrderResponse() {
    }

    public GetSortOrderResponse(SortOrderInfo sortOrderInfo) {
        this.f393640a = sortOrderInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetSortOrderResponse) {
            return C143912ba.m233950b(this.f393640a, ((GetSortOrderResponse) obj).f393640a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393640a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393640a, i);
        C143947c.m234083b(parcel, a);
    }
}
