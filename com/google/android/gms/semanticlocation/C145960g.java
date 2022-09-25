package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.semanticlocation.g */
/* compiled from: PG */
public final class C145960g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234073v(parcel, readInt, PlaceCandidate.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new AdditionalPlaceCandidates(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdditionalPlaceCandidates[i];
    }
}
