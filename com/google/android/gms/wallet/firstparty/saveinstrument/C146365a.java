package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wallet.firstparty.saveinstrument.a */
/* compiled from: PG */
public final class C146365a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                strArr = C143946b.m234048E(parcel, readInt);
            } else if (c == 2) {
                iArr = C143946b.m234045B(parcel, readInt);
            } else if (c == 3) {
                remoteViews = (RemoteViews) C143946b.m234063l(parcel, readInt, RemoteViews.CREATOR);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bArr = C143946b.m234044A(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetSaveInstrumentDetailsResponse(strArr, iArr, remoteViews, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSaveInstrumentDetailsResponse[i];
    }
}
