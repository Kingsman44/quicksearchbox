package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.location.bc */
/* compiled from: PG */
public final class C144899bc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 2:
                    z2 = C143946b.m234077z(parcel, readInt);
                    break;
                case 3:
                    z3 = C143946b.m234077z(parcel, readInt);
                    break;
                case 4:
                    z4 = C143946b.m234077z(parcel, readInt);
                    break;
                case 5:
                    z5 = C143946b.m234077z(parcel, readInt);
                    break;
                case 6:
                    z6 = C143946b.m234077z(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
