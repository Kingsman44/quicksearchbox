package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.semanticlocation.e */
/* compiled from: PG */
public final class C145958e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        float f = 0.0f;
        ActivityCandidate activityCandidate = null;
        AdditionalActivityCandidates additionalActivityCandidates = null;
        float f2 = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                f = C143946b.m234054c(parcel, readInt);
            } else if (c == 2) {
                f2 = C143946b.m234054c(parcel, readInt);
            } else if (c == 3) {
                activityCandidate = (ActivityCandidate) C143946b.m234063l(parcel, readInt, ActivityCandidate.CREATOR);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                additionalActivityCandidates = (AdditionalActivityCandidates) C143946b.m234063l(parcel, readInt, AdditionalActivityCandidates.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ActivityStartEvent(f, f2, activityCandidate, additionalActivityCandidates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityStartEvent[i];
    }
}
