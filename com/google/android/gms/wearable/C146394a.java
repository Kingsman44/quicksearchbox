package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wearable.a */
/* compiled from: PG */
public final class C146394a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        byte[] bArr = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = C143946b.m234044A(parcel, readInt);
            } else if (c == 3) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) C143946b.m234063l(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                uri = (Uri) C143946b.m234063l(parcel, readInt, Uri.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new Asset(bArr, str, parcelFileDescriptor, uri);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Asset[i];
    }
}
