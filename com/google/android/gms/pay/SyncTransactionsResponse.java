package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class SyncTransactionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145590ak();

    /* renamed from: a */
    public boolean f393702a;

    /* renamed from: b */
    public byte[] f393703b;

    private SyncTransactionsResponse() {
    }

    public SyncTransactionsResponse(boolean z, byte[] bArr) {
        this.f393702a = z;
        this.f393703b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SyncTransactionsResponse) {
            SyncTransactionsResponse syncTransactionsResponse = (SyncTransactionsResponse) obj;
            return C143912ba.m233950b(Boolean.valueOf(this.f393702a), Boolean.valueOf(syncTransactionsResponse.f393702a)) && Arrays.equals(this.f393703b, syncTransactionsResponse.f393703b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f393702a), Integer.valueOf(Arrays.hashCode(this.f393703b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f393702a);
        C143947c.m234094m(parcel, 2, this.f393703b);
        C143947c.m234083b(parcel, a);
    }
}
