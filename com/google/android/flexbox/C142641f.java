package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayout;

/* renamed from: com.google.android.flexbox.f */
/* compiled from: PG */
final class C142641f implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FlexboxLayout.LayoutParams(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FlexboxLayout.LayoutParams[i];
    }
}
