package com.google.android.libraries.search.assistant.invocation.utils;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.search.assistant.invocation.utils.g */
/* compiled from: PG */
public final class C34723g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, ParcelableList.class.getClassLoader());
        return ParcelableList.m63448a(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableList[i];
    }
}
