package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.ap */
/* compiled from: PG */
public final class C143358ap implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        MediaMetadata mediaMetadata = null;
        ArrayList arrayList = null;
        TextTrackStyle textTrackStyle = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        VastAdsRequest vastAdsRequest = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 4:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    mediaMetadata = (MediaMetadata) C143946b.m234063l(parcel2, readInt, MediaMetadata.CREATOR);
                    break;
                case 6:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 7:
                    arrayList = C143946b.m234073v(parcel2, readInt, MediaTrack.CREATOR);
                    break;
                case 8:
                    textTrackStyle = (TextTrackStyle) C143946b.m234063l(parcel2, readInt, TextTrackStyle.CREATOR);
                    break;
                case 9:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 10:
                    arrayList2 = C143946b.m234073v(parcel2, readInt, AdBreakInfo.CREATOR);
                    break;
                case 11:
                    arrayList3 = C143946b.m234073v(parcel2, readInt, AdBreakClipInfo.CREATOR);
                    break;
                case 12:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 13:
                    vastAdsRequest = (VastAdsRequest) C143946b.m234063l(parcel2, readInt, VastAdsRequest.CREATOR);
                    break;
                case 14:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 15:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 16:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 17:
                    str7 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 18:
                    str8 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new MediaInfo(str, i, str2, mediaMetadata, j, arrayList, textTrackStyle, str3, arrayList2, arrayList3, str4, vastAdsRequest, j2, str5, str6, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaInfo[i];
    }
}
