package com.google.android.libraries.web.shared.contrib;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.keys.ParcelableCallbackKeyMultimap;
import java.util.LinkedHashSet;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.shared.contrib.e */
/* compiled from: PG */
public final class C44087e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "parcel");
        boolean z = parcel.readInt() != 0;
        int readInt = parcel.readInt();
        LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
        for (int i = 0; i != readInt; i++) {
            linkedHashSet.add(parcel.readParcelable(WebFeatureConfig.class.getClassLoader()));
        }
        return new WebFeatureConfig(z, linkedHashSet, parcel.readInt() != 0, parcel.readInt() != 0, (ParcelableCallbackKeyMultimap) parcel.readParcelable(WebFeatureConfig.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WebFeatureConfig[i];
    }
}
