package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.framework.media.b */
/* compiled from: PG */
public final class C143494b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        NotificationOptions notificationOptions = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 4:
                    iBinder = C143946b.m234062k(parcel, readInt);
                    break;
                case 5:
                    notificationOptions = (NotificationOptions) C143946b.m234063l(parcel, readInt, NotificationOptions.CREATOR);
                    break;
                case 6:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 7:
                    z2 = C143946b.m234077z(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new CastMediaOptions(str, str2, iBinder, notificationOptions, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CastMediaOptions[i];
    }
}
