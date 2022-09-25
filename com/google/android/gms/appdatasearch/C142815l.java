package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.l */
/* compiled from: PG */
public final class C142815l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        RegisterSectionInfo registerSectionInfo = null;
        byte[] bArr = null;
        int i = -1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                registerSectionInfo = (RegisterSectionInfo) C143946b.m234063l(parcel, readInt, RegisterSectionInfo.CREATOR);
            } else if (c == 4) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bArr = C143946b.m234044A(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DocumentSection(str, registerSectionInfo, i, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DocumentSection[i];
    }
}
