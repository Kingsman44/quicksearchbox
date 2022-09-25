package com.google.android.gms.kids.parentaccess;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class ParentVerificationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144434b();

    /* renamed from: a */
    public ParentAccessToken f391040a;

    /* renamed from: b */
    public byte[] f391041b;

    private ParentVerificationResponse() {
    }

    public ParentVerificationResponse(ParentAccessToken parentAccessToken, byte[] bArr) {
        this.f391040a = parentAccessToken;
        this.f391041b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParentVerificationResponse) {
            ParentVerificationResponse parentVerificationResponse = (ParentVerificationResponse) obj;
            return C143912ba.m233950b(this.f391040a, parentVerificationResponse.f391040a) && Arrays.equals(this.f391041b, parentVerificationResponse.f391041b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f391040a, Integer.valueOf(Arrays.hashCode(this.f391041b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f391040a, i);
        C143947c.m234094m(parcel, 2, this.f391041b);
        C143947c.m234083b(parcel, a);
    }
}
