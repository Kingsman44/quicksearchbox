package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.vision.face.internal.client.c */
/* compiled from: PG */
public final class C146313c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        LandmarkParcel[] landmarkParcelArr = null;
        ContourParcel[] contourParcelArr = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = -1.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 2:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 3:
                    f = C143946b.m234054c(parcel2, readInt);
                    break;
                case 4:
                    f2 = C143946b.m234054c(parcel2, readInt);
                    break;
                case 5:
                    f3 = C143946b.m234054c(parcel2, readInt);
                    break;
                case 6:
                    f4 = C143946b.m234054c(parcel2, readInt);
                    break;
                case 7:
                    f5 = C143946b.m234054c(parcel2, readInt);
                    break;
                case 8:
                    f6 = C143946b.m234054c(parcel2, readInt);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) C143946b.m234047D(parcel2, readInt, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f8 = C143946b.m234054c(parcel2, readInt);
                    break;
                case 11:
                    f9 = C143946b.m234054c(parcel2, readInt);
                    break;
                case 12:
                    f10 = C143946b.m234054c(parcel2, readInt);
                    break;
                case 13:
                    contourParcelArr = (ContourParcel[]) C143946b.m234047D(parcel2, readInt, ContourParcel.CREATOR);
                    break;
                case 14:
                    f7 = C143946b.m234054c(parcel2, readInt);
                    break;
                case 15:
                    f11 = C143946b.m234054c(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new FaceParcel(i, i2, f, f2, f3, f4, f5, f6, f7, landmarkParcelArr, f8, f9, f10, contourParcelArr, f11);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FaceParcel[i];
    }
}
