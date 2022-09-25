package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.internal.d */
/* compiled from: PG */
final class C44744d implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CheckableImageButton.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CheckableImageButton.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CheckableImageButton.SavedState(parcel, classLoader);
    }
}
