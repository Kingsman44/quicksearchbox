package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.s */
/* compiled from: PG */
public final class C145621s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PassType[] passTypeArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String[] strArr4 = null;
        String[] strArr5 = null;
        PassSaveTypeFilter passSaveTypeFilter = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    passTypeArr = (PassType[]) C143946b.m234047D(parcel, readInt, PassType.CREATOR);
                    break;
                case 2:
                    strArr = C143946b.m234048E(parcel, readInt);
                    break;
                case 3:
                    strArr2 = C143946b.m234048E(parcel, readInt);
                    break;
                case 4:
                    strArr3 = C143946b.m234048E(parcel, readInt);
                    break;
                case 5:
                    strArr4 = C143946b.m234048E(parcel, readInt);
                    break;
                case 6:
                    strArr5 = C143946b.m234048E(parcel, readInt);
                    break;
                case 7:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 8:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 9:
                    passSaveTypeFilter = (PassSaveTypeFilter) C143946b.m234063l(parcel, readInt, PassSaveTypeFilter.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new PassFilter(passTypeArr, strArr, strArr2, strArr3, strArr4, strArr5, z, i, passSaveTypeFilter);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PassFilter[i];
    }
}
