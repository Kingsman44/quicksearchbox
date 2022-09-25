package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GooglePaymentMethodId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145618p();

    /* renamed from: a */
    public String f393647a;

    /* renamed from: b */
    public String f393648b;

    private GooglePaymentMethodId() {
    }

    public GooglePaymentMethodId(String str, String str2) {
        this.f393647a = str;
        this.f393648b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GooglePaymentMethodId) {
            GooglePaymentMethodId googlePaymentMethodId = (GooglePaymentMethodId) obj;
            return C143912ba.m233950b(this.f393647a, googlePaymentMethodId.f393647a) && C143912ba.m233950b(this.f393648b, googlePaymentMethodId.f393648b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393647a, this.f393648b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393647a);
        C143947c.m234106y(parcel, 2, this.f393648b);
        C143947c.m234083b(parcel, a);
    }
}
