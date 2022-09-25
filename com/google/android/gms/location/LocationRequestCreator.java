package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.libs.identity.ClientIdentity;

/* compiled from: PG */
public class LocationRequestCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(LocationRequest locationRequest, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, locationRequest.f391766a);
        C143947c.m234090i(parcel, 2, locationRequest.f391767b);
        C143947c.m234090i(parcel, 3, locationRequest.f391768c);
        C143947c.m234089h(parcel, 6, locationRequest.f391771f);
        C143947c.m234087f(parcel, 7, locationRequest.f391772g);
        C143947c.m234090i(parcel, 8, locationRequest.f391769d);
        C143947c.m234084c(parcel, 9, locationRequest.f391773h);
        C143947c.m234090i(parcel, 10, locationRequest.f391770e);
        C143947c.m234090i(parcel, 11, locationRequest.f391774i);
        C143947c.m234089h(parcel, 12, locationRequest.f391775j);
        C143947c.m234089h(parcel, 13, locationRequest.f391776k);
        C143947c.m234106y(parcel, 14, locationRequest.f391777l);
        C143947c.m234084c(parcel, 15, locationRequest.f391778m);
        C143947c.m234105x(parcel, 16, locationRequest.f391779n, i);
        C143947c.m234105x(parcel, 17, locationRequest.f391780o, i);
        C143947c.m234083b(parcel, a);
    }

    public LocationRequest createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        WorkSource workSource = new WorkSource();
        long j = 3600000;
        long j2 = 600000;
        long j3 = 0;
        long j4 = Long.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        long j6 = -1;
        String str = null;
        ClientIdentity clientIdentity = null;
        int i = 102;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 2:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 3:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 5:
                    j4 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 6:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 7:
                    f = C143946b.m234054c(parcel2, readInt);
                    break;
                case 8:
                    j3 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 9:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 10:
                    j5 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 11:
                    j6 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 12:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 13:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 14:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 15:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 16:
                    workSource = (WorkSource) C143946b.m234063l(parcel2, readInt, WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (ClientIdentity) C143946b.m234063l(parcel2, readInt, ClientIdentity.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new LocationRequest(i, j, j2, j3, j4, j5, i2, f, z, j6, i3, i4, str, z2, workSource, clientIdentity);
    }

    public LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
