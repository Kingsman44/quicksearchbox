package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public final class CertificateRequestInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146122a();

    /* renamed from: a */
    public String f394856a;

    /* renamed from: b */
    public byte[] f394857b;

    public CertificateRequestInformation() {
    }

    public CertificateRequestInformation(String str, byte[] bArr) {
        this.f394856a = str;
        this.f394857b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CertificateRequestInformation) {
            CertificateRequestInformation certificateRequestInformation = (CertificateRequestInformation) obj;
            return C143912ba.m233950b(this.f394856a, certificateRequestInformation.f394856a) && Arrays.equals(this.f394857b, certificateRequestInformation.f394857b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394856a, Integer.valueOf(Arrays.hashCode(this.f394857b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C146122a.m237994a(this, parcel);
    }
}
