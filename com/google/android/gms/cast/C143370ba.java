package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.ba */
/* compiled from: PG */
public final class C143370ba implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList arrayList = null;
        AdBreakStatus adBreakStatus = null;
        VideoInfo videoInfo = null;
        MediaLiveSeekableRange mediaLiveSeekableRange = null;
        MediaQueueData mediaQueueData = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) C143946b.m234063l(parcel2, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 4:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 5:
                    d = C143946b.m234053b(parcel2, readInt);
                    break;
                case 6:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 7:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 9:
                    j3 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 10:
                    d2 = C143946b.m234053b(parcel2, readInt);
                    break;
                case 11:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 12:
                    jArr = C143946b.m234046C(parcel2, readInt);
                    break;
                case 13:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 14:
                    i5 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 15:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 16:
                    i6 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 17:
                    arrayList = C143946b.m234073v(parcel2, readInt, MediaQueueItem.CREATOR);
                    break;
                case 18:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 19:
                    adBreakStatus = (AdBreakStatus) C143946b.m234063l(parcel2, readInt, AdBreakStatus.CREATOR);
                    break;
                case 20:
                    videoInfo = (VideoInfo) C143946b.m234063l(parcel2, readInt, VideoInfo.CREATOR);
                    break;
                case 21:
                    mediaLiveSeekableRange = (MediaLiveSeekableRange) C143946b.m234063l(parcel2, readInt, MediaLiveSeekableRange.CREATOR);
                    break;
                case 22:
                    mediaQueueData = (MediaQueueData) C143946b.m234063l(parcel2, readInt, MediaQueueData.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new MediaStatus(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, arrayList, z2, adBreakStatus, videoInfo, mediaLiveSeekableRange, mediaQueueData);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaStatus[i];
    }
}
