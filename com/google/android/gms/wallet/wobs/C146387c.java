package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.wobs.c */
/* compiled from: PG */
public final class C146387c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = new ArrayList();
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                str2 = C143946b.m234069r(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234073v(parcel, readInt, LabelValue.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new LabelValueRow(str, str2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LabelValueRow[i];
    }
}
