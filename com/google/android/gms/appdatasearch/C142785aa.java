package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.aa */
/* compiled from: PG */
public final class C142785aa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        CorpusId corpusId = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                corpusId = (CorpusId) C143946b.m234063l(parcel, readInt, CorpusId.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bundle = C143946b.m234061j(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new PhraseAffinityCorpusSpec(corpusId, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PhraseAffinityCorpusSpec[i];
    }
}
