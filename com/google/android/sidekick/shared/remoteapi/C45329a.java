package com.google.android.sidekick.shared.remoteapi;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.sidekick.shared.remoteapi.a */
/* compiled from: PG */
final class C45329a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CardRenderingContext(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CardRenderingContext[i];
    }
}
