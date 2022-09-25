package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class SignAppCertificateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146152y();

    /* renamed from: a */
    public CertificateRequestInformation f394862a;

    /* renamed from: b */
    public String f394863b;

    /* renamed from: c */
    public byte[] f394864c;

    public SignAppCertificateParams() {
    }

    public SignAppCertificateParams(CertificateRequestInformation certificateRequestInformation, String str, byte[] bArr) {
        this.f394862a = certificateRequestInformation;
        this.f394863b = str;
        this.f394864c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignAppCertificateParams) {
            SignAppCertificateParams signAppCertificateParams = (SignAppCertificateParams) obj;
            return C143912ba.m233950b(this.f394862a, signAppCertificateParams.f394862a) && C143912ba.m233950b(this.f394863b, signAppCertificateParams.f394863b) && Arrays.equals(this.f394864c, signAppCertificateParams.f394864c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394862a, this.f394863b, Integer.valueOf(Arrays.hashCode(this.f394864c))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394862a, i);
        C143947c.m234106y(parcel, 2, this.f394863b);
        C143947c.m234094m(parcel, 3, this.f394864c);
        C143947c.m234083b(parcel, a);
    }
}
