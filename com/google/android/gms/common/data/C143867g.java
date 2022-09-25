package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.common.data.g */
/* compiled from: PG */
public final class C143867g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                strArr = C143946b.m234048E(parcel, readInt);
            } else if (c == 2) {
                cursorWindowArr = (CursorWindow[]) C143946b.m234047D(parcel, readInt, CursorWindow.CREATOR);
            } else if (c == 3) {
                i3 = C143946b.m234057f(parcel, readInt);
            } else if (c == 4) {
                bundle = C143946b.m234061j(parcel, readInt);
            } else if (c != 1000) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i2 = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i3, bundle);
        dataHolder.f389963c = new Bundle();
        int i4 = 0;
        while (true) {
            String[] strArr2 = dataHolder.f389962b;
            if (i4 >= strArr2.length) {
                break;
            }
            dataHolder.f389963c.putInt(strArr2[i4], i4);
            i4++;
        }
        dataHolder.f389967g = new int[dataHolder.f389964d.length];
        int i5 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = dataHolder.f389964d;
            if (i < cursorWindowArr2.length) {
                dataHolder.f389967g[i] = i5;
                i5 += dataHolder.f389964d[i].getNumRows() - (i5 - cursorWindowArr2[i].getStartPosition());
                i++;
            } else {
                dataHolder.f389968h = i5;
                return dataHolder;
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
