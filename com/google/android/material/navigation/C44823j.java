package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.navigation.NavigationBarPresenter;

/* renamed from: com.google.android.material.navigation.j */
/* compiled from: PG */
final class C44823j implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new NavigationBarPresenter.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NavigationBarPresenter.SavedState[i];
    }
}
