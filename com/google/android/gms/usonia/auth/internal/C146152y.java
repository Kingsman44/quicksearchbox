package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.usonia.auth.internal.y */
/* compiled from: PG */
public final class C146152y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        CertificateRequestInformation certificateRequestInformation = null;
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                certificateRequestInformation = (CertificateRequestInformation) C143946b.m234063l(parcel, readInt, CertificateRequestInformation.CREATOR);
            } else if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bArr = C143946b.m234044A(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SignAppCertificateParams(certificateRequestInformation, str, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignAppCertificateParams[i];
    }
}
