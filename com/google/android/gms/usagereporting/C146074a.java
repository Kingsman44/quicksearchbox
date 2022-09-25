package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.usagereporting.a */
/* compiled from: PG */
public final class C146074a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                bArr = C143946b.m234044A(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234070s(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ConsentInformation.AccountConsentInformation(str, bArr, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConsentInformation.AccountConsentInformation[i];
    }
}
