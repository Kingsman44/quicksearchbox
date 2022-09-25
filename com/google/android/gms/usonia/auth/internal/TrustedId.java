package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class TrustedId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146123aa();

    /* renamed from: a */
    public String f394866a;

    /* renamed from: b */
    public byte[] f394867b;

    private TrustedId() {
    }

    public TrustedId(String str, byte[] bArr) {
        this.f394866a = str;
        this.f394867b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrustedId) {
            TrustedId trustedId = (TrustedId) obj;
            return C143912ba.m233950b(this.f394866a, trustedId.f394866a) && Arrays.equals(this.f394867b, trustedId.f394867b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394866a, Integer.valueOf(Arrays.hashCode(this.f394867b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f394866a);
        C143947c.m234094m(parcel, 2, this.f394867b);
        C143947c.m234083b(parcel, a);
    }
}
