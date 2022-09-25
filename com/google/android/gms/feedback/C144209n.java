package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.feedback.n */
/* compiled from: PG */
public final class C144209n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) C143946b.m234063l(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c == 3) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str2 = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new FileTeleporter(parcelFileDescriptor, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FileTeleporter[i];
    }
}
