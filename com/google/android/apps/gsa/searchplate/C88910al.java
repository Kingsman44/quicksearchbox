package com.google.android.apps.gsa.searchplate;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.searchplate.SimpleSearchText;

/* renamed from: com.google.android.apps.gsa.searchplate.al */
/* compiled from: PG */
final class C88910al implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SimpleSearchText.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SimpleSearchText.SavedState[i];
    }
}
