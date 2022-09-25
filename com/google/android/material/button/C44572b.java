package com.google.android.material.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.google.android.material.button.b */
/* compiled from: PG */
final class C44572b implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MaterialButton.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MaterialButton.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new MaterialButton.SavedState(parcel, classLoader);
    }
}
