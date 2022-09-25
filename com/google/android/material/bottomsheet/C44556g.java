package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.material.bottomsheet.g */
/* compiled from: PG */
final class C44556g implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BottomSheetBehavior.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomSheetBehavior.SavedState(parcel, classLoader);
    }
}
