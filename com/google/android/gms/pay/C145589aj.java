package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.aj */
/* compiled from: PG */
public final class C145589aj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        SortItem[] sortItemArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                sortItemArr = (SortItem[]) C143946b.m234047D(parcel, readInt, SortItem.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SortOrderInfo(i, sortItemArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SortOrderInfo[i];
    }
}
