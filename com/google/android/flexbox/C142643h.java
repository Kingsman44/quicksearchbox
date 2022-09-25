package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayoutManager;

/* renamed from: com.google.android.flexbox.h */
/* compiled from: PG */
final class C142643h implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FlexboxLayoutManager.LayoutParams(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FlexboxLayoutManager.LayoutParams[i];
    }
}
