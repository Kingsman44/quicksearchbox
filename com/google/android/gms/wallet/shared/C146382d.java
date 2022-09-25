package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wallet.shared.d */
/* compiled from: PG */
public final class C146382d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        ApplicationParameters applicationParameters = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                applicationParameters = (ApplicationParameters) C143946b.m234063l(parcel, readInt, ApplicationParameters.CREATOR);
            } else if (c == 4) {
                str2 = C143946b.m234069r(parcel, readInt);
            } else if (c == 5) {
                str3 = C143946b.m234069r(parcel, readInt);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str4 = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new BuyFlowConfig(str, applicationParameters, str2, str3, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BuyFlowConfig[i];
    }
}
