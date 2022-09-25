package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetPayGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145612j();

    /* renamed from: a */
    public PayGlobalActionCard[] f393635a;

    /* renamed from: b */
    public int f393636b;

    private GetPayGlobalActionCardsResponse() {
    }

    public GetPayGlobalActionCardsResponse(PayGlobalActionCard[] payGlobalActionCardArr, int i) {
        this.f393635a = payGlobalActionCardArr;
        this.f393636b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPayGlobalActionCardsResponse) {
            GetPayGlobalActionCardsResponse getPayGlobalActionCardsResponse = (GetPayGlobalActionCardsResponse) obj;
            return Arrays.equals(this.f393635a, getPayGlobalActionCardsResponse.f393635a) && C143912ba.m233950b(Integer.valueOf(this.f393636b), Integer.valueOf(getPayGlobalActionCardsResponse.f393636b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f393635a)), Integer.valueOf(this.f393636b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 1, this.f393635a, i);
        C143947c.m234089h(parcel, 2, this.f393636b);
        C143947c.m234083b(parcel, a);
    }
}
