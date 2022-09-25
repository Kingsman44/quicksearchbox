package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.semanticlocation.PlaceCandidate;

/* renamed from: com.google.android.gms.semanticlocation.q */
/* compiled from: PG */
public final class C145979q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PlaceCandidate.Identifier identifier = null;
        PlaceCandidate.Point point = null;
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                identifier = (PlaceCandidate.Identifier) C143946b.m234063l(parcel, readInt, PlaceCandidate.Identifier.CREATOR);
            } else if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                f = C143946b.m234054c(parcel, readInt);
            } else if (c == 4) {
                f2 = C143946b.m234054c(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                point = (PlaceCandidate.Point) C143946b.m234063l(parcel, readInt, PlaceCandidate.Point.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new PlaceCandidate(identifier, i, f, f2, point);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlaceCandidate[i];
    }
}
