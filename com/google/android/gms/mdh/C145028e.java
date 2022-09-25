package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.mdh.e */
/* compiled from: PG */
public final class C145028e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        SyncStatus syncStatus = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = C143946b.m234073v(parcel, readInt, MdhFootprint.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                syncStatus = (SyncStatus) C143946b.m234063l(parcel, readInt, SyncStatus.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new MdhFootprintsReadResult(arrayList, syncStatus);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdhFootprintsReadResult[i];
    }
}
