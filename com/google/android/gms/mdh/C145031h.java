package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mdh.h */
/* compiled from: PG */
public final class C145031h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        SyncSubPolicy syncSubPolicy = null;
        SyncSubPolicy syncSubPolicy2 = null;
        SyncSubPolicy syncSubPolicy3 = null;
        SyncSubPolicy syncSubPolicy4 = null;
        Integer num = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 2:
                    syncSubPolicy = (SyncSubPolicy) C143946b.m234063l(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 3:
                    syncSubPolicy2 = (SyncSubPolicy) C143946b.m234063l(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 4:
                    syncSubPolicy3 = (SyncSubPolicy) C143946b.m234063l(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 5:
                    syncSubPolicy4 = (SyncSubPolicy) C143946b.m234063l(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 6:
                    num = C143946b.m234067p(parcel, readInt);
                    break;
                case 7:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 8:
                    z2 = C143946b.m234077z(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new SyncPolicy(i, syncSubPolicy, syncSubPolicy2, syncSubPolicy3, syncSubPolicy4, num, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SyncPolicy[i];
    }
}
