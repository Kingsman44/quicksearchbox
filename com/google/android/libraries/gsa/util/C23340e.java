package com.google.android.libraries.gsa.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.gsa.util.e */
/* compiled from: PG */
final class C23340e implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, ParcelableList.class.getClassLoader());
        return new ParcelableList(C58485gu.m89842j(arrayList));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableList[i];
    }
}
