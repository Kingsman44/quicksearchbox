package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.av */
/* compiled from: PG */
public final class C143364av implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        double d = 0.0d;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 4) {
                arrayList = C143946b.m234073v(parcel, readInt, MediaMetadata.CREATOR);
            } else if (c == 5) {
                arrayList2 = C143946b.m234073v(parcel, readInt, WebImage.CREATOR);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                d = C143946b.m234053b(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new MediaQueueContainerMetadata(i, str, arrayList, arrayList2, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueContainerMetadata[i];
    }
}
