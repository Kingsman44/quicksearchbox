package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.vision.text.internal.client.i */
/* compiled from: PG */
public final class C146334i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        SymbolBoxParcel[] symbolBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    symbolBoxParcelArr = (SymbolBoxParcel[]) C143946b.m234047D(parcel, readInt, SymbolBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel = (BoundingBoxParcel) C143946b.m234063l(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) C143946b.m234063l(parcel, readInt, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    f = C143946b.m234054c(parcel, readInt);
                    break;
                case 7:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 8:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new WordBoxParcel(symbolBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, str, f, str2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WordBoxParcel[i];
    }
}
