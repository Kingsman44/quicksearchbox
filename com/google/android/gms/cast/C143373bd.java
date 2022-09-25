package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.bd */
/* compiled from: PG */
public final class C143373bd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    f = C143946b.m234054c(parcel2, readInt);
                    break;
                case 3:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 4:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 5:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 6:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 7:
                    i5 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    i6 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 9:
                    i7 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 10:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 11:
                    i8 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 12:
                    i9 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 13:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new TextTrackStyle(f, i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TextTrackStyle[i];
    }
}
