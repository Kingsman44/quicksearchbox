package com.google.android.gms.kids.parentaccess;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.kids.parentaccess.b */
/* compiled from: PG */
public final class C144434b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ParentAccessToken parentAccessToken = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                parentAccessToken = (ParentAccessToken) C143946b.m234063l(parcel, readInt, ParentAccessToken.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bArr = C143946b.m234044A(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ParentVerificationResponse(parentAccessToken, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParentVerificationResponse[i];
    }
}
