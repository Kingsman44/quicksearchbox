package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.textfield.as */
/* compiled from: PG */
final class C44938as implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TextInputLayout.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TextInputLayout.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new TextInputLayout.SavedState(parcel, classLoader);
    }
}
