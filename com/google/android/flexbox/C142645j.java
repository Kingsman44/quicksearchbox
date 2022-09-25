package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayoutManager;

/* renamed from: com.google.android.flexbox.j */
/* compiled from: PG */
final class C142645j implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FlexboxLayoutManager.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FlexboxLayoutManager.SavedState[i];
    }
}
