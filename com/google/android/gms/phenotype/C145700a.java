package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.phenotype.a */
/* compiled from: PG */
public final class C145700a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        Flag[] flagArr = null;
        String[] strArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                flagArr = (Flag[]) C143946b.m234047D(parcel, readInt, Flag.CREATOR);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                strArr = C143946b.m234048E(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new Configuration(i, flagArr, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Configuration[i];
    }
}
