package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.vision.text.internal.client.d */
/* compiled from: PG */
public final class C146329d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        WordBoxParcel[] wordBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        BoundingBoxParcel boundingBoxParcel3 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    wordBoxParcelArr = (WordBoxParcel[]) C143946b.m234047D(parcel2, readInt, WordBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel = (BoundingBoxParcel) C143946b.m234063l(parcel2, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) C143946b.m234063l(parcel2, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    boundingBoxParcel3 = (BoundingBoxParcel) C143946b.m234063l(parcel2, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 6:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    f = C143946b.m234054c(parcel2, readInt);
                    break;
                case 8:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 10:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 11:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 12:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new LineBoxParcel(wordBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, boundingBoxParcel3, str, f, str2, i, z, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LineBoxParcel[i];
    }
}
