package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.location.bg */
/* compiled from: PG */
public final class C144903bg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        long[] jArr = WifiScan.f391798a;
        int[] iArr = WifiScan.f391799b;
        int[] iArr2 = iArr;
        int[] iArr3 = iArr2;
        int[] iArr4 = iArr3;
        int[] iArr5 = iArr4;
        int[] iArr6 = iArr5;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 2:
                    jArr = C143946b.m234046C(parcel2, readInt);
                    break;
                case 3:
                    iArr = C143946b.m234045B(parcel2, readInt);
                    break;
                case 4:
                    iArr2 = C143946b.m234045B(parcel2, readInt);
                    break;
                case 5:
                    iArr3 = C143946b.m234045B(parcel2, readInt);
                    break;
                case 6:
                    iArr4 = C143946b.m234045B(parcel2, readInt);
                    break;
                case 7:
                    iArr5 = C143946b.m234045B(parcel2, readInt);
                    break;
                case 8:
                    iArr6 = C143946b.m234045B(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new WifiScan(j, jArr, iArr, iArr2, iArr3, iArr4, iArr5, iArr6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WifiScan[i];
    }
}
