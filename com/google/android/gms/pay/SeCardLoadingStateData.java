package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class SeCardLoadingStateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145584ae();

    /* renamed from: a */
    public int f393690a;

    /* renamed from: b */
    public GooglePaymentMethodId f393691b;

    /* renamed from: c */
    public SePrepaidCardId f393692c;

    private SeCardLoadingStateData() {
    }

    public SeCardLoadingStateData(int i, GooglePaymentMethodId googlePaymentMethodId, SePrepaidCardId sePrepaidCardId) {
        this.f393690a = i;
        this.f393691b = googlePaymentMethodId;
        this.f393692c = sePrepaidCardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeCardLoadingStateData) {
            SeCardLoadingStateData seCardLoadingStateData = (SeCardLoadingStateData) obj;
            return C143912ba.m233950b(Integer.valueOf(this.f393690a), Integer.valueOf(seCardLoadingStateData.f393690a)) && C143912ba.m233950b(this.f393691b, seCardLoadingStateData.f393691b) && C143912ba.m233950b(this.f393692c, seCardLoadingStateData.f393692c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393690a), this.f393691b, this.f393692c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393690a);
        C143947c.m234105x(parcel, 2, this.f393691b, i);
        C143947c.m234105x(parcel, 3, this.f393692c, i);
        C143947c.m234083b(parcel, a);
    }
}
