package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.a */
/* compiled from: PG */
public final class C143342a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        VastAdsRequest vastAdsRequest = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 5:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    str7 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 10:
                    str8 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 11:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 12:
                    str9 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 13:
                    vastAdsRequest = (VastAdsRequest) C143946b.m234063l(parcel2, readInt, VastAdsRequest.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new AdBreakClipInfo(str, str2, j, str3, str4, str5, str6, str7, str8, j2, str9, vastAdsRequest);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdBreakClipInfo[i];
    }
}
