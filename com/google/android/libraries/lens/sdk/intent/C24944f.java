package com.google.android.libraries.lens.sdk.intent;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.lens.sdk.intent.f */
/* compiled from: PG */
final class C24944f implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LensImage(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LensImage[i];
    }
}
