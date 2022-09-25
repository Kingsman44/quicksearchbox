package com.google.android.material.stateful;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.material.stateful.a */
/* compiled from: PG */
final class C44896a implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ExtendableSavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExtendableSavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ExtendableSavedState(parcel, classLoader);
    }
}
