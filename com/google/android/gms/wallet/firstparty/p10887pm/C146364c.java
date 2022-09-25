package com.google.android.gms.wallet.firstparty.p10887pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wallet.firstparty.pm.c */
/* compiled from: PG */
public final class C146364c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        byte[] bArr = null;
        SecurePaymentsData[] securePaymentsDataArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = C143946b.m234044A(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                securePaymentsDataArr = (SecurePaymentsData[]) C143946b.m234047D(parcel, readInt, SecurePaymentsData.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SecurePaymentsPayload(bArr, securePaymentsDataArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SecurePaymentsPayload[i];
    }
}
