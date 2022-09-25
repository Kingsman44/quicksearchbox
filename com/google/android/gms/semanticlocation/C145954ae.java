package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.semanticlocation.ae */
/* compiled from: PG */
public final class C145954ae implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PlaceCandidate placeCandidate = null;
        AdditionalPlaceCandidates additionalPlaceCandidates = null;
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                f = C143946b.m234054c(parcel, readInt);
            } else if (c == 3) {
                f2 = C143946b.m234054c(parcel, readInt);
            } else if (c == 4) {
                placeCandidate = (PlaceCandidate) C143946b.m234063l(parcel, readInt, PlaceCandidate.CREATOR);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                additionalPlaceCandidates = (AdditionalPlaceCandidates) C143946b.m234063l(parcel, readInt, AdditionalPlaceCandidates.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new Visit(i, f, f2, placeCandidate, additionalPlaceCandidates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Visit[i];
    }
}
