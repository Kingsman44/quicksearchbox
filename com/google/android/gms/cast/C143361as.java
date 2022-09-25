package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.as */
/* compiled from: PG */
public final class C143361as implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        MediaInfo mediaInfo = null;
        MediaQueueData mediaQueueData = null;
        Boolean bool = null;
        long[] jArr = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        double d = 0.0d;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) C143946b.m234063l(parcel2, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    mediaQueueData = (MediaQueueData) C143946b.m234063l(parcel2, readInt, MediaQueueData.CREATOR);
                    break;
                case 4:
                    bool = C143946b.m234064m(parcel2, readInt);
                    break;
                case 5:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 6:
                    d = C143946b.m234053b(parcel2, readInt);
                    break;
                case 7:
                    jArr = C143946b.m234046C(parcel2, readInt);
                    break;
                case 8:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 10:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 11:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 12:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 13:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, j, d, jArr, C143596v.m233275h(str), str2, str3, str4, str5, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaLoadRequestData[i];
    }
}
