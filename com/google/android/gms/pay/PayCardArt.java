package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class PayCardArt extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145580aa();

    /* renamed from: a */
    public PayCardArtInfo f393676a;

    /* renamed from: b */
    public Bitmap f393677b;

    private PayCardArt() {
    }

    public PayCardArt(PayCardArtInfo payCardArtInfo, Bitmap bitmap) {
        this.f393676a = payCardArtInfo;
        this.f393677b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayCardArt) {
            PayCardArt payCardArt = (PayCardArt) obj;
            return C143912ba.m233950b(this.f393676a, payCardArt.f393676a) && C143912ba.m233950b(this.f393677b, payCardArt.f393677b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393676a, this.f393677b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393676a, i);
        C143947c.m234105x(parcel, 2, this.f393677b, i);
        C143947c.m234083b(parcel, a);
    }
}
