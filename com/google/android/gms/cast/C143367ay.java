package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.ay */
/* compiled from: PG */
public final class C143367ay implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) C143946b.m234063l(parcel2, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 4:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 5:
                    d = C143946b.m234053b(parcel2, readInt);
                    break;
                case 6:
                    d2 = C143946b.m234053b(parcel2, readInt);
                    break;
                case 7:
                    d3 = C143946b.m234053b(parcel2, readInt);
                    break;
                case 8:
                    jArr = C143946b.m234046C(parcel2, readInt);
                    break;
                case 9:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new MediaQueueItem(mediaInfo, i, z, d, d2, d3, jArr, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueItem[i];
    }
}
