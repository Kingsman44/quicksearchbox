package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.i */
/* compiled from: PG */
final class C44513i implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AppBarLayout.BaseBehavior.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AppBarLayout.BaseBehavior.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new AppBarLayout.BaseBehavior.SavedState(parcel, classLoader);
    }
}
