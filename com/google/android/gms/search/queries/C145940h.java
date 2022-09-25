package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.queries.h */
/* compiled from: PG */
public final class C145940h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Status status = null;
        PhraseAffinityResponse phraseAffinityResponse = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) C143946b.m234063l(parcel, readInt, Status.CREATOR);
            } else if (c == 2) {
                phraseAffinityResponse = (PhraseAffinityResponse) C143946b.m234063l(parcel, readInt, PhraseAffinityResponse.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bundle = C143946b.m234061j(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetPhraseAffinityCall$Response(status, phraseAffinityResponse, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPhraseAffinityCall$Response[i];
    }
}
