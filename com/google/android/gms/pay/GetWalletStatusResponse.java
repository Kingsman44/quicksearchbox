package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetWalletStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145617o();

    /* renamed from: a */
    public boolean f393645a;

    /* renamed from: b */
    public int[] f393646b;

    private GetWalletStatusResponse() {
    }

    public GetWalletStatusResponse(boolean z, int[] iArr) {
        this.f393645a = z;
        this.f393646b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetWalletStatusResponse) {
            GetWalletStatusResponse getWalletStatusResponse = (GetWalletStatusResponse) obj;
            return C143912ba.m233950b(Boolean.valueOf(this.f393645a), Boolean.valueOf(getWalletStatusResponse.f393645a)) && Arrays.equals(this.f393646b, getWalletStatusResponse.f393646b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f393645a), Integer.valueOf(Arrays.hashCode(this.f393646b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f393645a);
        C143947c.m234099r(parcel, 2, this.f393646b);
        C143947c.m234083b(parcel, a);
    }
}
