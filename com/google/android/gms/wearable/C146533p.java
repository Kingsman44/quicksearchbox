package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wearable.p */
/* compiled from: PG */
public final class C146533p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                uri = (Uri) C143946b.m234063l(parcel, readInt, Uri.CREATOR);
            } else if (c == 4) {
                bundle = C143946b.m234061j(parcel, readInt);
            } else if (c == 5) {
                bArr = C143946b.m234044A(parcel, readInt);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                j = C143946b.m234060i(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new PutDataRequest(uri, bundle, bArr, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PutDataRequest[i];
    }
}
