package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.car.az */
/* compiled from: PG */
public final class C143114az implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int[] iArr = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i = 0;
        boolean z6 = false;
        int i2 = 0;
        int i3 = 0;
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
                    iArr = C143946b.m234045B(parcel, readInt);
                    break;
                case 6:
                    z5 = C143946b.m234077z(parcel, readInt);
                    break;
                case 7:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 8:
                    z6 = C143946b.m234077z(parcel, readInt);
                    break;
                case 9:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 10:
                    i3 = C143946b.m234057f(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new CarUiInfo(z, z2, z3, z4, iArr, z5, i, z6, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CarUiInfo[i];
    }
}
