package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class PayCardArtInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145581ab();

    /* renamed from: a */
    public int f393678a;

    /* renamed from: b */
    public String f393679b;

    private PayCardArtInfo() {
    }

    public PayCardArtInfo(int i, String str) {
        this.f393678a = i;
        this.f393679b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayCardArtInfo) {
            PayCardArtInfo payCardArtInfo = (PayCardArtInfo) obj;
            return C143912ba.m233950b(Integer.valueOf(this.f393678a), Integer.valueOf(payCardArtInfo.f393678a)) && C143912ba.m233950b(this.f393679b, payCardArtInfo.f393679b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393678a), this.f393679b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393678a);
        C143947c.m234106y(parcel, 2, this.f393679b);
        C143947c.m234083b(parcel, a);
    }
}
