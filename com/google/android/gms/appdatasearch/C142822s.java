package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.s */
/* compiled from: PG */
public final class C142822s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                featureArr = (Feature[]) C143946b.m234047D(parcel, readInt, Feature.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GlobalSearchAppCorpusFeatures(str, featureArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchAppCorpusFeatures[i];
    }
}
