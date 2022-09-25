package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.internal.ai */
/* compiled from: PG */
public final class C144920ai implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        long j = Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                locationRequest = (LocationRequest) C143946b.m234063l(parcel2, readInt, LocationRequest.CREATOR);
            } else if (c != 5) {
                switch (c) {
                    case 8:
                        z = C143946b.m234077z(parcel2, readInt);
                        break;
                    case 9:
                        z2 = C143946b.m234077z(parcel2, readInt);
                        break;
                    case 10:
                        str = C143946b.m234069r(parcel2, readInt);
                        break;
                    case 11:
                        z3 = C143946b.m234077z(parcel2, readInt);
                        break;
                    case 12:
                        z4 = C143946b.m234077z(parcel2, readInt);
                        break;
                    case 13:
                        str2 = C143946b.m234069r(parcel2, readInt);
                        break;
                    case 14:
                        j = C143946b.m234060i(parcel2, readInt);
                        break;
                    default:
                        C143946b.m234076y(parcel2, readInt);
                        break;
                }
            } else {
                arrayList = C143946b.m234073v(parcel2, readInt, ClientIdentity.CREATOR);
            }
        }
        C143946b.m234074w(parcel2, h);
        return new LocationRequestInternal(locationRequest, arrayList, z, z2, str, z3, z4, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestInternal[i];
    }
}
