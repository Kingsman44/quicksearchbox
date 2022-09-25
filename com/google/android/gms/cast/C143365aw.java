package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.aw */
/* compiled from: PG */
public final class C143365aw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        MediaQueueContainerMetadata mediaQueueContainerMetadata = null;
        ArrayList arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
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
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 5:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    mediaQueueContainerMetadata = (MediaQueueContainerMetadata) C143946b.m234063l(parcel2, readInt, MediaQueueContainerMetadata.CREATOR);
                    break;
                case 7:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    arrayList = C143946b.m234073v(parcel2, readInt, MediaQueueItem.CREATOR);
                    break;
                case 9:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 10:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 11:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new MediaQueueData(str, str2, i, str3, mediaQueueContainerMetadata, i2, arrayList, i3, j, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueData[i];
    }
}
