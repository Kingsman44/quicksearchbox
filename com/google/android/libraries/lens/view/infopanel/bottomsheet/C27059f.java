package com.google.android.libraries.lens.view.infopanel.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.lens.view.infopanel.bottomsheet.LensResultPanelBottomsheetBehavior;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bottomsheet.f */
/* compiled from: PG */
final class C27059f implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LensResultPanelBottomsheetBehavior.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LensResultPanelBottomsheetBehavior.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new LensResultPanelBottomsheetBehavior.SavedState(parcel, classLoader);
    }
}
