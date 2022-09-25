package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class SignAppCertificateResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146153z();

    /* renamed from: a */
    public byte[] f394865a;

    private SignAppCertificateResult() {
    }

    public SignAppCertificateResult(byte[] bArr) {
        this.f394865a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignAppCertificateResult) {
            return Arrays.equals(this.f394865a, ((SignAppCertificateResult) obj).f394865a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f394865a))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 1, this.f394865a);
        C143947c.m234083b(parcel, a);
    }
}
