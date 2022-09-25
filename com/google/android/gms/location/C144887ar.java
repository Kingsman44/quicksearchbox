package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.location.ar */
/* compiled from: PG */
public final class C144887ar implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        long j = 0;
        NetworkLocationStatus[] networkLocationStatusArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 2:
                    i3 = C143946b.m234057f(parcel, readInt);
                    break;
                case 3:
                    j = C143946b.m234060i(parcel, readInt);
                    break;
                case 4:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 5:
                    networkLocationStatusArr = (NetworkLocationStatus[]) C143946b.m234047D(parcel, readInt, NetworkLocationStatus.CREATOR);
                    break;
                case 6:
                    C143946b.m234077z(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new LocationAvailability(i, i2, i3, j, networkLocationStatusArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
