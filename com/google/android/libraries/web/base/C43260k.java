package com.google.android.libraries.web.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.keys.ParcelableCallbackKeyMultimap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.base.k */
/* compiled from: PG */
public final class C43260k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        C69664n.m101061g(parcel2, "parcel");
        int readInt = parcel.readInt();
        LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
        for (int i = 0; i != readInt; i++) {
            linkedHashSet.add(parcel2.readParcelable(WebConfig.class.getClassLoader()));
        }
        boolean z = parcel.readInt() != 0;
        boolean z2 = parcel.readInt() != 0;
        Integer num = null;
        C43271v a = parcel.readInt() == 0 ? null : C43271v.m76361a(parcel.readString());
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        Integer num2 = num;
        String readString3 = parcel.readString();
        boolean z3 = parcel.readInt() != 0;
        boolean z4 = parcel.readInt() != 0;
        boolean z5 = parcel.readInt() != 0;
        boolean z6 = parcel.readInt() != 0;
        boolean z7 = parcel.readInt() != 0;
        boolean z8 = parcel.readInt() != 0;
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        boolean z9 = z5;
        ArrayList arrayList = new ArrayList(readInt3);
        for (int i2 = 0; i2 != readInt3; i2++) {
            arrayList.add(parcel2.readParcelable(WebConfig.class.getClassLoader()));
        }
        boolean z10 = parcel.readInt() != 0;
        C69664n.m101061g(parcel2, "parcel");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int readInt4 = parcel.readInt();
        int i3 = 0;
        while (i3 < readInt4) {
            WebFeature webFeature = (WebFeature) parcel2.readParcelable(WebFeature.class.getClassLoader());
            int i4 = readInt4;
            if (webFeature != null) {
                linkedHashMap.put(webFeature.mo41578c(), webFeature);
            }
            i3++;
            readInt4 = i4;
        }
        return new WebConfig(linkedHashSet, z, z2, a, readString, readString2, num2, readString3, z3, z4, z9, z6, z7, z8, readInt2, arrayList, z10, C69505av.m100875q(linkedHashMap), (ParcelableCallbackKeyMultimap) parcel2.readParcelable(WebConfig.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WebConfig[i];
    }
}
