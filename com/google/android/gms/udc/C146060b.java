package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.udc.b */
/* compiled from: PG */
public final class C146060b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                arrayList = C143946b.m234072u(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList2 = C143946b.m234072u(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DeviceDataUploadOptedInAccountsParcelable(arrayList, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceDataUploadOptedInAccountsParcelable[i];
    }
}
