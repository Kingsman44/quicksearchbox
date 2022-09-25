package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.t */
/* compiled from: PG */
public final class C142823t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        GlobalSearchApplicationInfo globalSearchApplicationInfo = null;
        GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr = null;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                globalSearchApplicationInfo = (GlobalSearchApplicationInfo) C143946b.m234063l(parcel, readInt, GlobalSearchApplicationInfo.CREATOR);
            } else if (c == 2) {
                globalSearchAppCorpusFeaturesArr = (GlobalSearchAppCorpusFeatures[]) C143946b.m234047D(parcel, readInt, GlobalSearchAppCorpusFeatures.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                z = C143946b.m234077z(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GlobalSearchApplication(globalSearchApplicationInfo, globalSearchAppCorpusFeaturesArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchApplication[i];
    }
}
