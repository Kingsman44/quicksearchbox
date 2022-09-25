package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.maps.c */
/* compiled from: PG */
public final class C145006c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    b = C143946b.m234052a(parcel2, readInt);
                    break;
                case 3:
                    b2 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 4:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C143946b.m234063l(parcel2, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 7:
                    b4 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 8:
                    b5 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 9:
                    b6 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 10:
                    b7 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 11:
                    b8 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 12:
                    b9 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 14:
                    b10 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 15:
                    b11 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 16:
                    f = C143946b.m234066o(parcel2, readInt);
                    break;
                case 17:
                    f2 = C143946b.m234066o(parcel2, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) C143946b.m234063l(parcel2, readInt, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 20:
                    num = C143946b.m234067p(parcel2, readInt);
                    break;
                case 21:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12, num, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
