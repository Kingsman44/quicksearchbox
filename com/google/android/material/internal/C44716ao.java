package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.material.internal.ao */
/* compiled from: PG */
final class C44716ao implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableSparseArray(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableSparseArray[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ParcelableSparseArray(parcel, classLoader);
    }
}
