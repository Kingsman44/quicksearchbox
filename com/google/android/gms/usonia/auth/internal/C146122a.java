package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.usonia.auth.internal.a */
/* compiled from: PG */
public final class C146122a implements Parcelable.Creator {
    /* renamed from: a */
    static void m237994a(CertificateRequestInformation certificateRequestInformation, Parcel parcel) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, certificateRequestInformation.f394856a);
        C143947c.m234094m(parcel, 2, certificateRequestInformation.f394857b);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bArr = C143946b.m234044A(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new CertificateRequestInformation(str, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CertificateRequestInformation[i];
    }
}
