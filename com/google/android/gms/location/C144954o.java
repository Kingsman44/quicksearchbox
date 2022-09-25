package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.libs.identity.ClientIdentity;

/* renamed from: com.google.android.gms.location.o */
/* compiled from: PG */
public final class C144954o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        WorkSource workSource = new WorkSource();
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        String str = null;
        ClientIdentity clientIdentity = null;
        int i = 0;
        int i2 = 102;
        boolean z = false;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 2:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 3:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 4:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 5:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 6:
                    workSource = (WorkSource) C143946b.m234063l(parcel2, readInt, WorkSource.CREATOR);
                    break;
                case 7:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    clientIdentity = (ClientIdentity) C143946b.m234063l(parcel2, readInt, ClientIdentity.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new CurrentLocationRequest(j, i, i2, j2, z, i3, str, workSource, clientIdentity);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }
}
